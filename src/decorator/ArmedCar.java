package decorator;

import models.car.Car;

public class ArmedCar extends DecoratedCar {

	/**
	 * 
	 */
	
	private static final long serialVersionUID = -626764864052160666L;

	private Gun gun;
	
	public ArmedCar(Car car) {
		super(car);
	}
	
	public ArmedCar(Car car, Gun gun) {
		super(car);
		this.gun = gun;
	}

	@Override
	public void decorate() {
		car.startEngine();
		gun.fire();
	}

}
