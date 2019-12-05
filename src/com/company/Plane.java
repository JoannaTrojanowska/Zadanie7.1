package com.company;

public class Plane extends Vehicle implements Flying {
    public Plane(String name) {
        super(name);
    }

    @Override
    public void takeOff() {

    }

    @Override
    public void land() {

    }

    @Override
    public void callAirControll() {
        System.out.println("Kontrola lotu");
    }

    @Override
    public double getFuelNeeds() {
        return 80;
    }

    @Override
    public double getDistance() {
        return 444;
    }
}
