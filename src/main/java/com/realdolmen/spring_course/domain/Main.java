package com.realdolmen.spring_course.domain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {


//        ApplicationContext ac= new AnnotationConfigApplicationContext(MyConfig.class);
//
//        //Opstarten Spring container, kan via psvm of erbuiten

        ApplicationContext ac = SpringApplication.run(MyConfig.class);
        Knight k= ac.getBean(Knight.class);
        k.embarkOnQuest();
    }
}
