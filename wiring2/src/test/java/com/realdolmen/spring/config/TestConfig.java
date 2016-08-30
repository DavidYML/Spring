package com.realdolmen.spring.config;

import com.realdolmen.spring.domain.*;
import com.realdolmen.spring.repository.FoodRepository;
import com.realdolmen.spring.repository.FoodRepositoryImpl;
import com.realdolmen.spring.service.Zoo;
import com.realdolmen.spring.service.ZooImpl;
import org.springframework.context.annotation.*;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * Created by cda5732 on 14/04/2015.
 */
@Configuration
// TODO load test properties
// TODO configure a profile
// TODO use component scanning
@Profile("Test")
@PropertySource("classpath:test.properties")
@ComponentScan(basePackages = "com.realdolmen.spring")
public class TestConfig {
    @Bean
    public Zoo zoo() {
        Zoo zoo= new ZooImpl();
        zoo.addAnimal(new Tiger("Bengal Tiger"));
        zoo.addAnimal(new Elephant("Indian Elephant"));
        zoo.addAnimal(new Bear("Brown Bear"));
        return zoo;
    }


    // TODO configure the properties loader

@Bean
    public static PropertySourcesPlaceholderConfigurer placeholderConfigurer(){
    return new PropertySourcesPlaceholderConfigurer();
}

    @Bean
    // TODO this is the Non-Kibble repository
    public FoodRepository foodRepository() {
        FoodRepository foodRepository = new FoodRepositoryImpl();
        foodRepository.addFoodForAnimalType(Tiger.class, new MeatyFood("Red Antilope Meat"));
        foodRepository.addFoodForAnimalType(Bear.class, new MeatyFood("Pink Salmon"));
        foodRepository.addFoodForAnimalType(Elephant.class, new VegiFood("Cabbage"));
        return foodRepository;
    }

}
