package com.practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("config.xml");
        Student student1 = (Student) ac.getBean("student1");
        Student student2 = (Student) ac.getBean("student2");
        Student student3 = (Student) ac.getBean("student3");

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
    }
}