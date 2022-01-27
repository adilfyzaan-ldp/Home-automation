package com.company;

class Vehicle{
    public void topspeed(){
        System.out.println("The top speed of the vehicle is 60mph");
    }
    public void mileage(){
        System.out.println("The mileage of the vehicle is 30km");
    }

}
class Car extends Vehicle{
    public void topspeed(){
        System.out.println("The top speed of the car is 120mph");
    }
    public void mileage(){
        System.out.println("The mileage of the car is 25km");
    }
}
class Bike extends Vehicle{
    public void topspeed(){
        System.out.println("The top speed of the bike is 140mph");
    }
    public void mileage(){
        System.out.println("The mileage of the vehicle is 20km");
    }
}

public class Liskov {
    static void testdrive(Vehicle veh){
        veh.topspeed();
        veh.mileage();
    }

    public static void main(String[] args) {
        testdrive(new Bike());
        testdrive(new Car());

    }
}
