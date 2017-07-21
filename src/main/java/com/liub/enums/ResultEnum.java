package com.liub.enums;

/**
 * ResultEnum
 * 原因是code和mssage在异常中没有规则
 * 方便改动，只要用到ADMIN的要把msg修改，只改枚举即可，不用逐个类改
 * @author： liubing           @email： liubing@proudsmart.com
 * @date： 2017/7/21.  @version：${VERSION}
 */
public enum ResultEnum {
    UNKONW_ERROR(-1,"未知错误"),
    SUCCESS(0,"success"),
    ADMIN(101,"管理员"),
    SUPER_ADMIN(102,"高级管理员"),
    USER(103,"普通用户")
    ;

    /**
     * 枚举只定义get方法即可，set基本上是不用
     */
    private Integer code;
    private String msg;

    ResultEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
