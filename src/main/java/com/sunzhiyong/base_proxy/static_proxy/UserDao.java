package com.sunzhiyong.base_proxy.static_proxy;

/**
 * save 实现数据保存
 */
public class UserDao implements IUserDao {
    @Override
    public void save() {
        System.out.println("已经保存数据");
    }
}
