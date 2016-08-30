package com.realdolmen.spring.config;

import com.realdolmen.spring.annotations.NonKibble;
import com.realdolmen.spring.domain.*;
import com.realdolmen.spring.repository.FoodRepository;
import com.realdolmen.spring.repository.FoodRepositoryImpl;
import com.realdolmen.spring.service.Zoo;
import com.realdolmen.spring.service.Zoo;
import com.realdolmen.spring.service.ZooImpl;
import org.springframework.context.annotation.*;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;


/**
 * Created by cda5732 on 25/03/2015.
 */
@Configuration
// TODO Load properties for the zoo
// TODO Add a profile

@Profile("ZooTest")
@PropertySource("classpath:zoo.properties")
@ComponentScan(basePackages = "com.realdolmen.spring")
public class ZooConfig {

    @Bean
    public Zoo zoo() {
        Zoo zoo;
        zoo = new ZooImpl();
        zoo.addAnimal(new Tiger("Bengal Tiger"));
        zoo.addAnimal(new Elephant("Indian Elephant"));
        zoo.addAnimal(new Bear("Brown Bear"));
        return zoo;
    }

    @Bean
    // TODO this is the Non-Kibble repository
    @NonKibble
    public FoodRepository foodRepository() {
        FoodRepository foodRepository = new FoodRepositoryImpl();
        foodRepository.addFoodForAnimalType(Tiger.class, new MeatyFood("Red Antilope Meat"));
        foodRepository.addFoodForAnimalType(Bear.class, new MeatyFood("Pink Salmon"));
        foodRepository.addFoodForAnimalType(Elephant.class, new VegiFood("Cabbage"));
        return foodRepository;
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer placeholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
        // TODO Configure the properties loader
    }
}