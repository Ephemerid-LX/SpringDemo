package cn.xiao.springdemo.transaction;

import cn.xiao.springdemo.transaction.service.UserService;
import cn.xiao.springdemo.transaction.service.UserServiceAnnotation;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testTransaction {


    @Test
    public void testTransferSalary(){
        ApplicationContext context
                = new ClassPathXmlApplicationContext("transaction/applicationContext-transaction.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.transferSalary("jim","tom",500);
    }

    @Test
    public void testTransferSalaryAnnotation(){
        ApplicationContext context
                = new ClassPathXmlApplicationContext("transaction/applicationContext-transaction-annotation.xml");
        UserServiceAnnotation userServiceAnnotation = context.getBean("userServiceAnnotation", UserServiceAnnotation.class);
        userServiceAnnotation.transferSalary("jim","tom",-500);
    }
}
