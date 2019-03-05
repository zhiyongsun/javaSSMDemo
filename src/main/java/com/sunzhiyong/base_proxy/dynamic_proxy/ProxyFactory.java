package com.sunzhiyong.base_proxy.dynamic_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 代理工厂
 * 只要有接口，实现类
 * ProxyFactory 生产出代理对象
 */
public class ProxyFactory {
    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    // 生产代理对象
    public Object getProxyInstance() {
        // 生产代理对象过程
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("DynamicProxy 新添加功能功能1");
                // 目标对象方法执行
                Object returnValue = method.invoke(target, args);
                System.out.println("DynamicProxy 新添加功能功能2");
                return returnValue;
            }
        });
    }

}
