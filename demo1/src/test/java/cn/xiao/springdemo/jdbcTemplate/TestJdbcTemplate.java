package cn.xiao.springdemo.jdbcTemplate;

import cn.xiao.springdemo.jdbcTemplate.entity.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class TestJdbcTemplate {

    private static ApplicationContext context
            = new ClassPathXmlApplicationContext("jdbcTemplate/applicationContext-jdbc.xml");

    private static JdbcTemplateDemo demo = context.getBean("jdbcTemplateDemo", JdbcTemplateDemo.class);

    @Test
    public void testAdd(){
        User user = new User();
        user.setUsername("Jim");
        user.setPassword("Jimp");
        user.setSalary(5333.0);
        demo.insertUser(user);
    }

    @Test
    public void testUpdate(){
        User user = new User();
        user.setUsername("Jim");
        user.setPassword("Jimp");
        user.setSalary(533233.0);
        demo.updateUser(user);
    }

    @Test
    public void testDelete(){
        User user = new User();
        user.setUsername("Jim");
        demo.deleteUser(user);
    }

    @Test
    public void testQueryCount(){
        int count = demo.queryCount();
        System.out.println(count);
    }

    @Test
    public void testQueryUser(){
        User user = demo.queryUser("liuxiao");
        System.out.println(user);
    }

    @Test
    public void testQueryUsers(){
        List<User> users = demo.queryUsers();
        System.out.println(users);
    }
}
