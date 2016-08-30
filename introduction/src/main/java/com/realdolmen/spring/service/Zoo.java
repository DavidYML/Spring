package com.realdolmen.spring.service;


import com.realdolmen.spring.domain.Animal;
import com.sun.tools.classfile.Type;
import org.springframework.context.annotation.Bean;
import sun.reflect.generics.visitor.Visitor;


public interface Zoo {

    void addAnimal (Animal animal) ;

    void releaseAnimal (Animal animal);

    public boolean accept (Visitor visitor);

    String getName();

    int countAnimals();


}



