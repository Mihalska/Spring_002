package com.task2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMain {
    public static void main(String[] args) {


        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext2.xml"
        );

        User user = context.getBean("user", User.class);
        System.out.println(user);
        context.close();
    }
}
