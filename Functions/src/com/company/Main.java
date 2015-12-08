package com.company;

public class Main {

    public static void main(String[] args) {

        int firstNumber = 5;
        int secondNumber = 3;
        product(firstNumber, secondNumber);  // will NOT show anything... need to print.
        System.out.println("The product of " + firstNumber + " and " + secondNumber +
                " is: " + product(firstNumber, secondNumber));


    }

    public static int distance(int x, int y) {
        int distance = 0;
        int small = x;
        int large = y;
        if(small > large) {
            small = y;
            large = x;
        }

        while(small + distance < large) {
            distance++;
        }

        return distance;
    }

    public static int product(int x, int y) {
        int product = 0;
        int small = x;
        int large = y;
        if (small > large) {
            small = y;
            large = x;
        }

        for (int i = 0; i < small; i++){
            product += large;
        }

        return product;

    }

    public static int quatient(int x, int y) {
        //  homeWork... (same as: x / y);
        return 0;
    }

    public static int remainder(int x, int y) {
        //  homeWork... (same as: x % y).
        return 0;
    }

    //  For the brave ones!!!!

    public static int power(int x, int y) {
        //  X "BE HEZKAT" Y;    example: x = 2; y = 4; result is: 2 * 2 * 2 * 2 = 16.
        return 0;
    }

    //  For the brave ones!!!!

    public static int sqrt(int x) {
        // what is the square root of X;    example: x = 49; result is: 7;
        // only with integers... 48 is no good...
        return 0;
    }

}
