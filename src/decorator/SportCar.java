package decorator;

import models.car.Car;

public class SportCar extends DecoratedCar {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3573271123579646794L;

	public SportCar(Car car) {
		super(car);
	}

	@Override
	public void decorate() {
		car.startEngine();
		
		System.out.println(" Convertibe....");
		
	}

}
