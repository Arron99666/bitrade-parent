package cn.ztuo.bitrade.vendor.provider;


import com.aliyuncs.dysmsapi.model.v20170525.SendSmsResponse;

public interface SMSProvider {


    /**
     * 发送验证码短信
     *
     * @param mobile     手机号
     * @param verifyCode 验证码
     * @return
     * @throws Exception
     */
    default SendSmsResponse sendVerifyMessage(String mobile, String verifyCode) throws Exception {
        return sendVerifyMessage(mobile, verifyCode);
    }


}
