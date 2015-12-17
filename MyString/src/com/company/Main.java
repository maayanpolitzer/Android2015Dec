package com.company;

public class Main {

    public static void main(String[] args) {

        char[] maayan = {'h', 'e', 'l', 'l', 'o'};

        MyString m = new MyString(maayan);

        System.out.println(m.charAt(0));    // h
        System.out.println(m.indexOf('h')); // 0

        System.out.println(m.howManySameChars('s'));

        System.out.println(m.subString(0,2));   // {'h', 'e', 'l'}
        System.out.println(m.length());         // 5
        m.print();          // hello
        System.out.println(m.contains('p'));    // false
        System.out.println(m.isEmpty());        // false;
        //  Advanced:
        char[] c = {'e','l','l','o'};
        System.out.println(m.endsWith(c));      // false;
        System.out.println(m.equals(c));
        m.replace('t', 3).print();
        //     'h','e','l','l','o'
        m.split(' ');


        System.out.println("Hello world!");


    }
}
