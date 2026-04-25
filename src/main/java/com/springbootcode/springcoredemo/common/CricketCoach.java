package com.springbootcode.springcoredemo.common;


import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{

    public CricketCoach(){
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    //define our init method
    @PostConstruct
    public void doMyStartupStuff(){
        System.out.println("In doMyStartupStuff();  " + getClass().getSimpleName());
    }

    //define our destroy method
    @PostConstruct
    public void doMyCleanUpStuff(){
        System.out.println("In doMyCleanUpStuff();  " + getClass().getSimpleName());
    }


    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 mins";
    }
}
