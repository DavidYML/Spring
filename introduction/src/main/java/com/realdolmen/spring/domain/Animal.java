package com.realdolmen.spring.domain;



public abstract class Animal {

    private String animalName;

    public Animal(String animalName) {
        this.animalName = animalName;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }



    public void feed(Food food) {
        System.out.println("Feeding " + getAnimalName() + " " + food.getMeatEater());

    }

}
