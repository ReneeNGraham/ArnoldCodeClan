package vehicles;

import behaviours.IRoar;
import engines.HybridEngine;

public class HybridCar extends Vehicle {
    public HybridCar(double price, String colour, HybridEngine engine) {
        super(price, colour, engine);
    }
}
