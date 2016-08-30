package com.realdolmen.spring.service;

import com.realdolmen.spring.config.ZooConfig;
import com.realdolmen.spring.domain.Animal;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;


public class Main {

    public static void main(String[] args) {

        ConfigurableApplicationContext context= SpringApplication.run(ZooConfig.class);
        Zoo zoo =context.getBean(Zoo.class);


        int count=zoo.countAnimals();
        System.out.println(count);
    }
}
