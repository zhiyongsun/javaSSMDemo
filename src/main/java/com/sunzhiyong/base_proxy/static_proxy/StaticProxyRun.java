package com.sunzhiyong.base_proxy.static_proxy;

public class StaticProxyRun {
    public static void main(String[] args) {
        // 父类引用指向子类对象-- 多态
        IUserDao iud = new UserDao();
        IUserDao proxy = new UserDaoProxy(iud);
        proxy.save();
    }
}
