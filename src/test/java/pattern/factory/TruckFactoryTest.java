package pattern.factory;

import pattern.models.car.BigTruck;
import pattern.models.car.MediumTruck;
import pattern.models.car.TruckType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertInstanceOf;

class TruckFactoryTest {

    @Test
    void testGetTruck() {
        assertInstanceOf(MediumTruck.class, TruckFactory.createTruck(TruckType.MEDIUM));
        assertInstanceOf(BigTruck.class, TruckFactory.createTruck(TruckType.BIG));

    }

}
