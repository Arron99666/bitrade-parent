package cn.ztuo.bitrade;

import cn.ztuo.bitrade.filter.TokenFilter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

/**
 * 网关启动类，Zuul ⾃带了负载均衡功能，
 */

@Slf4j
@SpringBootApplication
@EnableZuulProxy            //包含了 @EnableZuulServer ，设置该类是⽹关的启动类。
@EnableDiscoveryClient
public class GatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatewayApplication.class, args);
        log.info("启动服务网关...");
    }

    @Bean
    public TokenFilter tokenFilter(){
        return new TokenFilter();
    }

}
