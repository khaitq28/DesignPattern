package factory;

import models.car.BigTruck;
import models.car.MediumTruck;
import models.car.TruckType;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class TruckFactoryTest {

    @Test
    public void testGetTruck() {
        assertTrue(TruckFactory.createTruck(TruckType.MEDIUM) instanceof MediumTruck);

        assertTrue(TruckFactory.createTruck(TruckType.BIG) instanceof BigTruck);

    }

}
