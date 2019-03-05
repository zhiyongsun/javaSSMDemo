package com.sunzhiyong.base_aop_xml;

/**
 * 被切入方法来源
 */
public class Aop {
    public void begin() {
        System.out.println("新添功能代码 aop1");
    }

    public void after() {
        System.out.println("新添功能代码 aop2");
    }
}
