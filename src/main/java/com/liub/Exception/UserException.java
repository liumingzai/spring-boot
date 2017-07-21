package com.liub.Exception;

import com.liub.enums.ResultEnum;

/**
 * UserException
 * RutimeException 会进行事物回滚，Exception不会，前者继承后者
 * @author： liubing           @email： liubing@proudsmart.com
 * @date： 2017/7/21.  @version：${VERSION}
 */
public class UserException  extends RuntimeException{


    private Integer code;

    public UserException(ResultEnum resultEnum) {
        super(resultEnum.getMsg());
        this.code = resultEnum.getCode();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
