package cn.xiao.springdemo.transaction.service;

import cn.xiao.springdemo.transaction.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceAnnotation {

    @Autowired
    private UserDao userDao;

    @Transactional    //3.添加注解，开启事务；这个注解也可以作用在类上
    public void transferSalary(String fromUsername, String toUsername, double howmuch) {
        userDao.updateSalary(fromUsername, -howmuch);
        //int i = 1 / 0; // java.lang.ArithmeticException: / by zero
        userDao.updateSalary(toUsername, howmuch);
    }
}
