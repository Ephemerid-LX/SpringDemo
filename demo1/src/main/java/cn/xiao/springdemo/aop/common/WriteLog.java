package cn.xiao.springdemo.aop.common;

import org.aspectj.lang.ProceedingJoinPoint;

public class WriteLog {

    public void before() {
        System.out.println("before");
    }

    public void afterReturn() {
        System.out.println("afterReturn");
    }

    public void after() {
        System.out.println("after(finally)");
    }
    public void exception() {
        System.out.println("exception");
    }

    public void around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("around before");
        pjp.proceed();
        System.out.println("around after");
    }
}

