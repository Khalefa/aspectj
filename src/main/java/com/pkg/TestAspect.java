package com.pkg;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;


@Aspect
public class TestAspect {       

    @Before("execution(* com.pkg.HelloWorld.printHello(..))")
    public void testBefore2(){
        System.out.println("Yeeha");
    }


}