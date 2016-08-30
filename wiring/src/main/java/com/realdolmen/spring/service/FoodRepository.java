package com.realdolmen.spring.service;


import com.realdolmen.spring.domain.Animal;
import com.realdolmen.spring.domain.Food;

public interface FoodRepository extends Zoo{

    void addFoodForAnimalType (Class<?extends Animal>clazz, Food food);

    Food findFoodForAnimalType (Class<?extends Animal>clazz);
}
