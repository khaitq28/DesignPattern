package pattern.factory;

import pattern.models.car.BigTruck;
import pattern.models.car.MediumTruck;
import pattern.models.car.TruckType;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class TruckFactoryTest {

    @Test
    public void testGetTruck() {
        assertTrue(TruckFactory.createTruck(TruckType.MEDIUM) instanceof MediumTruck);

        assertTrue(TruckFactory.createTruck(TruckType.BIG) instanceof BigTruck);

    }

}
