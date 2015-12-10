package com.company;

public class Main {

    public static void main(String[] args) {

        Person p1 = new Person("g");
        Person p2 = new Person("M");

        //Vehicle v = new Vehicle("BMW", 1999, p);

        PrivateCar privateCar = new PrivateCar("BMW", 1999, p1, 4);

        privateCar.sellCar(p2);
        privateCar.sellCar(p2);     //  can't sell to yourself...

        System.out.println(privateCar);


        System.out.println("Vehicles created: " + Vehicle.getNumberOfVehicleObjects());     //  class method (static)!




    }
}
