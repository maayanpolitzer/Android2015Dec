package com.company;


import enums.Gender;

public class Teacher extends Person {

    private String course;

    public Teacher(String name, Gender sex, String course) {
        super(name, sex);
        this.course = course;
    }

    @Override
    public void sayHello() {
        System.out.println("hello from teacher");
    }
}
