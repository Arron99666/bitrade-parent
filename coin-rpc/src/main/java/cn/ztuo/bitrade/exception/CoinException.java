package cn.ztuo.bitrade.exception;

public class CoinException extends RuntimeException{

	private static final long serialVersionUID = 7833283455112352655L;
    private String errCode;

    public CoinException(String errCode, String message) {
        super(message);
        this.errCode = errCode;
    }

    public CoinException() {
    }

    public CoinException(String message) {
        super(message);
    }

    public CoinException(String message, Throwable cause) {
        super(message, cause);
    }

    public CoinException(Throwable cause) {
        super(cause);
    }

    protected CoinException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public String getErrCode() {
        return this.errCode;
    }

    public static CoinException error(String errCode, String errMsg) {
        return new CoinException(errCode, errMsg);
    }
}
