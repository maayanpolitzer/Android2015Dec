package com.company;

import com.company.products.Product;

import java.util.ArrayList;

public class Order implements ProductCompleteListener {

    private ArrayList<Product> products;
    private static int orders = 0;
    private int orderId;
    private boolean editable;
    private Order o;
    private boolean isOrderDone = false;

    public Order(){
        o = this;
        products = new ArrayList<>();
        editable = true;
    }

    public void addProductToOrder(Product p){
        if (editable){
            products.add(p);
        }
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

    public void startPrepare(){
        editable = false;
        orderId = ++orders;
        System.out.println("starting order " + orderId);
        for (Product p : products){
            Thread t = new Thread(new Runnable() {
                @Override
                public void run() {
                    p.listener = o;
                    p.startProduct();
                }
            });
            t.start();
        }
    }

    public void orderIsDone(){
        isOrderDone = true;
        System.out.println("Order number " + orderId + " is ready!!!!");
    }

    @Override
    public boolean checkIfOrderIsDone() {
        for (Product p : products){
            if (!p.isReady){
                return false;
            }
        }
        if (!isOrderDone){
            orderIsDone();
        }
        return true;
    }
}
