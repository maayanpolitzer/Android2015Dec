package com.company;

/**
 * Created by hackeru on 2015-12-23.
 */
public class Number {

    private int data;
    private Number nextNumber;

    public Number(int data){
        this(data, null);   // call the second constructor;
    }

    public Number(int data, Number nextNumber){
        this.data = data;
        this.nextNumber = nextNumber;
    }

    public int getData(){
        return data;
    }

    public void setData(int data){
        this.data = data;
    }

    public Number getNextNumber(){
        return nextNumber;
    }

    public void setNextNumber(Number nextNumber){
        this.nextNumber = nextNumber;
    }



}
