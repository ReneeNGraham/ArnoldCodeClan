package people;

import vehicles.Vehicle;

import java.util.ArrayList;

public class Customer {

    private double money;
    private ArrayList<Vehicle> ownedCars;

    public Customer(double money) {
        this.money = money;
        this.ownedCars = new ArrayList<>();
    }

    public ArrayList<Vehicle> getOwnedCars() {
        return ownedCars;
    }

    public void addVehicle(Vehicle vehicle) {
        ownedCars.add(vehicle);

    }

    public double getMoney() {
        return money;
    }
}


