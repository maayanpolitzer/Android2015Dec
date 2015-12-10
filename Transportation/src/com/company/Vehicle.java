package com.company;

import java.util.Random;

/**
 * Created by maayanpolitzer on 10/12/2015.
 */
public class Vehicle {

    private String brand;
    private int lisencePlate;
    private Person owner;
    private static int vehiclesOutThere = 0;
    private int previousOwners = 0;
    private int year;

    public Vehicle(String brand, int year, Person owner){
        this.brand = brand;
        this.year = year;
        this.owner = owner;
        lisencePlate = generateRandomLisencePlate();
        vehiclesOutThere++;
        previousOwners++;
    }

    private int generateRandomLisencePlate() {
        Random r = new Random();
        return 1000000 + r.nextInt(9000000);    // generates a 7 digit number (1,000,000 - 9,999,999).
    }

    @Override
    public String toString() {
        return "Vehicle details = Lisence: " + lisencePlate +
                ", Year: " + year + ", Yad: " + previousOwners + ". " + owner;
    }

    public void sellCar(Person buyer){
        if (owner != buyer){
            owner = buyer;
            previousOwners++;
            System.out.println("SOLD!!!");
        }else{
            System.out.println("CAN'T SELL TO YOURSELF...");
        }
    }

    public static int getNumberOfVehicleObjects(){
        return vehiclesOutThere;
    }
}
