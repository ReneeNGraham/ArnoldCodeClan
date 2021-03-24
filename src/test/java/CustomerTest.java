import engines.ElectricEngine;
import org.junit.Before;
import org.junit.Test;
import people.Customer;
import vehicles.ElectricCar;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;
    ElectricCar electricCar;
    ElectricEngine engine;

    @Before
    public void setUp() {
        customer = new Customer(500);
        engine = new ElectricEngine();
        electricCar = new ElectricCar(100, "blue", engine);
    }

    @Test
    public void canAddVehicle() {
        customer.addVehicle(electricCar);
       assertEquals(1, customer.getOwnedCars().size());
    }

}
