package cn.ztuo.bitrade.controller;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;

import cn.ztuo.bitrade.domain.MessageResult;
import cn.ztuo.bitrade.service.BtcService;

@RestController
@RequestMapping("/rpc")
public class BtcController {

	@Autowired
	private BtcService btcService;
	
	@GetMapping("/address/{account}")
	public MessageResult getnewaddress(@PathVariable String account) {
		MessageResult result = new MessageResult();
		result.setData(btcService.getnewaddress(account));
		return result;
	}
	
	@PostMapping("/validateAddress")
	public boolean validateAddress(String address) {
        return btcService.validateAddress(address);
    }
	
	@PostMapping("/getBalance")
	public double getBalance(String account) {
        return btcService.getBalance(account);
    }
	
	@SuppressWarnings("unchecked")
	@PostMapping("/getaddressesbylabel")
	public Set<String> getaddressesbylabel(String label) {
		return (Set<String>) btcService.getaddressesbylabel(label);
	}
	
	@SuppressWarnings("unchecked")
	@PostMapping("/getaddressinfo")
	public Map<String, Object> getaddressinfo(String address) {
		Map<String, Object> addressesInfoMap = JSONObject.parseObject(JSONObject.toJSONString(btcService.getaddressinfo(address)), Map.class);
		return addressesInfoMap;
    }
	
	@GetMapping("/transfer")
	public String signSendToAddress(String address, double amount) {
        return btcService.signSendToAddress(address, amount).toString();
    }
	
	@PostMapping("/settxfee")
	public boolean settxfee(double account) {
		return btcService.settxfee(account);
	}
	
	@SuppressWarnings("unchecked")
	@PostMapping("/listtransactions")
	public List<Map<String, Object>> listtransactions(@RequestBody Map<String, Object> paramMap) {
        return (List<Map<String, Object>>) btcService.listtransactions(paramMap);
    }
	
}
