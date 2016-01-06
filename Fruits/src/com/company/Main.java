package com.company;

import java.text.DecimalFormat;
import java.util.HashMap;

public class Main {

    static HashMap<String, Double> fruits;
    static final double VAT = 1.17;

    public static void main(String[] args) {

        fruits = new HashMap<>();

        fruits.put("Apple", 5.9);
        fruits.put("Orange", 12.7);
        fruits.put("Pear", 7.7);

        getPrice("Apple");
        changePrice("Banana", 6.0);
        addVat();
        System.out.println(fruits);

    }

    public static double getPrice(String fruit){
        if (fruits.containsKey(fruit)){
            return fruits.get(fruit);
        }
        return -1;
    }

    public static boolean changePrice(String fruit, double newPrice){
        if(fruits.containsKey(fruit) && newPrice > 0){
            fruits.put(fruit, newPrice);
            return true;
        }
        return false;
    }

    public static void addVat(){
        for (String i : fruits.keySet()){
            double newPrice = fruits.get(i) * VAT;
            DecimalFormat df = new DecimalFormat("#.#");
            fruits.put(i, Double.valueOf(df.format(newPrice)));
        }
    }

}
