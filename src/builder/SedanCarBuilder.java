package builder;

import factory.CarFactory;
import models.car.Car;
import models.car.CarType;

public class SedanCarBuilder extends CarBuilder {

	
	public SedanCarBuilder(){
		this.car = CarFactory.getCar(CarType.SEDAN);
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
