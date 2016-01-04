package com.company;

import com.company.products.*;

public class Main {

    public static void main(String[] args) {
        /*
        for (int i = 0; i < 10; i++){
            Order order = new Order();
            order.addProductToOrder(new Chips());
            if (i % 2 == 0){
                order.addProductToOrder(new Burger());
            }
            order.startPrepare();
        }
        */
        Order o = new Order();
        o.addProductToOrder(new Chips());   //5
        o.addProductToOrder(new Burger());  //10
        o.addProductToOrder(new Burger());  //10
        o.addProductToOrder(new Chips());   //5
        o.addProductToOrder(new Meal());   //10
        o.addProductToOrder(new Meal());   //10
        o.addProductToOrder(new Meal());   //10
        o.startPrepare();



    }
}
