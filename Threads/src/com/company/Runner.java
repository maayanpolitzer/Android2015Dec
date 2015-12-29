package com.company;

/**
 * Created by hackeru on 2015-12-27.
 */
public class Runner implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 10; i++){
            System.out.println("from runner: " + i);
        }
    }
}
