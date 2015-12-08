package com.company;

/**
 * Created by maayanpolitzer on 08/12/2015.
 */
public class User {

    String name;
    String password;


    //  constructor: must have name & password;
    public User(String userName, String userPassword) {
        setName(userName);
        setPassword(userPassword);
    }

    public void setName(String userName) {
        name = userName;
    }

    public void setPassword(String userPassword) {
        password = userPassword;
    }

    public void getUserDetails(){
        System.out.println("name: " + name + ", password: " + password);
    }
}
