package com.example.spring_cource;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test5 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext2.xml");
        Dog mydog = context.getBean("myPet", Dog.class);
        mydog.say();
        context.close();
    }
}
