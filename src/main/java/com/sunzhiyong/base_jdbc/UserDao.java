package com.sunzhiyong.base_jdbc;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class UserDao {

    private JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void insert(User user) {
        String sql = "INSERT INTO springuser VALUES (null, ?, ?, ?)";
        int result = jdbcTemplate.update(sql, new Object[]{user.getAccount(), user.getPwd(), user.getName()});
        System.out.println(result);
    }

    public void delete(int userId) {
        String sql = "DELETE FROM springuser WHERE id=?";
        int result = jdbcTemplate.update(sql, new Object[]{userId});
        if (result > 0) {
            System.out.println("删除成功");
        } else {
            System.out.println("删除失败");
        }
    }

    public List<User> getAllUser() {
        String sql = "SELECT * FROM springuser";
        List<User> lu = jdbcTemplate.query(sql, new BeanPropertyRowMapper<User>(User.class));
        return  lu;
    }
}
