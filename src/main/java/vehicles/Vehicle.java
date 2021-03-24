package vehicles;

import behaviours.IRoar;

public abstract class Vehicle {

    private double price;
    private String colour;
    private IRoar engine;

    public Vehicle(double price, String colour, IRoar engine) {
        this.price = price;
        this.colour = colour;
        this.engine = engine;
    }

    public double getPrice() {
        return price;
    }

    public String getColour() {
        return colour;
    }

    public IRoar getEngine() {
        return engine;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setEngine(IRoar engine) {
        this.engine = engine;
    }
}


