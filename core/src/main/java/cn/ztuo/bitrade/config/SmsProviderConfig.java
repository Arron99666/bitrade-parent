package cn.ztuo.bitrade.config;

import cn.ztuo.bitrade.vendor.provider.SMSProvider;
import cn.ztuo.bitrade.vendor.provider.support.AliYunSMSProvider;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SmsProviderConfig {

    private String accessKeyId;
    @Value("${access.key.secret:}")
    private String accessKeySecret;
    private String signName;


    @Bean
    public SMSProvider getSMSProvider(@Value("${sms.driver:}") String driverName) {
        return new AliYunSMSProvider(accessKeyId,accessKeySecret,signName);
//        if (StringUtils.isEmpty(driverName)) {
//            return new ChuangRuiSMSProvider(gateway, username, password, sign,accessKey,accessSecret);
//        }
//        if (driverName.equalsIgnoreCase(ChuangRuiSMSProvider.getName())) {
//            return new ChuangRuiSMSProvider(gateway, username, password, sign,accessKey,accessSecret);
//        } else if (driverName.equalsIgnoreCase(EmaySMSProvider.getName())) {
//            return new EmaySMSProvider(gateway, username, password);
//        }else if (driverName.equalsIgnoreCase(HuaXinSMSProvider.getName())) {
//            return new HuaXinSMSProvider(gateway, username, password,internationalGateway,internationalUsername,internationalPassword,sign);
//        }  else {
//            return null;
//        }
    }
}
