package com.realdolmen.spring.service;

import com.realdolmen.spring.domain.Animal;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FoodDistrImpl implements FoodDistributionService {



    private FoodRepository foodRepository;

    @Override
    public void feedAnimalsByType(List<Animal> animals) {

        animals.stream().forEach(x -> x.feed(foodRepository.findFoodForAnimalType(x.getClass())));

    }
}
