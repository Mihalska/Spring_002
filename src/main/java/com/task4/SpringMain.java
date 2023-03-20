package com.task4;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.Map;

public class SpringMain {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext4.xml"
        );

 //       User user = context.getBean("user1", User.class);
 //       User user1 = context.getBean("user2", User.class);

//-------  ключ - з класу Integer -------
        Map<Integer,User> userMap = context.getBean("mapUser", Map.class);
        for (Map.Entry<Integer,User> entry : userMap.entrySet())
            System.out.println(entry.getKey() +" "+ entry.getValue());
        System.out.println("______________________________________________________________________________________________________________");
// ------- ключ - з класу String -------
        Map<String,User> userMap1 = context.getBean("mapUser", Map.class);
        for (Map.Entry<String, User> entry : userMap1.entrySet())
            System.out.println(entry.getKey() +" "+ entry.getValue());


        context.close();
    }
}

