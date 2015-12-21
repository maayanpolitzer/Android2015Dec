package com.company;

import enums.Gender;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Teacher t1 = new Teacher("maayan",Gender.MALE, "java");
        Teacher t2 = new Teacher("eli", Gender.MALE, "swift");
        Person p1 = new Person("moshe", Gender.MALE);
        Person p2 = new Person("miko");


        Person[] persons = new Person[4];
        persons[0] = t1;
        persons[1] = t2;
        persons[2] = p1;
        persons[3] = p2;

    }
}
