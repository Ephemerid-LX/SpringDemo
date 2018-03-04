package cn.xiao.springdemo.aop.service;

import java.io.FileNotFoundException;

public class AopService {

    //@Pointcut
    public void cutPoint(){
        System.out.println("cutPoint");
    }

    //@Pointcut
    public void cutPointThrowException() throws FileNotFoundException {
        System.out.println("cutPointThrowException");
        throw new FileNotFoundException();
    }
}
