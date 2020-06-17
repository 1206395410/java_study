package com.demo.diy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;


@Aspect
public class AnnotationPointCut {
    @Before("execution(* com.demo.service.UserServiceImpl.*(..))")
    public void before(){
        System.out.println("========方法执行前==========");
    }
    @After("execution(* com.demo.service.UserServiceImpl.*(..))")
    public void after(){
        System.out.println("========方法执行后===========");
    }
    @Around("execution(* com.demo.service.UserServiceImpl.*(..))")
    public void around(ProceedingJoinPoint jp) throws Throwable {
        System.out.println("环绕前");

        Signature signature = jp.getSignature();
        System.out.println(signature);

        Object proceed = jp.proceed();
        System.out.println("环绕后");
    }
}
