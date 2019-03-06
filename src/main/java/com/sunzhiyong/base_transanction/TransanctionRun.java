package com.sunzhiyong.base_transanction;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TransanctionRun {
    public static void main(String[] args) {
        ApplicationContext app  = new ClassPathXmlApplicationContext("applicationContext_tran.xml");
        AccountService accountService = (AccountService)app.getBean("accountService");
        accountService.transfer(1, 2 , 300d);
    }
}
