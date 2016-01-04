package com.company.products;

import com.company.ProductCompleteListener;

/**
 * Created by hackeru on 2015-12-30.
 */
public abstract class Product {

    private double price;
    private int timeToPrepare;
    public static final int SECOND = 1000;
    private static int productsCounter = 0;
    public boolean isReady = false;
    public ProductCompleteListener listener = null;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getTimeToPrepare(){
        return timeToPrepare;
    }

    public void setTimeToPrepare(int timeToPrepare){
        this.timeToPrepare = timeToPrepare;
    }

    public void startProduct(){
        productsCounter++;
        try {
            Thread.sleep(timeToPrepare);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        isReady = true;
        System.out.println("product ready");
        listener.checkIfOrderIsDone();
    }

    public static int getNumberOfProducts(){
        return productsCounter;
    }

    public static void setNumberOfProducts(int number){
        productsCounter += number;
    }
}
