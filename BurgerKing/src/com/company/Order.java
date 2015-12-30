package com.company;

import com.company.products.Product;

import java.util.ArrayList;

public class Order {
    
    private ArrayList<Product> products;

    public Order(){
        products = new ArrayList<>();
    }

    public void addProductToOrder(Product p){
        products.add(p);
    }

    public double cost(){
        double sum = 0;
        for (Product p : products){
            sum += p.getPrice();
        }
        /*
        for (int i = 0; i < products.size(); i++){
            sum += products.get(i).getPrice();
        }
        */
        return sum;
    }

}
