package com.realdolmen.spring.config;

import com.realdolmen.spring.domain.Tiger;
import com.realdolmen.spring.service.Safari;
import com.realdolmen.spring.service.Zoo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ZooConfig {

    @Bean

    public Zoo createZoo() {

        Safari s = new Safari();
        s.addAnimal(new Tiger());
        return s;

    }



}
