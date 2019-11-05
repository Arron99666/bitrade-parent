package cn.ztuo.bitrade.service;

import java.util.Map;
import java.util.Set;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import cn.ztuo.bitrade.client.CoinRpcClient;
import cn.ztuo.bitrade.exception.CoinException;

@Service
public class BtcServiceImpl implements BtcService {
	
	private Logger LOG = LoggerFactory.getLogger("btc");
	
	@Autowired
	private CoinRpcClient client;
	
	@Override
	public boolean validateAddress(String address) throws CoinException {
		try {
			Object invoke = client.getClient().invoke("validateaddress", new Object[] { address }, Object.class);
			String res = JSONObject.toJSONString(invoke);
			if (!StringUtils.isEmpty(res)) {
				JSONObject obj = JSON.parseObject(res);
				if (obj.getBoolean("isvalid") == true) {
					return true;
				}
			}
		} catch (Throwable e) {
			LOG.info("=== com.bscoin.bit.service.btc.BtcServiceImpl.validateAddress(String):{} ===", e.getMessage(), e);
			throw new CoinException(e.getMessage() + String.format("[params]: address=%s", address));
		}
		return false;
	}
	
	@Override
	public double getBalance(String account) throws CoinException {
		double balance;
		try {
			if (!StringUtils.isEmpty(account)) {
				balance = (double) client.getClient().invoke("getbalance", new Object[] { account }, Object.class);
			} else {
				balance = (double) client.getClient().invoke("getbalance", new Object[] {}, Object.class);
			}
		} catch (Throwable e) {
			LOG.info("=== com.bscoin.bit.service.btc.BtcServiceImpl.getBalance(String...):{} ===", e.getMessage(), e);
			throw new CoinException(e.getMessage() + String.format("[params]: account=%s", account));
		}
		return balance;
	}
	
	@Override
	public Object signSendToAddress(String address, double amount) throws CoinException {
		try {
			String txId = client.getClient().invoke("sendtoaddress", new Object[] { address, amount }, Object.class).toString();
			return txId;
		} catch (Throwable e) {
			LOG.info("=== com.bscoin.bit.service.btc.BtcServiceImpl.signSendToAddress(String, double):{} ===", e.getMessage(), e);
			throw new CoinException(e.getMessage() + String.format("[params]: address=%s,amount=%s", address, amount));
		}
	}
	
	@Override
	public Object multiSendToAddress(String fromaccount, Object target) throws CoinException {
		try {
			String txId = client.getClient().invoke("sendmany", new Object[] { fromaccount, target }, Object.class).toString();
			return txId;
		} catch (Throwable e) {
			LOG.info("=== com.bscoin.bit.service.btc.BtcServiceImpl.signSendToAddress(String, double):{} ===", e.getMessage(), e);
			throw new CoinException(e.getMessage() + String.format("[params]: fromaccount=%s,target=%s", fromaccount, target));
		}
	}
	
	@Override
	public Object getTrawtransaction(String txId, int verbose) throws CoinException {
		try {
			return client.getClient().invoke("getrawtransaction", new Object[] { txId, verbose }, Object.class);
		} catch (Throwable e) {
			LOG.info("=== com.bscoin.bit.service.btc.BtcServiceImpl.getTrawtransaction(String):{} ===", e.getMessage(), e);
			throw new CoinException(e.getMessage() + String.format("[params]: txId=%s", txId));
		}
	}
	
	@Override
	public Object getTransaction(String txId) throws CoinException {
		try {
			return client.getClient().invoke("gettransaction", new Object[] { txId }, Object.class);
		} catch (Throwable e) {
			LOG.info("=== com.bscoin.bit.service.btc.BtcServiceImpl.getTransaction(String):{} ===", e.getMessage(), e);
			throw new CoinException(e.getMessage() + String.format("[params]: txId=%s", txId));
		}
	}
	
	@Override
	public Object setAccount(String address, String account) throws CoinException {
		try {
			return client.getClient().invoke("setaccount", new Object[] { address, account }, Object.class);
		} catch (Throwable e) {
			LOG.info("=== com.bscoin.bit.service.btc.BtcServiceImpl.setAccount(String, String):{} ===", e.getMessage(), e);
			throw new CoinException(e.getMessage() + String.format("[params]: address=%s,account=%s", address, account));
		}
	}
	
	@Override
	public Object listReceivedByAddress(int minconf) throws CoinException {
		try {
			if (1 != minconf) {
				return client.getClient().invoke("listreceivedbyaccount", new Object[] { minconf }, Object.class);
			} else {
				return client.getClient().invoke("listreceivedbyaccount", new Object[] {}, Object.class);
			}
		} catch (Throwable e) {
			LOG.info("=== com.bscoin.bit.service.btc.BtcServiceImpl.listReceivedByAddress(int minconf):{} ===", e.getMessage(), e);
			throw new CoinException(e.getMessage() + String.format("[params]: minconf=%s", minconf));
		}
	}
	
	@Override
	public boolean settxfee(double account) throws CoinException {
		try {
			return client.getClient().invoke("settxfee", new Object[] { account }, boolean.class);
		} catch (Throwable e) {
			LOG.info("=== com.bscoin.bit.service.btc.impl.BtcServiceImpl.settxfee(double):{} ===", e.getMessage(), e);
			throw new CoinException(e.getMessage() + String.format("[params]: account=%s", account));
		}
	}
	
	@Override
	public Object encryptwallet(String passphrase) throws CoinException {
		try {
			return client.getClient().invoke("encryptwallet", new Object[] { passphrase }, Object.class);
		} catch (Throwable e) {
			LOG.info("=== com.bscoin.bit.service.btc.impl.BtcServiceImpl.encryptwallet(String) ===", e.getMessage(), e);
			throw new CoinException(e.getMessage());
		}
	}
	
	@Override
	public Object walletpassphrase(String passphrase, int timeout) throws CoinException {
		try {
			return client.getClient().invoke("walletpassphrase", new Object[] { passphrase, timeout }, Object.class);
		} catch (Throwable e) {
			LOG.info("=== com.bscoin.bit.service.btc.impl.BtcServiceImpl.walletpassphrase(String, int):{} ===", e.getMessage(), e);
			throw new CoinException(e.getMessage() + String.format("[params]: passphrase=%s,timeout=%s", passphrase, timeout));
		}
	}
	
	@Override
	public Object createrawTransaction(Object transferInfo, Object sendInfo) throws CoinException {
		try {
			return client.getClient().invoke("createrawtransaction", new Object[] { transferInfo, sendInfo }, Object.class);
		} catch (Throwable e) {
			LOG.info("=== com.bscoin.bit.service.btc.impl.BtcServiceImpl.createrawTransaction(Object):{} ===", e.getMessage(), e);
			throw new CoinException(e.getMessage() + String.format("[params]: transferInfo=%s,sendInfo=%s", transferInfo, sendInfo));
		}
	}
	
	@Override
	public Object signrawTransaction(String hexstring, Object transferInfo) throws CoinException {
		try {
			return client.getClient().invoke("signrawtransaction", new Object[] { hexstring, transferInfo }, Object.class);
		} catch (Throwable e) {
			LOG.info("=== com.bscoin.bit.service.btc.impl.BtcServiceImpl.signrawTransaction(String, Object):{} ===", e.getMessage(), e);
			throw new CoinException(e.getMessage() + String.format("[params]: hexstring=%s,transferInfo=%s", hexstring, transferInfo));
		}
	}
	
	@Override
	public Object sendrawTransaction(String hexHash) throws CoinException {
		try {
			return client.getClient().invoke("sendrawtransaction", new Object[] { hexHash }, Object.class);
		} catch (Throwable e) {
			LOG.info("=== com.bscoin.bit.service.btc.impl.BtcServiceImpl.sendrawTransaction(String):{} ===", e.getMessage(), e);
			throw new CoinException(e.getMessage() + String.format("[params]: hexHash=%s", hexHash));
		}
	}
	
 
	@Override
	public Object decoderawtransaction(String hex) throws CoinException {
		try {
			return client.getClient().invoke("decoderawtransaction", new Object[] { hex }, Object.class);
		} catch (Throwable e) {
			LOG.info("=== com.wallet.bit.service.btc.impl.BtcServiceImpl.decoderawtransaction(String):{} ===", e.getMessage(), e);
			throw new CoinException(e.getMessage() + String.format("[params]: hex=%s", hex));
		}
	}
 
 
	@Override
	public Object getBlockCount() throws CoinException {
		try {
			return client.getClient().invoke("getblockcount", new Object[] {}, Object.class);
		} catch (Throwable e) {
			LOG.info("=== com.wallet.bit.service.btc.impl.BtcServiceImpl.getBlockCount():{} ===", e.getMessage(), e);
			throw new CoinException(e.getMessage());
		}
	}
 
	@Override
	public Object getBlockHash(int index) throws CoinException {
		try {
			return client.getClient().invoke("getblockhash", new Object[]{index}, Object.class);
		} catch (Throwable e) {
			LOG.info("=== com.wallet.bit.service.btc.impl.BtcServiceImpl.getBlockHash(int):{} ===", e.getMessage(), e);
			throw new CoinException(e.getMessage() + String.format("[params]: index=%s", index));
		}
	}
	
	
	@Override
	public Object getblock(String blockHash) throws CoinException {
		try {
			return client.getClient().invoke("getblock", new Object[] { blockHash }, Object.class);
		} catch (Throwable e) {
			LOG.info("=== com.bscoin.bit.service.btc.impl.BtcServiceImpl.getblock(String):{} ===", e.getMessage(), e);
			throw new CoinException(e.getMessage() + String.format("[params]: blockHash=%s", blockHash));
		}
	}

	@Override
	public Object getnewaddress(String account) throws CoinException {
		try {
			return client.getClient().invoke("getnewaddress", new Object[] { account}, Object.class);
		} catch (Throwable e) {
			LOG.info("=== com.bscoin.bit.service.btc.impl.BtcServiceImpl.getnewaddress(String):{} ===", e.getMessage(), e);
			throw new CoinException(e.getMessage() + String.format("[params]: account=%s", account));
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public Object getaddressesbylabel(String label) throws CoinException {
		Object invoke = null;
		try {
			invoke = client.getClient().invoke("getaddressesbylabel", new Object[] { label }, Object.class);
		} catch (Throwable e) {
			LOG.info("=== com.bscoin.bit.service.btc.impl.BtcServiceImpl.getaddressesbylabel(String):{} ===", e.getMessage(), e);
			throw new CoinException(e.getMessage() + String.format("[params]: label=%s", label));
		}
		Map<String, Object> addressesMap = JSONObject.parseObject(JSONObject.toJSONString(invoke), Map.class);
		Set<String> addressess = addressesMap.keySet();
		return addressess;
	}

	@Override
	public Object getaddressinfo(String address) {
		Object invoke = null;
		try {
			invoke = client.getClient().invoke("getaddressinfo", new Object[] { address }, Object.class);
		} catch (Throwable e) {
			LOG.info("=== com.bscoin.bit.service.btc.impl.BtcServiceImpl.getaddressinfo(String):{} ===", e.getMessage(), e);
			throw new CoinException(e.getMessage() + String.format("[params]: address=%s", address));
		}
		return invoke;
	}

	@Override
	public Object listtransactions(Map<String, Object> paramMap) {
		String label = String.valueOf(paramMap.get("label"));
		int count = Integer.parseInt(String.valueOf(paramMap.get("count")));
		int skip = Integer.parseInt(String.valueOf(paramMap.get("skip")));
		boolean includeWatchOnly = (boolean) paramMap.get("includeWatchOnly");
		Object invoke = null;
		try {
			invoke = client.getClient().invoke("listtransactions", new Object[] {label,count,skip,includeWatchOnly}, Object.class);
		} catch (Throwable e) {
			LOG.info("=== com.bscoin.bit.service.btc.impl.BtcServiceImpl.listtransactions():{} ===", e.getMessage(), e);
			throw new CoinException(e.getMessage());
		}
		return invoke;
	}
 
}
