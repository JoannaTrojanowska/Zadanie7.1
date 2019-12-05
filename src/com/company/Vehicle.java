package com.company;

public abstract class Vehicle {

    private String name;

    public Vehicle(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                '}';
    }

    public abstract double getFuelNeeds();

    public abstract double getDistance();


    public double calculateFuelConsumption() {
        double consumption;

        consumption = getFuelNeeds() / getDistance();
        return consumption;
    }

    public void go() {
        System.out.println(name + "- pojazd został uruchomiony");
    }

    public void stop() {
        System.out.println(name + "- pojazd został zatrzymany");
    }


}
