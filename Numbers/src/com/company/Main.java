package com.company;

public class Main {

    public static void main(String[] args) {

        byte b;          //  max = 127, min = -128; ` 256...      1 byte.
        boolean bool;    //  true/false;  1 bit...               1 bit.
        short s;         //  max = 32,767 min = -32,768.         2 bytes.
        int i;           //  max = 2,147,483,647                 4 bytes.
        long l;          //  really long number...               8 bytes.

        float f;         //                                      4 bytes.
        double d;        //                                      8 bytes.

        char c;          //                                      2 bytes.

        int number = 50000;
        String str = "50";

        //  convert upward:
        long newNumber = number;


        double newNumber2 = number;
        System.out.println(newNumber2);

        byte bb = 127;
        bb++;

        System.out.println(bb);

        // convert downward:
        // casting...
        int jjj = 130;
        byte ff = (byte)jjj;
        System.out.println("ff" + ff);

        double r = 5.99;
        int oo = (int)r;
        System.out.println(oo);

        // helper class
        /*
            int - Integer;
            double - Double;
            long - Long;
            float - Float;
            byte - Byte;
            short - Short;
         */
        Double newDouble = new Double(r);
        int rrr = newDouble.intValue();

        char cc = 't';
        int tt = (int) cc;
        tt -= 32;
        cc = (char)tt;
        System.out.println("cc " + cc);


        String n = String.valueOf(rrr);
        System.out.println(n);

    }
}
