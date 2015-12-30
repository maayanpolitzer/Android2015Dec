package com.company;

import com.company.products.*;

public class Main {

    public static void main(String[] args) {

        Order order = new Order();
        order.addProductToOrder(new Chips());
        order.addProductToOrder(new Burger());
        order.addProductToOrder(new Chips());
        order.cost();

    }
}
