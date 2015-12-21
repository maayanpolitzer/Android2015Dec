package com.company;

import enums.Gender;
import interfaces.Details;

public class Person implements Details {

    private static int numOfPeople = 0;
    private int id;
    private String name;
    private Gender sex;

    public Person(String name, Gender sex){
        this.name = name;
        this.sex = sex;
        id = ++numOfPeople;
    }

    public String getName(){
        return name;
    }

    public static int getNumOfPeople(){
        return numOfPeople;
    }

    public void sayHello(){
        System.out.println("hello from person");
    }

    @Override
    public String getFullName() {
        return name;
    }
}
