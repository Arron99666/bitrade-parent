package cn.ztuo.bitrade.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

@Slf4j
@Component
public class TokenFilter extends ZuulFilter {

    @Autowired
    private StringRedisTemplate redisTemplate;


    //排除过滤的 URI 地址
    private static final String[] IGNORE_URIS = {
            "uc/check/login",
            "/uc/login",
            "/uc/"

    };




    @Override
    public String filterType() {
        return "pre"; // 可以在请求被路由之前调用
    }

    @Override
    public int filterOrder() {
        return 0; // filter执行顺序，通过数字指定 ,优先级为0，数字越大，优先级越低
    }

    @Override
    public boolean shouldFilter() {
        return true; // 是否执行该过滤器，此处为true，说明需要过滤
    }

    @Override
    public Object run() {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        log.info("-->>> TokenFilter{},{}", request.getMethod(), request.getRequestURL().toString());

        String token = request.getHeader("x-auth-token");// 获取请求的token
        System.err.println("=====>页面传来的token值为:" + token);

        if(token == null || "".equals(token.trim())){
            ctx.setSendZuulResponse(false);
            ctx.setResponseStatusCode(HttpStatus.UNAUTHORIZED.value());
        }

        return null;


//        if (StringUtils.isNotBlank(token)) {
//            ctx.setSendZuulResponse(true); //对请求进行路由
//            ctx.setResponseStatusCode(HttpStatus.OK.value());   //200
//            ctx.set("isSuccess", true);
//            return null;
//        } else {
//            ctx.setSendZuulResponse(false); //不对其进行路由
//            ctx.setResponseStatusCode(HttpStatus.UNAUTHORIZED.value()); //401
//            ctx.setResponseBody("token is empty");
//            ctx.set("isSuccess", false);
//            return null;
//        }
    }


}
