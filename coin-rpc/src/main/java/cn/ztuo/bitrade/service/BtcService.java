package cn.ztuo.bitrade.service;

import java.util.Map;

import cn.ztuo.bitrade.exception.CoinException;

public interface BtcService {
	
		/**
		 * 生成新地址
		 * @param account
		 * @param addressType
		 * @return
		 * @throws CoinException
		 */
		Object getnewaddress(String  account) throws  CoinException;
	  
	    /**
	     * @throws Throwable 
	     * @throws Exception   
	    * @Title: validateaddress 验证钱包地址是否有效  
	    * @param @param address
	    * @param @return    参数  
	    * @return boolean    返回类型  
	    * @throws  
	    */  
	  boolean validateAddress(String address) throws  CoinException;
	  
	    
	    /**
	     * @throws CoinException   
	    * @Title: getBalance  
	    * @param @param account
	    * @param @return    参数  
	    * @return Object    返回类型  
	    * @throws  
	    */  
	  double getBalance(String  account) throws CoinException;
	
	    
	    /**
	     * @throws CoinException   
	    * @Title: signSendToAddress  
	    * @param @param address
	    * @param @param amount
	    * @param @return    参数  
	    * @return Object    返回类型  
	    * @throws  
	    * <amount>是一个实数，并四舍五入到小数点后8位。如果成功，则返回事务ID <txid>
	    */  
	Object signSendToAddress(String address,double amount) throws CoinException;
	  
	    
	    /**
	     * @throws CoinException   
	    * @Title: multiSendToAddress  
	    * @param @param fromaccount
	    * @param @param target
	    * @param @return    参数  
	    * @return Object    返回类型  
	    * @throws  
	    */  
	Object multiSendToAddress(String fromaccount,Object target) throws CoinException;
	  
	    
	    /**
	     * @throws CoinException   
	    * @Title: getTransaction  
	    * @param @param txId
	    * @param @return    参数  
	    * @return Object    返回类型  
	    * @throws  
	    */  
	Object getTrawtransaction(String txId,int verbose) throws CoinException;
	  
	  
	    /**  
	    * @Title: createrawTransaction  
	    * @param @param transferInfo
	    * @param @return
	    * @param @throws CoinException    参数  
	    * @return Object    返回类型  
	    * @throws  
	    */  
	Object createrawTransaction(Object transferInfo,Object sendInfo) throws CoinException;
	
	  
	    /**  
	    * @Title: signrawTransaction  
	    * @param @param hexstring
	    * @param @param transferInfo
	    * @param @return
	    * @param @throws CoinException    参数  
	    * @return Object    返回类型  
	    * @throws  
	    */  
	Object signrawTransaction(String hexstring, Object transferInfo) throws CoinException;
	
	  
	    /**  
	    * @Title: sendrawTransaction  
	    * @param @param hexHash
	    * @param @return
	    * @param @throws CoinException    参数  
	    * @return Object    返回类型  
	    * @throws  
	    */  
	    
	Object sendrawTransaction(String hexHash) throws CoinException;
	
	
	  
	    /**  
	    * @Title: decoderawtransaction  
	    * @param @param hex
	    * @param @return
	    * @param @throws CoinException    参数  
	    * @return Object    返回类型  
	    * @throws  
	    */  
	Object decoderawtransaction(String hex) throws CoinException;
	    /**  
	    * @Title: getTransaction  
	    * @param @param txId
	    * @param @return
	    * @param @throws CoinException    参数  
	    * @return Object    返回类型  
	    * @throws  
	    */  
	    
	Object getTransaction(String txId) throws CoinException;
	
	    /**
	     * @throws CoinException   
	    * @Title: setAccount  
	    * @param @param address
	    * @param @param account
	    * @param @return    参数  
	    * @return Object    返回类型  
	    * @throws  
	    */  
	Object setAccount(String address,String account) throws CoinException;
	
	  
	    /**  
	    * @Title: listReceivedByAddress  
	    * @param @param minconf
	    * @param @return
	    * @param @throws CoinException    参数  
	    * @return Object    返回类型  
	    * @throws  
	    */  
	Object listReceivedByAddress(int minconf) throws CoinException;
	
	  
	    /**  
	    * @Title: settxfee  
	    * @param @param account
	    * @param @return
	    * @param @throws CoinException    参数  
	    * @return Object    返回类型  
	    * @throws  
	    */  
	    
	boolean settxfee(double account) throws CoinException;
	
	  
	    /**  
	    * @Title: encryptwallet  
	    * @param @param passphrase
	    * @param @return
	    * @param @throws CoinException    参数  
	    * @return Object    返回类型  
	    * @throws  
	    */  
	    
	Object encryptwallet(String passphrase) throws CoinException;
	
	  
	    /**  
	    * @Title: walletpassphrase  
	    * @param @param passphrase
	    * @param @param timeout
	    * @param @return
	    * @param @throws CoinException    参数  
	    * @return Object    返回类型  
	    * @throws  
	    */  
	    
	Object walletpassphrase(String passphrase,int timeout) throws CoinException;
	
	
	  
	    /**  
	    * @Title: blockCount  
	    * @param @return
	    * @param @throws CoinException    参数  
	    * @return Object    返回类型  
	    * @throws  
	    */  
	Object getBlockCount() throws CoinException;
	
	  
	    /**  
	    * @Title: getBlockHash  
	    * @param @param index
	    * @param @return
	    * @param @throws CoinException    参数  
	    * @return Object    返回类型  
	    * @throws  
	    */  
	Object getBlockHash(int index) throws CoinException;
	  
	    /**  
	    * @Title: getblock  
	    * @param @param blockHash
	    * @param @return
	    * @param @throws CoinException    参数  
	    * @return Object    返回类型  
	    * @throws  
	    */  
	Object getblock(String blockHash) throws CoinException;

	/**
	 * 
	 * @param label
	 * @return
	 */
	Object getaddressesbylabel(String label) throws CoinException;

	/**
	 * 获取地址信息
	 * @param address
	 * @return
	 */
	Object getaddressinfo(String address);

	/**
	 * 获取最近交易
	 * @param includeWatchOnly 
	 * @param skip 
	 * @param count 
	 * @param label 
	 * @return
	 */
	Object listtransactions(Map<String, Object> paramMap);
	
}
