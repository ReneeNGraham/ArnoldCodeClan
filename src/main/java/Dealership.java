import people.Customer;
import vehicles.Vehicle;

import java.util.ArrayList;

public class Dealership {

    private ArrayList<Vehicle>stock;
    private double till;

    public Dealership(double till) {
        this.till = till;
        this.stock = new ArrayList<>();
    }

    public ArrayList<Vehicle> getStock() {
        return stock;
    }

    public double getTill() {
        return till;
    }

    public void setTill(double till) {
        this.till = till;
    }

    public void addVehicle(Vehicle vehicle) {
        stock.add(vehicle);

    }

    public void sellVehicle(Customer customer, Vehicle vehicle) {
        if (vehicle.canBuy(customer)) {
            stock.remove(vehicle);
            customer.addVehicle(vehicle);
        }

    }

}
