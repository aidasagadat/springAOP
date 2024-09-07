package com.luv2code.aopdemo.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {


    @Pointcut("execution(* com.luv2code.aopdemo.dao.*.*(..))")
    private void forDaoPackage(){
        System.out.println("Logging");
    }

    @Before("forDaoPackage()")
    public void beforeAddAccountAdvice(){
        System.out.println("Logging");
        System.out.println("\n Checking credentials...");
    }

    @After("forDaoPackage()")
    public void afterDaoPackageMethods(){
        System.out.println("Logging");
        System.out.println("SUCCESS");
    }


    @Before("forDaoPackage()")
    public void logToCloudAsync(){
        System.out.println("CLOUD Logging");
        System.out.println("\n Checking credentials...");
    }



}
