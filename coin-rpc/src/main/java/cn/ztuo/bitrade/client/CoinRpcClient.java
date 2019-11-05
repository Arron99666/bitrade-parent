package cn.ztuo.bitrade.client;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.googlecode.jsonrpc4j.Base64;
import com.googlecode.jsonrpc4j.JsonRpcHttpClient;

@Component
@Configuration 
public class CoinRpcClient {
	
	private Logger LOG = LoggerFactory.getLogger(getClass());
	
	@Value("${btc.rpc.user}")
	private  String user; //验证用户名
	@Value("${btc.rpc.password}")
	private  String password; //验证密码
	@Value("${btc.rpc.allowip}")
	private  String allowip; //验证ip
	@Value("${btc.rpc.port}")
	private  String port; //验证端口
	
	private JsonRpcHttpClient client = null;
	 
	// 比特币身份认证
	public JsonRpcHttpClient getClient() {
		try {
			if(null == client) {
				String cred = Base64.encodeBytes((user + ":" + password).getBytes());
				Map<String, String> headers = new HashMap<String, String>(1);
				headers.put("Authorization", "Basic " + cred);
				client = new JsonRpcHttpClient(new URL("http://" + allowip + ":" + port), headers);
			}
		} catch (Exception e) {
			LOG.info("===com.bscoin.bit.env.CoinRpcClient:{} btc client !===",e.getMessage(),e);
		}
		return client;
	}
	 
}
