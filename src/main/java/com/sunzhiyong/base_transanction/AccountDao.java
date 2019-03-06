package com.sunzhiyong.base_transanction;

public interface AccountDao {
    /**
     *
     * @param out 转出账户
     * @param money 金额
     */
    public void outMoney(int out, Double money);

    /**
     *
     * @param in 转入账户
     * @param money 金额
     */
    public void intMoney(int in, Double money);
}
