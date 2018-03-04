package cn.xiao.springdemo.jdbcTemplate;

import cn.xiao.springdemo.jdbcTemplate.entity.User;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class JdbcTemplateDemo {

    private JdbcTemplate jdbcTemplate;

    // 增
    public void insertUser(User user) {
        String sql = "INSERT INTO user VALUES (?, ?, ?);";
        int row = jdbcTemplate.update(sql, user.getUsername(), user.getPassword(), user.getSalary());
        System.out.println("inserted : " + row);
    }

    // 删
    public void deleteUser(User user) {
        String sql = "DELETE FROM user WHERE username=?";
        int row = jdbcTemplate.update(sql, user.getUsername());
        System.out.println("deleted : " + row);
    }

    // 改
    public void updateUser(User user) {
        String sql = "UPDATE user SET password=?, salary=? WHERE username=?;";
        int row = jdbcTemplate.update(sql, user.getPassword(), user.getSalary(), user.getUsername());
        System.out.println("updated : " + row);
    }

    //
    public int queryCount() {
        String sql = "SELECT COUNT(*) FROM user;";
        return jdbcTemplate.queryForObject(sql, Integer.class);

    }

    public User queryUser(String username) {
        String sql = "SELECT * FROM user WHERE username=?";
        return jdbcTemplate.queryForObject(sql, new UserRowMapper(), username);
    }

    // 查
    public List<User> queryUsers() {
        String sql = "SELECT * FROM user";
        return jdbcTemplate.query(sql, new UserRowMapper());
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    private class UserRowMapper implements RowMapper<User> {

        @Override
        public User mapRow(ResultSet rs, int rowNum) throws SQLException {
            User user = new User();
            user.setUsername(rs.getString("username"));
            user.setPassword(rs.getString(2));
            user.setSalary(rs.getInt("salary"));
            return user;
        }
    }
}
