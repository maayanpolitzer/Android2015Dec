package com.company;


import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
/*
        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(88);
        System.out.println(list.size());
     //   System.out.println(list);
        System.out.println(list.get(1));
        System.out.println(list.contains(88));
        System.out.println(list.indexOf(4));
        */
        ArrayList<User> usersList = new ArrayList<>();
        User user1 = new User("moshe", 123);
        usersList.add(user1);
        usersList.add(new User("maayan", 123));
        System.out.println(usersList);



        User userToCheck = new User("maayan", 123);
        /*
        //for(int i...) way...
        for (int i = 0; i < usersList.size(); i++){
            if (usersList.get(i).getName() == userToCheck.getName()){
                System.out.println("yey");
            }
        }
        */
        //  for each way...
        for (User u : usersList){
            if (u.getName() == userToCheck.getName()){
                System.out.println("yey");
            }
        }



        System.out.println(usersList.get(0).getName());





    }
}
