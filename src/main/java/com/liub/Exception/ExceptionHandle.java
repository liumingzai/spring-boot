package com.liub.Exception;

import com.liub.domain.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import util.ResultUtil;

/**
 * ExceptionHandle
 * 异常捕获
 * 会修改浏览器默认的异常返回
 *  {
 "code": 100,
 "msg": "普通用户",
 "data": null
 }
 * @author： liubing           @email： liubing@proudsmart.com
 * @date： 2017/7/21.  @version：${VERSION}
 */

@ControllerAdvice
public class ExceptionHandle {

    private final Logger logger = LoggerFactory.getLogger(ExceptionHandle.class);

    @ExceptionHandler(value = Exception.class )  //补获异常类
    @ResponseBody
    public Result handle(Exception e){
        //为了让code可以自定义，我们自定义了UserException
        if(e instanceof UserException) {
            return ResultUtil.error(((UserException) e).getCode(),e.getMessage());
        }else {
            //比如调用getRoleByUserId/2 发现2在数据库不存在就会抛出系统异常NullPointerException
            logger.info("系统异常 {}",e);
            return ResultUtil.error(-1,"未知异常");
        }
    }
}
