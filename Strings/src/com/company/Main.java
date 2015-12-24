package com.company;

public class Main {

    public static void main(String[] args) {

        String str = "Hello";
        str += " world";

        String hello = "Hello";
        String temp = " world";
        String temp2 = hello + temp;
        str = temp2;

        StringBuilder sb = new StringBuilder("Maayan");
        sb.append(" Politzer");

        System.out.println(sb);

        System.out.println(str);

    }
}
