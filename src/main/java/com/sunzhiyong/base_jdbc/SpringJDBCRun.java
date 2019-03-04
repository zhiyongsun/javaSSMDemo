package com.sunzhiyong.base_jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringJDBCRun {
    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext_jdbc.xml");
        UserDao ud = (UserDao) app.getBean("userDao");
//        User u = new User();
//        u.setAccount("admin");
//        u.setPwd("123");
//        u.setName("张三4");
//        ud.insert(u);
//        ud.delete(4);
        System.out.println(ud.getAllUser());
    }

}
