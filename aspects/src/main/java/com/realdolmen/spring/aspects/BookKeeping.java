package com.realdolmen.spring.aspects;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

// TODO: Turn this class into a Spring Bean and an Aspect


@Component
@Aspect
public class BookKeeping {

    private int happyVisitorCount;
    private int unHappyVisitorCount;

    @AfterReturning(value = "execution(* *.accept(com.realdolmen.spring.domain.Visitor))",returning="isHappy")
     public  void returnHappy (boolean isHappy) {
        if (isHappy) {
            happyVisitorCount++;
        } else {
            unHappyVisitorCount++;
        };
    }

    // TODO: Add an advice that advises the Zoo.accept(Visitor) method
    // TODO: Make sure the advice uses the return value of the the adviced method to keep track of happy and unhappy visitors


    //    @AfterReturning(value = "execution(* *.Visitor(java.lang.String))",returning="spoils")
//public  void  {



        public int getHappyVisitorCount () {
            return this.happyVisitorCount;
        }



    public int getUnhappyVisitorCount() {
        return this.unHappyVisitorCount;

    }


}

