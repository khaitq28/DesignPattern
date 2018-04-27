package builder;

import models.car.Car;

public class CarDirectorBuilder {

	
	private CarBuilder carBuilder = null;
	
	public CarDirectorBuilder(CarBuilder carBuilder){
		this.carBuilder = carBuilder;
	}
	
	public void buildCar(){
		carBuilder.buildBody();
		carBuilder.buildHead();
		carBuilder.buildWheel();
	}

	public Car getCar(){
		return carBuilder.getCar();
	}

	
}
