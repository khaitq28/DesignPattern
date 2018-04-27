package builder;

import models.car.Car;

public abstract class CarBuilder {
	
	protected Car car = null;
	
	public abstract void buildHead();
	
	public abstract void buildWheel();
	
	public abstract void buildBody();
	
	public abstract Car getCar();

}
