package decorator;

import decorator.component.Gps;
import models.car.Car;
import models.car.CarType;

/**
 * Created by khaitq
 * Date: 29/04/2018 - Paris, France
 * Github:  https://github.com/quangkhai88
 */

public class RegularCar extends DecoratedCar {

    private Gps gps;

    @Override
    public void decorate() {
        if (gps != null) {
            gps.activeGps();
        }
    }

    public RegularCar(CarType carType) {
        super(carType);
    }

    public RegularCar(Car car) {
        super(car);
    }

    public RegularCar(Car car, Gps gps) {
        super(car);
        this.gps = gps;
    }
}
