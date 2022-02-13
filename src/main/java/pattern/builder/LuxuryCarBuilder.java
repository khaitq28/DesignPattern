package pattern.builder;
import pattern.factory.CarFactory;
import pattern.models.car.Car;
import pattern.models.car.CarType;


public class LuxuryCarBuilder extends CarBuilder {
	
	public LuxuryCarBuilder(){
		this.car = CarFactory.createCar(CarType.LUXURY);
	}
	
	@Override
	public void buildHead() {
		car.setiNumber(123);
		System.out.println("build Luxury Car header");
	}

	@Override
	public void buildWheel() {
		System.out.println("build Luxury Car wheel");
	}

	@Override
	public void buildBody() {
		car.setName("new luxury name");
		System.out.println("build Luxury Car body");

	}

	@Override
	public Car getCar() {
		return car;
	}

}
