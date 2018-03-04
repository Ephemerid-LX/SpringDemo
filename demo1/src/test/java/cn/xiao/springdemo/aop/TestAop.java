package cn.xiao.springdemo.aop;

import cn.xiao.springdemo.aop.service.AopService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.FileNotFoundException;

public class TestAop {

    @Test
    public void testAop1() throws FileNotFoundException {
        ApplicationContext context = new ClassPathXmlApplicationContext("aop/applicationContext-AOP.xml");
        AopService aopService = context.getBean("aopService", AopService.class);
        aopService.cutPoint();
        // 抛出FileNotFound异常
        aopService.cutPointThrowException();
    }

    @Test
    public void testAnnotationAOP() throws FileNotFoundException {
        ApplicationContext context = new ClassPathXmlApplicationContext("aop/applicationContext-AOP-annotation.xml");
        AopService aopService = context.getBean("aopService", AopService.class);
        aopService.cutPoint();
        // 抛出FileNotFound异常
        aopService.cutPointThrowException();
    }
}
