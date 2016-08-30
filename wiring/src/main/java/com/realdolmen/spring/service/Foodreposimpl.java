package com.realdolmen.spring.service;

import com.realdolmen.spring.domain.Animal;
import com.realdolmen.spring.domain.Food;
import com.realdolmen.spring.domain.Visitor;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jonsnow on 26/08/16.
 */
public class Foodreposimpl implements FoodRepository {

    private Map<String,Food> feed = new HashMap<>();

    @Override
    public void addFoodForAnimalType(Class<? extends Animal> c, Food food) {
        feed.put(c.getName(), food);
    }

    @Override
    public Food findFoodForAnimalType(Class<? extends Animal> c) {
        return feed.get(c.getName());
    }

    @Override
    public void addAnimal(Animal animal) {

    }

    @Override
    public void releaseAnimal(Animal animal) {

    }

    @Override
    public boolean accept(Visitor visitor) {
        return false;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public int countAnimals() {
        return 0;
    }

    @Override
    public void feedAnimals() {

    }
}


