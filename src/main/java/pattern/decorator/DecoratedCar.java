package pattern.decorator;

import pattern.models.car.Car;
import pattern.models.car.CarType;

public  abstract class DecoratedCar extends Car {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3781521988148528719L;

	protected Car car;
	
	public DecoratedCar(CarType carType) {
		super(carType);
	}
	
	public DecoratedCar(Car car) {
		super(car.getCarType());
		this.car = car;
		this.engine = car.getEngine();
	}

	@Override
	public void startEngine() {
		engine.startEngine();
	}
	
	public abstract void decorate();
	
	

}
