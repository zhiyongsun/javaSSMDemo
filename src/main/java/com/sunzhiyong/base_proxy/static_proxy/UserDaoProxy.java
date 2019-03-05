package com.sunzhiyong.base_proxy.static_proxy;

/**
 * UserDao 代理类
 */
public class UserDaoProxy implements IUserDao {
    private IUserDao target;

    public UserDaoProxy(IUserDao target) {
        this.target = target;
    }

    @Override
    public void save() {
        System.out.println("新添功能代码1");
        // 接口调用方法 -- 接口的实现类调用
        target.save();
        System.out.println("新添功能代码2");
    }
}
