package com.company;

/**
 * Created by maayanpolitzer on 10/12/2015.
 */
public class Person {

    private String name;
    private int id;
    private static int counter = 0;

    public Person(String name){
        this.name = name;
        id = ++counter;
    }

    @Override
    public String toString() {
        return "Person details: " + name + ", " + id + ".";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
