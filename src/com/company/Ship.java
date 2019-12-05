package com.company;

public class Ship extends Vehicle implements Sailing {

    public Ship(String name) {
        super(name);
    }

    @Override
    public void dock() {
        System.out.println("Statek dotarł do portu");
    }

    @Override
    public double getFuelNeeds() {
        return 70;
    }

    @Override
    public double getDistance() {
        return 55;
    }

    @Override
    public void stop() {
        dock();
    }
}
