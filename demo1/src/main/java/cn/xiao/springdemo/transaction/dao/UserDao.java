package cn.xiao.springdemo.transaction.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void updateSalary(String username, double modify){
        String sql = "UPDATE user SET salary=salary+? where username=?;";
        jdbcTemplate.update(sql,modify,username);
    }

}
