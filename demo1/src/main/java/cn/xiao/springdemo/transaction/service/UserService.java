package cn.xiao.springdemo.transaction.service;

import cn.xiao.springdemo.transaction.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public void transferSalary(String fromUsername, String toUsername, double howmuch) {
        userDao.updateSalary(fromUsername, -howmuch);
        //int i = 1 / 0; // java.lang.ArithmeticException: / by zero
        userDao.updateSalary(toUsername, howmuch);
    }
}
