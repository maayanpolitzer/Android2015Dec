package com.company;

public class Main {

    public static void main(String[] args) {

        char[] maayan = {'h', 'e', 'l', 'l', 'o',' ', 'w', 'o','r','l','d'};

        MyString m = new MyString(maayan);




        System.out.println(m.toString());

        System.out.println(m.charAt(0));    // h
        System.out.println(m.indexOf('h')); // 0

        System.out.println(m.howManySameChars('s'));
        System.out.println();

        System.out.println(m.subString(0, 2));   // {'h', 'e', 'l'}
        System.out.println(m.length());         // 5
        m.print();

                 // hello
        System.out.println(m.contains('p'));    // false
        System.out.println(m.isEmpty());        // false;
        //  Advanced:
        char[] c = {'e','l','l','o'};
        System.out.println(m.endsWith(c));      // true;
        System.out.println("*********");
        System.out.println(m.equals(c));
    //    System.out.println(m.equals(new char[]{'r', 'y', 'u'}));
    //    m.replace('t', 3).print();
        //     'h','e','l','l','o'
        m.split(' ');

        String s = "maayan";


        System.out.println("Hello world!");


    }
}
