package com.luv2code.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class PointcutExpressions {


    @Pointcut("execution(* com.luv2code.aopdemo.dao.*.*(..))")
    public void forDaoPackage(){
        System.out.println("Logging");
    }

    @Pointcut("execution(* com.luv2code.aopdemo.dao.*.get*())")
    public void forGetters(){
        System.out.println("This is a getter");
    }

}
