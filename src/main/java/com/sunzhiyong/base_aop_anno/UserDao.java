package com.sunzhiyong.base_aop_anno;

import org.springframework.stereotype.Component;

@Component
public class UserDao implements IUserDao {
    @Override
    public void save() {
        System.out.println("---核心业务：已经保存数据");
    }
}
