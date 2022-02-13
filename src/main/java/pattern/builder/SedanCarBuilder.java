package pattern.builder;

import pattern.factory.CarFactory;
import pattern.models.car.Car;
import pattern.models.car.CarType;

public class SedanCarBuilder extends CarBuilder {

	
	public SedanCarBuilder(){
		this.car = CarFactory.createCar(CarType.SEDAN);
	}
	
	@Override
	public void buildHead() {
		car.setiNumber(123);
		System.out.println("build sedan Car header");
	}

	@Override
	public void buildWheel() {
		System.out.println("build sedan Car wheel");
	}

	@Override
	public void buildBody() {
		car.setName("new sedan name");
		System.out.println("build sedan Car body");

	}

	@Override
	public Car getCar() {
		return car;
	}

}
