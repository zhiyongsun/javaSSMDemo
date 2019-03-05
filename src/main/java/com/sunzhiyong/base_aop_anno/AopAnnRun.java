package com.sunzhiyong.base_aop_anno;

import com.sunzhiyong.base_aop_anno.IUserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopAnnRun {
    public static void main(String[] args) {
        ApplicationContext app  = new ClassPathXmlApplicationContext("applicationContext_aopann.xml");
        IUserDao iUserDao = (IUserDao) app.getBean("userDao");
        iUserDao.save();

        System.out.println("-----------");
        OrderDao orderDao = (OrderDao) app.getBean("orderDao");
        orderDao.save();

    }
}
