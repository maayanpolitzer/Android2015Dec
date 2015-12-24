package com.company;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {

    static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public static void main(String[] args) {

        Date d = new Date();
        System.out.println(d.getYear());
        System.out.println(d.getDate());

        GregorianCalendar gc = new GregorianCalendar(2014, 2, 16, 4, 6, 34);
        gc.add(GregorianCalendar.DATE, 1);

        Date r = gc.getTime();
        System.out.println(sdf.format(r));



        System.out.println(r);








    }
}
