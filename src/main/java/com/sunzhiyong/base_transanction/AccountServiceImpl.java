package com.sunzhiyong.base_transanction;

import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

// 事务一定要加在业务类上

/**
 * propagation 是否是必须
 */
@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT, readOnly = false)
public class AccountServiceImpl implements AccountService{
    private AccountDao accountDao;

    public AccountDao getAccountDao() {
        return accountDao;
    }

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    @Override
    public void transfer(int out, int in, Double money) {
        accountDao.outMoney(out, money);
        int i = 1/0;
        accountDao.intMoney(in, money);
    }
}
