package pattern.builder;

import pattern.models.car.Car;
import pattern.models.car.CarType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarBuilderTest {

    private CarBuilder builder;

    @Test
    void testBuildCar() {

        builder = new LuxuryCarBuilder();
        CarDirectorBuilder directorBuilder = new CarDirectorBuilder(builder);
        directorBuilder.buildCar();
        Car car = directorBuilder.getCar();

        assertEquals(123, (int) car.getiNumber());
        assertSame(CarType.LUXURY, car.getCarType());

    }

    @Test
    void testGetCar() {
        builder = new SedanCarBuilder();
        CarDirectorBuilder directorBuilder = new CarDirectorBuilder(builder);
        directorBuilder.buildCar();
        Car car = directorBuilder.getCar();

        assertEquals(123, (int) car.getiNumber());
        assertSame(CarType.SEDAN, car.getCarType());
    }



}
