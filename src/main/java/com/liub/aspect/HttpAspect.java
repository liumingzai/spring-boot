package com.liub.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * HttpAspect
 * aop面向切面
 * @author： liubing           @email： liubing@proudsmart.com
 * @date： 2017/7/20.  @version：${VERSION}
 */

@Aspect
@Component
public class HttpAspect {

    //选org.slf4j，底层使用的是logbash
    private final static Logger logger = LoggerFactory.getLogger(HttpAspect.class);


   /* //拦截的方法
    @Before("execution(public * com.liub.controller.UserController.*(..))")
    public void log(){
        System.out.println("I am before method");
    }

    @After("execution(public * com.liub.controller.UserController.*(..))")
    public void doAfter(){
        System.out.println("I am after method");
    }*/

    @Pointcut("execution(public * com.liub.controller.UserController.*(..))")
    public void log(){

    }

    @Before("log()")
    public void doBefore(JoinPoint joinPoint){
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        //url={}会把数据放入{}中
        logger.info("url={} ",request.getRequestURL());
        //method
        logger.info("method={}",request.getMethod());
        //ip
        logger.info("ip={}",request.getRemoteAddr());
        //类方法
        logger.info("class_ method={} ",joinPoint.getSignature().getDeclaringTypeName() + "." +joinPoint.getSignature().getName()); //类名.类方法
        //参数
        logger.info("args={} ", joinPoint.getArgs());
    }

    @After("log()")
    public void doAfter(){
        logger.info("222222222222222222");
    }


    /**
     * 获取浏览器response返回的内容
     *localhost:8080/findByUserName/admin
     * response={}[User, {id=1, userName=admin, userPass=admin}, User, {id=4, userName=admin, userPass=123}, User, {id=5, userName=admin, userPass=123456}]
     * @param obj
     */
    @AfterReturning(returning = "obj",pointcut = "log()")
    public  void doAfterReturning(Object obj){
        logger.info("response={}" + obj.toString());
    }

}
