package com.task3;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class User implements MyUser{
        @Value("${user.fName}")
        private String name;
        @Value("${user.age}")
        private int age;
        @Value("${user.status}")
        private String status;
        @Value("${user.isWoman}")
        private boolean isWoman;
        String information;

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }



        public User() {
        }

        public User(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public boolean isWoman() {
            return isWoman;
        }

        public void setWoman(boolean woman) {
            isWoman = woman;
        }
       @PostConstruct
        public void MyInit (){
           information = "This is an excellent specialist!";
        }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", status='" + status + '\'' +
                ", isWoman=" + isWoman +
                ", information='" + information + '\'' +
                '}';
    }
}



