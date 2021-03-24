import engines.PetrolEngine;
import org.junit.Before;
import org.junit.Test;
import vehicles.PetrolCar;

import static org.junit.Assert.assertEquals;

public class PetrolCarTest {

    PetrolCar petrolCar;
    PetrolEngine petrolengine;

    @Before
    public void setUp() throws Exception {
        petrolengine = new PetrolEngine();
        petrolCar = new PetrolCar(100, "green", petrolengine);
    }

    @Test
    public void canRoar() {
        assertEquals("vrrrroooommmm", petrolCar.getEngine().roar());
    }

}
