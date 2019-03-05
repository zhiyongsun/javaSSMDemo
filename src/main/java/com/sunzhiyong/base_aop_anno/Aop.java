package com.sunzhiyong.base_aop_anno;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect//作为切面类存在
public class Aop {
//    设置切入规则方法，配置成切入点
    @Pointcut("execution(* com.sunzhiyong.base_aop_anno.*.*(..))")
    public void pointCut(){

    }

    @Before("pointCut()")
    public void begin(){
        System.out.println("add 功能1");
    }

    @After("pointCut()")
    public void after(){
        System.out.println("add 功能2");
    }
}
