package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static Scanner scanner;
    static Hall h1;
    static boolean cinemaIsOpen = true;

    public static void main(String[] args) {
        /*
        ArrayList<Hall> halls = new ArrayList<>();
        halls.add(new Hall("armagedon", 5));
        */
        h1 = new Hall("armagedon", 5);
        scanner = new Scanner(System.in);
        System.out.println("Welcome to CinemaCity,");
        while(cinemaIsOpen){
            /*
            String movie = scanner.nextLine();
            for (Hall hall : halls){
                if (hall.getName().equals(movie)){

                }
            }
            */
            System.out.println("what do you want to do? (b - buy ticket, p - print)");
            String s = scanner.nextLine();
            switch(s){
                case "b":
                    h1.buyTicket();
                    break;
                case "p":
                    h1.print();
                    break;
                case "bp":
                    buySpecialTicket();
                    break;
                case "c":
                    h1.getCounter();
                    break;
                case "exit":
                    cinemaIsOpen = false;
                    break;
                default:
                    System.out.println("WHAT?????");
            }
        }

    }

    public static void buySpecialTicket(){
        System.out.println("where do you want to sit?");
        String s = scanner.nextLine();
        int desiredSeat = Integer.parseInt(s);
        h1.buyTicket(desiredSeat);
    }

}
