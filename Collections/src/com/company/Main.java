package com.company;

import java.util.Random;

public class Main {

    static int[] arr;

    public static void main(String[] args) {

        arr = new int[5];

        generateRandomNumbers();
        printArray();
        incrementBy10();
        printArray();

    }

    public static void generateRandomNumbers(){
        for (int i = 0; i < arr.length; i++){
            arr[i] = new Random().nextInt(100);     //  insert random number (0-100) to arr values.
        }
    }

    public static void printArray(){
        for (int i : arr){
            System.out.println(i);
        }

        // the same as:
        /*
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
        */
    }

    public static void incrementBy10(){
        for (int i = 0; i < arr.length; i++){
            arr[i] += 10;
        }
    }


}
