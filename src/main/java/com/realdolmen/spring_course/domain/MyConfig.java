package com.realdolmen.spring_course.domain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class MyConfig {



@Bean
    public Quest quest() {
//        return new RescueDamselQuest();
        return new SlayDragonQuest();
    }

@Bean

    public Knight knight() {
        return new BraveKnight(quest());
    }
}
