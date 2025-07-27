package com.practice.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Collection;

public class Test {

    public static void main(String [] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("collectionconfig.xml");
        CollectionsPractice collections = (CollectionsPractice) context.getBean("collections");

        System.out.println(collections.getEmpName());
        System.out.println(collections.getEmpPhones());
        System.out.println(collections.getAddresses());
        System.out.println(collections.getCourses());
    }
}
