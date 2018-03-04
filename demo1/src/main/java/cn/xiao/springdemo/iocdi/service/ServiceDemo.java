package cn.xiao.springdemo.iocdi.service;

import cn.xiao.springdemo.iocdi.entity.EntityDemo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service //默认为 @Service(value="serviceDemo") ,这里的value就是<bean>中的id属性
public class ServiceDemo {

    @Autowired  //将会根据类，将该属性注入
    private EntityDemo entityDemo;

    public void show(){
        System.out.println("service show:" + entityDemo);
    }
}
