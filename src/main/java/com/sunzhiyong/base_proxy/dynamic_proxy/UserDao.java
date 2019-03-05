package com.sunzhiyong.base_proxy.dynamic_proxy;

/**
 * save 实现数据保存
 * userDao 是目标对此昂
 *      save 方法为目标方法
 */
public class UserDao implements IUserDao {
    @Override
    public void save() {
        System.out.println("------已经保存数据----");
    }
}
