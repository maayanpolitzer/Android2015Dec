package com.company;

/**
 * Created by hackeru on 2015-12-20.
 */
public class User {

    private int password;
    private String name;

    public User(String name, int password){
        this.name = name;
        this.password = password;
    }

    @Override
    public String toString() {
        return name + ", " + password;
    }

    public String getName(){
        return name;
    }
}
