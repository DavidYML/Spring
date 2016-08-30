package com.realdolmen.spring.service;

import com.realdolmen.spring.domain.Animal;
import sun.reflect.generics.visitor.Visitor;

import java.util.ArrayList;
import java.util.List;


public class Safari implements Zoo {

    private List<Animal>animals=new ArrayList<>();
    public void addAnimal(Animal animal) {

        animals.add(animal);





    }

    @Override
    public void releaseAnimal(Animal animal) {

        animals.remove(animal);

    }

    @Override
    public boolean accept(Visitor visitor) {
        return false;
    }

    @Override
    public String getName() {
        return ("Safari");
    }

    @Override
    public int countAnimals() {
        int size= animals.size();
        return size;
    }
}
