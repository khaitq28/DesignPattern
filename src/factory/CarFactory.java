package factory;

import models.car.Car;
import models.car.CarType;
import models.car.LuxuryCar;
import models.car.SedanCar;
import models.car.SmallCar;
import models.car.engine.IEngine;

public class CarFactory {
	
	
	public static Car getCar(CarType type){
		
		Car car = null;
		switch (type) {
		case SEDAN:
			car = new SedanCar();
			break;
		case LUXURY:
			car = new LuxuryCar();
			break;
		case SMALL:
			car = new SmallCar();
			break;
		default:
			break;
		}
		return car;
	}
	
	public static Car getCar(CarType carType, IEngine engine){
		Car car = getCar(carType);
		car.setEngine(engine);
		return car;
	}

}
