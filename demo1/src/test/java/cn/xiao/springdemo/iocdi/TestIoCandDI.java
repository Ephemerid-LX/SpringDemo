package cn.xiao.springdemo.iocdi;

import cn.xiao.springdemo.iocdi.entity.EntityDemo;
import cn.xiao.springdemo.iocdi.service.ServiceDemo;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestIoCandDI {

    @Test
    public void testDemo11(){
        ApplicationContext context = new ClassPathXmlApplicationContext("iocdi/applicationContext-ioc-di.xml");
        EntityDemo entityDemo = context.getBean("entityDemo", EntityDemo.class);
        EntityDemo entityDemo2 = context.getBean("entityDemo2", EntityDemo.class);
    }

    @Test
    public void testDemo12(){
        ApplicationContext context = new ClassPathXmlApplicationContext("iocdi/applicationContext-ioc-di-annotation.xml");
        ServiceDemo serviceDemo = context.getBean("serviceDemo", ServiceDemo.class);
        serviceDemo.show();
    }
}
