package pattern.factory;

import pattern.models.car.Car;
import pattern.models.car.CarType;
import pattern.models.car.LuxuryCar;
import pattern.models.car.engine.MediumEngine;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class CarFactoryTest {

    @Test
    public void testGetCarType() {
        assertTrue(CarFactory.createCar(CarType.LUXURY) instanceof LuxuryCar);
    }

    @Test
    public void testGetCarTypeAndEngine() {
        Car car = CarFactory.createCar(CarType.LUXURY, new MediumEngine());
        assertTrue(car instanceof LuxuryCar);
        assertTrue(car.getEngine() instanceof MediumEngine);
    }

}
