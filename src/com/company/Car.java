package com.company;

public class Car extends Vehicle {


    public Car(String name) {
        super(name);
    }

    @Override
    public double getFuelNeeds() {
        return 200;
    }

    @Override
    public double getDistance() {
        return 90;
    }
}
