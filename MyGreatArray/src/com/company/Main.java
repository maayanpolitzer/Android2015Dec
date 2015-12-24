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
        usersList.add(user1);                   //
        usersList.add(new User("maayan", 123)); //
        usersList.get(0);
        System.out.println(usersList);
    //    usersList.toArray();
        usersList.add(0,new User("miko", 1));
        System.out.println(usersList);


/*
        if(usersList.add(null)){


        }else{

        }*/

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


        ArrayList<Integer> i = new ArrayList<>();
        i.add(5);
        i.add(77);
        System.out.println("i arrayList size is: " + i.size());


        MyArrayList myArrayList = new MyArrayList();

        /*
        myArrayList.add(5);
        myArrayList.add(-1);
        myArrayList.add(50);
        myArrayList.clear();
    //    myArrayList.get(2);
        myArrayList.add(6);

        System.out.println(myArrayList);
*/
            /*
        for (int k = 0; k < 10; k++){
            myArrayList.add(k);
        }
        System.out.println(myArrayList);
        myArrayList.remove(5);
            myArrayList.get(5);
        System.out.println(myArrayList);
        */

            for (int j = 0; j < 5; j++){
                    myArrayList.add(j);
            }
            System.out.println(myArrayList);
            myArrayList.addAt(2, 80);
            System.out.println(myArrayList);
    }
}
