package com.sunzhiyong.base_ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringRun {
    public static void main(String[] args) {
//        加载Spring 配置文件
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
//        Teacher teacher = (Teacher)applicationContext.getBean("myTeacher");
//        System.out.println(teacher);
//
//        System.out.println("-------------");

//        Dog dog = (Dog)applicationContext.getBean("myDog");
//        System.out.println(dog);

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Teacher teacher = (Teacher) applicationContext.getBean("teacher");
        System.out.println(teacher);

    }
}
