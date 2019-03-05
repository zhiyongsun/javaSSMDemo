package com.sunzhiyong.base_aop_anno;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")//无接口的类被代理需要设置 prototype
public class OrderDao {
    public void save(){
        System.out.println("orderdao 核心业务： 已经保存！");
    };
}
