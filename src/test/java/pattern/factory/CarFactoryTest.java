package pattern.factory;

import org.junit.jupiter.api.Test;
import pattern.models.car.Car;
import pattern.models.car.CarType;
import pattern.models.car.LuxuryCar;
import pattern.models.car.engine.MediumEngine;

import static org.junit.jupiter.api.Assertions.assertInstanceOf;


class CarFactoryTest {

    @Test
    void testGetCarType() {
        assertInstanceOf(LuxuryCar.class, CarFactory.createCar(CarType.LUXURY));
    }

    @Test
    void testGetCarTypeAndEngine() {
        Car car = CarFactory.createCar(CarType.LUXURY, new MediumEngine());
        assertInstanceOf(LuxuryCar.class, car);
        assertInstanceOf(MediumEngine.class, car.getEngine());
    }

}
