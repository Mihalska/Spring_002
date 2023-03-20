package com.task3;
import com.task3.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.jws.soap.SOAPBinding;

@Configuration
@ComponentScan("com.task3")
@PropertySource("classpath:user.properties")
public class SpringConfig {

// За допомогою анотацій конфігурацію XML із завдання 2 переведено у конфігурацію Java (використали завнішній файл user.properties)


//- Також маємо можливість перевести конфігурацію XML із завдання 2 у конфігурацію Java іншим способом(вручну прописавши у класі)
//    @Bean
//    public User user1() {
//        User user = new User("Kira", 20);
//        user.setStatus("student");
//        user.setWoman(true);
//        user.MyInit();
//        return user;
//    }


}



