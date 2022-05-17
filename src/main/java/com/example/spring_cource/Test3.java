package com.example.spring_cource;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        Person p = context.getBean("myPerson", Person.class);
            p.callYourePet();
        System.out.println(p.getAge());
        System.out.println(p.getSurename());
        context.close();
    }
}
