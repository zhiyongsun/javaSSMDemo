package com.sunzhiyong.base_transanction;

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
//        int i = 1/0
        accountDao.intMoney(in, money);
    }
}
