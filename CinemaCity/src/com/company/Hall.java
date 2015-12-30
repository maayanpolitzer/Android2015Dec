package com.company;

/**
 * Created by hackeru on 2015-12-30.
 */
public class Hall {

    private String name;
    private boolean[] seats;
    private int counter;

    public Hall(String name, int numOfSeats){
        this.name = name;
        counter = 0;
        seats = new boolean[numOfSeats];
    }

    public boolean buyTicket(){
        for (int i = 0; i < seats.length; i++){
            if (!seats[i]){
                seats[i] = true;
                System.out.println("Thank you for buying a ticket " + i);
                counter++;
                return true;

            }
        }
        System.out.println("Sorry hall is full!");
        return false;
    }

    public boolean buyTicket(int num){
        if (num >= seats.length || num < 0){
            System.out.println("Sorry, no such seat...");
            return false;
        }
        if (!seats[num]){
            seats[num] = true;
            System.out.println("Thank you for buying a ticket " + num);
            counter++;
            return true;
        }
        System.out.println("Sorry, seat already taken....");
        return false;
    }

    public void print(){
        for (int i = 0; i < seats.length; i++){
            /*
            if (seats[i]){
                System.out.print("V ");
            }else{
                System.out.print("* ");
            }
            */
            String s = seats[i] ? "v " : "* ";
            System.out.println(s);
        }
        System.out.println();
    }


    public int getCounter() {
        System.out.println(counter);
        return counter;
    }
}
