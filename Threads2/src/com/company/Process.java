package com.company;

/**
 * Created by hackeru on 2015-12-27.
 */
public class Process extends Thread {

    private volatile boolean run = true;

    @Override
    public void run() {
        while(run){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("n");
        }
    }

    public void shutDown(){
        run = false;
    }
}
