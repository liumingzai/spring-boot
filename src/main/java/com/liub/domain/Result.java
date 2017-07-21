package com.liub.domain;

/**
 * Result
 * 返回包装类
 * @author： liubing           @email： liubing@proudsmart.com
 * @date： 2017/7/21.  @version：${VERSION}
 */
public class Result<T> {

    private Integer code;

    private String msg;

    private T data;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
