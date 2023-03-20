package com.task3;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringMain {
        public static void main(String[] args) {
            AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                    SpringConfig.class
            );
//--------- отримуємо перший бiн за допомогою анотацій та зовнішнього файла ------------
            User user = context.getBean("user", User.class);
            System.out.println(user);

//--------- отримуємо другий бiн, прописавши джава код у класі  ------------
//            User user1 = context.getBean("user1", User.class);
//            System.out.println(user1);
//            context.close();
        }


}
