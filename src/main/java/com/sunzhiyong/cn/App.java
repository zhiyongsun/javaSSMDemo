package com.sunzhiyong.cn;

import com.sunzhiyong.domain.Student;
import javafx.application.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

//        Student stu = new Student();
//        stu.setAge(10);
//        stu.setName("zs");
//        System.out.println(stu);

//        读取 spring 配置文件
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student stu = (Student)applicationContext.getBean("myStudent");
        Student stu2 = (Student)applicationContext.getBean("myStudent");
        System.out.println(stu == stu2);
    }
}
