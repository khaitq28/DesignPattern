package builder;

import models.car.Car;
import models.car.CarType;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class CarBuilderTest {

    private CarBuilder builder;

    @Test
    public void testBuildCar() {

        builder = new LuxuryCarBuilder();
        CarDirectorBuilder directorBuilder = new CarDirectorBuilder(builder);
        directorBuilder.buildCar();
        Car car = directorBuilder.getCar();

        assertTrue(car.getiNumber() == 123);
        assertTrue(car.getCarType() == CarType.LUXURY);

    }

    @Test
    public void testGetCar() {
        CarDirectorBuilder directorBuilder = new CarDirectorBuilder(builder);
    }



}
