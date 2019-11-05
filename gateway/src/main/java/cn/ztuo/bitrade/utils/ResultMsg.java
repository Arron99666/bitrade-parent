package cn.ztuo.bitrade.utils;

import lombok.Data;

@Data
public class ResultMsg<T> {
    /**
     * 返回码
     */
    private Integer code;

    /**
     * 返回信息
     */
    private String msg;

    /**
     * 返回的数据
     */
    private T data;

    public ResultMsg(){

    }
}
