package com.example.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Siwde on 2017/4/11.
 */

@Aspect//定义一个切面
@Component//把普通pojo实例化到spring容器中，相当于配置文件中的<bean id="" class=""/>
public class HttpAspect {

    //日志使用的是spring自带的slf4j
    private final static Logger logger = LoggerFactory.getLogger(HttpAspect.class);

    //定义切点的切入点(com.example.controller.GirlController下的所有public方法，不论参数多少)
    @Pointcut("execution(public * com.example.controller.GirlController.*(..))")
    public void log(){
    }

    //在执行切入点方法前执行的方法，传入切入点对象
    //用来做日志记录
    @Before("log()")
    public void doBefore(JoinPoint joinPoint){
        ServletRequestAttributes attributes = (ServletRequestAttributes)RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        //url
        logger.info("url={}",request.getRequestURL());
        //ip
        logger.info("ip={}",request.getRemoteAddr());
        //method请求方式
        logger.info("method={}",request.getMethod());
        //类方法  查询joinPoint.getSignature()
        logger.info("类方法={}",joinPoint.getSignature().getDeclaringTypeName()+"."+joinPoint.getSignature().getName());
        //参数
        logger.info("参数={}",joinPoint.getArgs());
    }

    @After("log()")
    public void doAfter(){
        logger.info("后置操作");
    }

    //拦截方法返回值（抛异常不属于返回值？）
    @AfterReturning(returning = "object",pointcut = "log()")
    public void doAfterReturning(Object object){
        System.out.println("拦截返回值");
        logger.info("renturn={}",object.toString());
    }
}
