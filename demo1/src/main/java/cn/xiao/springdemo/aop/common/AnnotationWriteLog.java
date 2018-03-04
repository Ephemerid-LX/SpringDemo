package cn.xiao.springdemo.aop.common;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect  //配置切面
public class AnnotationWriteLog {
    @Before("execution(* cn.xiao.springdemo.aop.service.AopService.*(..))")  //before advice
    public void before() {
        System.out.println("before");
    }

    @AfterReturning("execution(* cn.xiao.springdemo.aop.service.AopService.*(..))") //after returning advice
    public void afterReturn() {
        System.out.println("afterReturn");
    }

    @After("execution(* cn.xiao.springdemo.aop.service.AopService.*(..))")  //after(finally) advice
    public void after() {
        System.out.println("after(finally)");
    }

    @AfterThrowing("execution(* cn.xiao.springdemo.aop.service.AopService.*(..))")  //after throwing advice
    public void exception() {
        System.out.println("exception");
    }

    @Around("execution(* cn.xiao.springdemo.aop.service.AopService.*(..))")  //around advice
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("around before");
        Object retVal = pjp.proceed();
        System.out.println("around after");
        return retVal;
    }
}
