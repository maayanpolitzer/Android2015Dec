package com.company.products;

import java.util.ArrayList;

/**
 * Created by hackeru on 2016-01-03.
 */
public class Meal extends Product {

    ArrayList<Product> products;
    private final double MEAL_DISCOUNT = 0.8;

    public Meal(){
        products = new ArrayList<>();
        products.add(new Chips());
        products.add(new Burger());
        setPrice(calculatePrice());
        setTimeToPrepare(calculateTime());
        setNumberOfProducts(products.size() - 1);
    }

    public double calculatePrice() {
        double sum = 0;
        for (Product p : products){
            sum += p.getPrice();
        }
        return sum *= MEAL_DISCOUNT;
    }

    public int calculateTime(){
        int time = 0;
        for (Product p : products){
            if (p.getTimeToPrepare() > time){
                time = p.getTimeToPrepare();
            }
        }
        return time;
    }
}
