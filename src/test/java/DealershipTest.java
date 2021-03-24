import engines.ElectricEngine;
import org.junit.Before;
import org.junit.Test;
import people.Customer;
import vehicles.ElectricCar;

import static org.junit.Assert.assertEquals;

public class DealershipTest {

    Dealership dealership;
    Customer customer;
    ElectricCar electricCar;
    ElectricEngine engine;

    @Before
    public void setUp() {
        customer = new Customer(500);
        engine = new ElectricEngine();
        electricCar = new ElectricCar(100, "blue", engine);
        dealership = new Dealership (1000.00);
    }

    @Test
    public void canAddVehicle() {
        dealership.addVehicle(electricCar);
        assertEquals(1, dealership.getStock().size());
    }

    @Test
    public void canSellVehicle() {
        dealership.addVehicle(electricCar);
        dealership.sellVehicle(customer, electricCar);
        assertEquals(0, dealership.getStock().size());
        assertEquals(1, customer.getOwnedCars().size());

    }
}


