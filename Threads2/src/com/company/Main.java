package com.company;

public class Main {

    private int counter = 0;

    public static void main(String[] args) {

        Process p = new Process();
        p.start();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        p.shutDown();


        /*
	    Main main = new Main();
        main.work();
        for (int i = 0; i < 1000; i++){

        }
        */
    }

    public void work(){

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++){
                    increment();
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++){
                    increment();
                }
            }
        });
        t1.start();
        t2.start();
/*
        try{
            t1.join();
            t2.join();
        }catch (Exception e){
            System.out.println("problem");
        }
        */
        System.out.println("counter is: " + counter);

    }

    public synchronized void increment(){
        counter = counter + 1;
    }

}
