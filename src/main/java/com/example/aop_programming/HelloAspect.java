package com.example.aop_programming;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class HelloAspect {


    @Around("@annotation(HelloAnnotation)")
    private void aroundHello(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("aroundHello");
        joinPoint.proceed();
    }

//    @Before("execution(String com.example.aop_programming.Hello.Hello())")
//    private void beforeHello(){
//        System.out.println("beforeHello");
//    }
//
//    @After("execution(String com.example.aop_programming.Hello.Hello())")
//    private void aftreHello(){
//        System.out.println("aftreHello");
//    }

}
