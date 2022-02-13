package pattern.factory;

import pattern.models.car.*;
import pattern.models.car.engine.IEngine;

public class CarFactory {

	/**
	 * @param type
	 * @return Car
	 */
	public static Car createCar(CarType type){
		
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

	/**
	 *
	 * @param carType
	 * @param engine
	 * @return Car
	 */
	public static Car createCar(CarType carType, IEngine engine){
		Car car = createCar(carType);
		car.setEngine(engine);
		return car;
	}

}
