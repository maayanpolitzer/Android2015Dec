package com.company;

/**
 * Created by maayanpolitzer on 10/12/2015.
 */
public class PrivateCar extends Vehicle {

    private int numberOfDoors;

    public PrivateCar(String brand, int year, Person owner, int numberOfDoors) {
        super(brand, year, owner);  // Vehicle constructor.
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public String toString() {
        return super.toString() + ", number of doors: " + numberOfDoors;
    }
}
