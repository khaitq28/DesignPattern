package bridge;

import models.car.Car;
import models.car.CarType;
import models.car.engine.MediumEngine;
import models.car.engine.SmallEngine;
import factory.CarFactory;

public class Bridge {
	
	
	public static void bridgePattern(){
		
		System.out.println("Example of bridge patter");
		
		Car luxuryCar = CarFactory.getCar(CarType.LUXURY, new MediumEngine());
		Car sedanCar = CarFactory.getCar(CarType.SEDAN, new SmallEngine());
		
		luxuryCar.startEngine();
		sedanCar.startEngine();

	}
	

}
