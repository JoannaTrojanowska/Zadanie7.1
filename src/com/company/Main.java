package com.company;

public class Main {

    public static void main(String[] args) {

        Ship ship = new Ship("Statek");
        Car car = new Car("Samochód");
        Plane plane = new Plane("Samolot");
        Truck truck = new Truck("Ciężarówka");
        RaceCar raceCar = new RaceCar("Wyścigówka");

        Vehicle[] vehicles = new Vehicle[]{ship, car, plane, truck, raceCar};

                //SpaghettiCode
        for (int i = 0; i < vehicles.length; i++) {
            if (vehicles[i] == ship) {
                ship.go();
                ship.dock();
                System.out.println(ship.calculateFuelConsumption());
            } else if (vehicles[i] == car) {
                car.go();
                car.stop();
                System.out.println(car.calculateFuelConsumption());
            } else if (vehicles[i] == plane) {
                plane.go();
                plane.stop();
                System.out.println(plane.calculateFuelConsumption());
                plane.callAirControll();
            } else if (vehicles[i] == truck) {
                truck.go();
                truck.stop();
                System.out.println(truck.calculateFuelConsumption());
            } else if (vehicles[i] == raceCar) {
                raceCar.go();
                raceCar.stop();
                System.out.println(raceCar.calculateFuelConsumption());
            }
        }


    }
}
