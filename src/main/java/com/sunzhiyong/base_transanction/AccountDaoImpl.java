package com.sunzhiyong.base_transanction;

import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.transaction.annotation.Transactional;

public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao{
    @Override
    public void outMoney(int out, Double money) {
        String sql = "UPDATE test SET money =money-? WHERE id =?";
        this.getJdbcTemplate().update(sql, money, out);
    }

    @Override
    public void intMoney(int in, Double money) {
        String sql = "UPDATE test SET money=money+? WHERE id =?";
        System.out.println("in");
        this.getJdbcTemplate().update(sql, money, in);
    }
}
