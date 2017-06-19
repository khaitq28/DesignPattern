package bridge;

import models.car.Car;
import models.car.CarType;
import models.car.engine.MediumEngine;
import models.car.engine.SmallEngine;
import factory.CarFactory;

public class Bridge {
	
	
	public static void bridgePattern(){
		
		System.out.println("Example of bridge patter");
		System.out.println("Bridge patter");
		
		Car luxuryCar = CarFactory.createCar(CarType.LUXURY, new MediumEngine());
		Car sedanCar = CarFactory.createCar(CarType.SEDAN, new SmallEngine());
		
		luxuryCar.startEngine();
		sedanCar.startEngine();

	}
	

}
