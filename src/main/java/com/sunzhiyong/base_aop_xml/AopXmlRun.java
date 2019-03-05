package com.sunzhiyong.base_aop_xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopXmlRun {
    public static void main(String[] args) {
        ApplicationContext app  = new ClassPathXmlApplicationContext("applicationContext_aopxml.xml");
        IUserDao iUserDao = (IUserDao) app.getBean("userDao");
        iUserDao.save();

    }
}
