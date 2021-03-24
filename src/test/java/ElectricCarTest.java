import engines.ElectricEngine;
import org.junit.Before;
import org.junit.Test;
import vehicles.ElectricCar;

import static org.junit.Assert.assertEquals;

public class ElectricCarTest {

    ElectricCar electricCar;
    ElectricEngine engine;

    @Before
    public void setUp() throws Exception {
        engine = new ElectricEngine ();
        electricCar = new ElectricCar(50.00, "blue", engine);}

    @Test
    public void canRoar() {
        assertEquals("zzzzzz", electricCar.getEngine().roar());
    }



}
