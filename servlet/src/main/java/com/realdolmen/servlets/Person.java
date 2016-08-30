package com.realdolmen.servlets;

/**
 * Created by jonsnow on 18/08/16.
 */
public class Person {
    public String firstName;
    public String lastName;
    public int age;
    public Gender gender;

    public Person(String firstName, String lastName, int age, Gender gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;

    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override

    public String toString() {
        return firstName+ " "+ lastName + "aged"+ age+ "with gender"+ gender;
    }

    public enum Gender {
        male,
        female,
        other;


    }

}
