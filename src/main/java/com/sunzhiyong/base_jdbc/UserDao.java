package com.sunzhiyong.base_jdbc;

import org.springframework.jdbc.core.JdbcTemplate;

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

    public void delete() {

    }
}
