package com.practice.springcore.reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String [] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("refconfig.xml");
        Ref a=(Ref) context.getBean("aref");

        System.out.println(a.getX());
        System.out.println(a.getOb().getY());

        System.out.println(a);
    }
}
