package com.company;

public class Main {

    public static void main(String[] args) {

        Number n1 = new Number(5);
        Number n2 = new Number(10, n1);
        Number n3 = new Number(15, n2);
        Number n4 = new Number(20, n3);
        Number n5 = new Number(25, n4);

        n1.setNextNumber(n3);

        n3.getNextNumber().getNextNumber()

        System.out.println(hasLoop(n5));

    }

    public static boolean hasLoop(Number n){

    }

    public static int loopSize(Number n){

    }

    public static boolean hasLoop2(Number n){

    }

    public static int loopSize2(Number n){

    }
}
