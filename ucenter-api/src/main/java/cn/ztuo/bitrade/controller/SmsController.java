package cn.ztuo.bitrade.controller;

import cn.ztuo.bitrade.constant.SysConstant;
import cn.ztuo.bitrade.entity.Country;
import cn.ztuo.bitrade.entity.Member;
import cn.ztuo.bitrade.entity.transform.AuthMember;
import cn.ztuo.bitrade.service.CountryService;
import cn.ztuo.bitrade.service.LocaleMessageSourceService;
import cn.ztuo.bitrade.service.MemberService;
import cn.ztuo.bitrade.util.*;
import cn.ztuo.bitrade.vendor.provider.SMSProvider;
import com.aliyuncs.dysmsapi.model.v20170525.SendSmsResponse;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import static cn.ztuo.bitrade.constant.SysConstant.SESSION_MEMBER;
import static cn.ztuo.bitrade.util.MessageResult.error;
import static cn.ztuo.bitrade.util.MessageResult.success;

/**
 * @author GS
 * @date 2018年01月08日
 */
@Slf4j
@RestController
@RequestMapping("/mobile")
public class SmsController {

    @Autowired
    private SMSProvider smsProvider;
    @Autowired
    private RedisTemplate redisTemplate;
    @Autowired
    private MemberService memberService;
    @Resource
    private LocaleMessageSourceService localeMessageSourceService;
    @Autowired
    private CountryService countryService;

    /**
     * 注册验证码发送
     *
     * @return
     */
    @PostMapping("/code")
    public MessageResult sendCheckCode(String phone, String country) throws Exception {
        Assert.isTrue(!memberService.phoneIsExist(phone), localeMessageSourceService.getMessage("PHONE_ALREADY_EXISTS"));
        Assert.notNull(country, localeMessageSourceService.getMessage("REQUEST_ILLEGAL"));
        Country country1 = countryService.findOne(country);
        Assert.notNull(country1, localeMessageSourceService.getMessage("REQUEST_ILLEGAL"));
        ValueOperations valueOperations = redisTemplate.opsForValue();
        String key = SysConstant.PHONE_REG_CODE_PREFIX + phone;
        Object code = valueOperations.get(key);
        if (code != null) {
            //判断如果请求间隔小于一分钟则请求失败
            if (!BigDecimalUtils.compare(DateUtil.diffMinute((Date) (valueOperations.get(key + "Time"))), BigDecimal.ONE)) {
                return error(localeMessageSourceService.getMessage("FREQUENTLY_REQUEST"));
            }
        }
        String randomCode = String.valueOf(GeneratorUtil.getRandomNumber(100000, 999999));
        SendSmsResponse sendSmsResponse;
        if ("86".equals(country1.getAreaCode())) {
            Assert.isTrue(ValidateUtil.isMobilePhone(phone.trim()), localeMessageSourceService.getMessage("PHONE_EMPTY_OR_INCORRECT"));
            sendSmsResponse = smsProvider.sendVerifyMessage(phone, randomCode);

        } else {
            sendSmsResponse = null;
        }
        if (sendSmsResponse.getCode().equals("OK")) {
            valueOperations.getOperations().delete(key);
            valueOperations.getOperations().delete(key + "Time");
            // 缓存验证码
            valueOperations.set(key, randomCode, 10, TimeUnit.MINUTES);
            valueOperations.set(key + "Time", new Date(), 10, TimeUnit.MINUTES);
            return success(localeMessageSourceService.getMessage("SEND_SMS_SUCCESS"));
        } else {
            return error(localeMessageSourceService.getMessage("SEND_SMS_FAILED"));
        }
    }

    /**
     * 重置交易密码验证码
     *
     * @param user
     * @return
     */
    @RequestMapping(value = "/transaction/code", method = RequestMethod.POST)
    public MessageResult sendResetTransactionCode(String phone,@SessionAttribute(SESSION_MEMBER) AuthMember user) throws Exception {
        Member member = memberService.findOne(user.getId());
        Assert.hasText(member.getMobilePhone(), localeMessageSourceService.getMessage("NOT_BIND_PHONE"));
        String randomCode = String.valueOf(GeneratorUtil.getRandomNumber(100000, 999999));
        SendSmsResponse sendSmsResponse;
        if ("86".equals(member.getCountry().getAreaCode())) {
            sendSmsResponse = smsProvider.sendVerifyMessage(phone, randomCode);
        } else {
            sendSmsResponse = null;
        }
        if (sendSmsResponse.getCode() == "ok") {
            ValueOperations valueOperations = redisTemplate.opsForValue();
            String key = SysConstant.PHONE_RESET_TRANS_CODE_PREFIX + member.getMobilePhone();
            valueOperations.getOperations().delete(key);
            // 缓存验证码
            valueOperations.set(key, randomCode, 10, TimeUnit.MINUTES);
            return success(localeMessageSourceService.getMessage("SEND_SMS_SUCCESS"));
        } else {
            return error(localeMessageSourceService.getMessage("SEND_SMS_FAILED"));
        }
    }

    /**
     * 绑定手机号验证码
     *
     * @param phone
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/bind/code", method = RequestMethod.POST)
    public MessageResult setBindPhoneCode(String country, String phone, @SessionAttribute(SESSION_MEMBER) AuthMember user) throws Exception {
        Member member = memberService.findOne(user.getId());
        Assert.isNull(member.getMobilePhone(), localeMessageSourceService.getMessage("REPEAT_PHONE_REQUEST"));
        SendSmsResponse sendSmsResponse;
        String randomCode = String.valueOf(GeneratorUtil.getRandomNumber(100000, 999999));

        // 修改所在国家
        if (StringUtils.isNotBlank(country)) {
            Country one = countryService.findOne(country);
            if (one != null) {
                member.setCountry(one);
                memberService.saveAndFlush(member);
            }
        }


        if ("86".equals(member.getCountry().getAreaCode())) {
            if (!ValidateUtil.isMobilePhone(phone.trim())) {
                return error(localeMessageSourceService.getMessage("PHONE_EMPTY_OR_INCORRECT"));
            }
            sendSmsResponse = smsProvider.sendVerifyMessage(phone, randomCode);
        } else {
            sendSmsResponse = null;
        }
        if (sendSmsResponse.getCode() == "ok") {
            ValueOperations valueOperations = redisTemplate.opsForValue();
            String key = SysConstant.PHONE_BIND_CODE_PREFIX + phone;
            valueOperations.getOperations().delete(key);
            // 缓存验证码
            valueOperations.set(key, randomCode, 10, TimeUnit.MINUTES);
            return success(localeMessageSourceService.getMessage("SEND_SMS_SUCCESS"));
        } else {
            return error(localeMessageSourceService.getMessage("SEND_SMS_FAILED"));
        }
    }

    /**
     * 更改登录密码验证码
     *
     * @param user
     * @return
     */
    @RequestMapping(value = "/update/password/code", method = RequestMethod.POST)
    public MessageResult updatePasswordCode(@SessionAttribute(SESSION_MEMBER) AuthMember user) throws Exception {
        Member member = memberService.findOne(user.getId());
        Assert.hasText(member.getMobilePhone(), localeMessageSourceService.getMessage("NOT_BIND_PHONE"));
        ValueOperations valueOperations = redisTemplate.opsForValue();
        String key = SysConstant.PHONE_UPDATE_PASSWORD_PREFIX + member.getMobilePhone();
        Object code = valueOperations.get(key);
        if (code != null) {
            //判断如果请求间隔小于一分钟则请求失败
            if (!BigDecimalUtils.compare(DateUtil.diffMinute((Date) (valueOperations.get(key + "Time"))), BigDecimal.ONE)) {
                return error(localeMessageSourceService.getMessage("FREQUENTLY_REQUEST"));
            }
        }
        SendSmsResponse sendSmsResponse;
        String randomCode = String.valueOf(GeneratorUtil.getRandomNumber(100000, 999999));
        if ("86".equals(member.getCountry().getAreaCode())) {
            sendSmsResponse = smsProvider.sendVerifyMessage(member.getMobilePhone(), randomCode);
        } else {
            sendSmsResponse= null;
        }
        if (sendSmsResponse.getCode() == "ok") {
            valueOperations.getOperations().delete(key);
            valueOperations.getOperations().delete(key + "Time");
            // 缓存验证码
            valueOperations.set(key, randomCode, 10, TimeUnit.MINUTES);
            valueOperations.set(key + "Time", new Date(), 10, TimeUnit.MINUTES);
            return success(localeMessageSourceService.getMessage("SEND_SMS_SUCCESS"));
        } else {
            return error(localeMessageSourceService.getMessage("SEND_SMS_FAILED"));
        }
    }

    @RequestMapping(value = "/add/address/code", method = RequestMethod.POST)
    public MessageResult addAddressCode(@SessionAttribute(SESSION_MEMBER) AuthMember user) throws Exception {
        Member member = memberService.findOne(user.getId());
        Assert.hasText(member.getMobilePhone(), localeMessageSourceService.getMessage("NOT_BIND_PHONE"));
        SendSmsResponse sendSmsResponse;
        String randomCode = String.valueOf(GeneratorUtil.getRandomNumber(100000, 999999));
        if ("86".equals(member.getCountry().getAreaCode())) {
            sendSmsResponse = smsProvider.sendVerifyMessage(member.getMobilePhone(), randomCode);
        } else {
            sendSmsResponse = null;
        }
        if (sendSmsResponse.getCode() == "ok") {
            ValueOperations valueOperations = redisTemplate.opsForValue();
            String key = SysConstant.PHONE_ADD_ADDRESS_PREFIX + member.getMobilePhone();
            valueOperations.getOperations().delete(key);
            // 缓存验证码
            valueOperations.set(key, randomCode, 10, TimeUnit.MINUTES);
            return success(localeMessageSourceService.getMessage("SEND_SMS_SUCCESS"));
        } else {
            return error(localeMessageSourceService.getMessage("SEND_SMS_FAILED"));
        }
    }



    @RequestMapping(value = "/withdraw/code", method = RequestMethod.POST)
    public MessageResult withdrawCode(@SessionAttribute(SESSION_MEMBER) AuthMember user) throws Exception {
        Member member = memberService.findOne(user.getId());
        Assert.hasText(member.getMobilePhone(), localeMessageSourceService.getMessage("NOT_BIND_PHONE"));
        SendSmsResponse sendSmsResponse;
        log.info("===提币验证码发送===mobile："+member.getMobilePhone());
        String randomCode = String.valueOf(GeneratorUtil.getRandomNumber(100000, 999999));
        if ("86".equals(member.getCountry().getAreaCode())) {
            sendSmsResponse = smsProvider.sendVerifyMessage(member.getMobilePhone(), randomCode);
        } else {
            sendSmsResponse = null;
        }
        if (sendSmsResponse.getCode() == "ok") {
            ValueOperations valueOperations = redisTemplate.opsForValue();
            String key = SysConstant.PHONE_WITHDRAW_MONEY_CODE_PREFIX + member.getMobilePhone();
            valueOperations.getOperations().delete(key);
            // 缓存验证码
            valueOperations.set(key, randomCode, 10, TimeUnit.MINUTES);
            return success(localeMessageSourceService.getMessage("SEND_SMS_SUCCESS"));
        } else {
            return error(localeMessageSourceService.getMessage("SEND_SMS_FAILED"));
        }
    }

    /**
     * 忘记密码验证码
     */
    @RequestMapping(value = "/reset/code", method = RequestMethod.POST)
    public MessageResult resetPasswordCode(String account) throws Exception {
        Member member = memberService.findByPhone(account);
        Assert.notNull(member, localeMessageSourceService.getMessage("MEMBER_NOT_EXISTS"));
        SendSmsResponse sendSmsResponse;
        String randomCode = String.valueOf(GeneratorUtil.getRandomNumber(100000, 999999));
        if ("86".equals(member.getCountry().getAreaCode())) {
            sendSmsResponse = smsProvider.sendVerifyMessage(member.getMobilePhone(), randomCode);
        } else {
            sendSmsResponse = null;
        }
        if (sendSmsResponse.getCode() == "ok") {
            ValueOperations valueOperations = redisTemplate.opsForValue();
            String key = SysConstant.RESET_PASSWORD_CODE_PREFIX + member.getMobilePhone();
            valueOperations.getOperations().delete(key);
            // 缓存验证码
            valueOperations.set(key, randomCode, 10, TimeUnit.MINUTES);
            return success(localeMessageSourceService.getMessage("SEND_SMS_SUCCESS"));
        } else {
            return error(localeMessageSourceService.getMessage("SEND_SMS_FAILED"));
        }
    }

    /**
     * 更改手机验证码
     */
    @RequestMapping(value = "/change/code", method = RequestMethod.POST)
    public MessageResult resetPhoneCode(@SessionAttribute(SESSION_MEMBER) AuthMember user) throws Exception {
        Member member = memberService.findOne(user.getId());
        Assert.hasText(member.getMobilePhone(), localeMessageSourceService.getMessage("NOT_BIND_PHONE"));
        SendSmsResponse sendSmsResponse;
        String randomCode = String.valueOf(GeneratorUtil.getRandomNumber(100000, 999999));
        if ("86".equals(member.getCountry().getAreaCode())) {
            sendSmsResponse = smsProvider.sendVerifyMessage(member.getMobilePhone(), randomCode);
        } else {
            sendSmsResponse = null;
        }
        if (sendSmsResponse.getCode() == "ok") {
            ValueOperations valueOperations = redisTemplate.opsForValue();
            String key = SysConstant.PHONE_CHANGE_CODE_PREFIX + member.getMobilePhone();
            valueOperations.getOperations().delete(key);
            // 缓存验证码
            valueOperations.set(key, randomCode, 10, TimeUnit.MINUTES);
            return success(localeMessageSourceService.getMessage("SEND_SMS_SUCCESS"));
        } else {
            return error(localeMessageSourceService.getMessage("SEND_SMS_FAILED"));
        }
    }


}

