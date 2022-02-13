package pattern.bridge;

import pattern.factory.CarFactory;
import pattern.models.car.Car;
import pattern.models.car.CarType;
import pattern.models.car.engine.MediumEngine;
import pattern.models.car.engine.SmallEngine;

public class Bridge {
	
	
	public static void bridgePattern(){
		
		System.out.println("Example of pattern.bridge patter");
		System.out.println("Bridge patter");
		
		Car luxuryCar = CarFactory.createCar(CarType.LUXURY, new MediumEngine());
		Car sedanCar = CarFactory.createCar(CarType.SEDAN, new SmallEngine());
		
		luxuryCar.startEngine();
		sedanCar.startEngine();

	}
	

}
