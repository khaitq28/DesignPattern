package global;

import iterator.CarContainer;
import iterator.IIterator;
import decorator.ArmedCar;
import decorator.Gun;
import decorator.SportCar;
import singleton.UserSession;
import adapter.CarController;
import adapter.CarListAdapter;
import adapter.CarManager;
import builder.CarBuilder;
import builder.CarDirectorBuilder;
import builder.LuxuryCarBuilder;
import builder.SedanCarBuilder;
import models.car.Car;
import models.car.CarType;
import models.car.engine.MediumEngine;
import models.car.engine.SmallEngine;
import factory.CarFactory;

public class Pattern {

	public static void main(String[] args) {

//		builderPattern();
//		singletonPattern();
//		adapterPattern();
		
//		decoratorPattern();
		iteratorPattern();
	}
	
	public static void iteratorPattern(){
		CarContainer container = new CarContainer();
		IIterator iterator = container.createIterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
	}
	
	public static void decoratorPattern(){
		Car luxuryCar = CarFactory.getCar(CarType.LUXURY, new MediumEngine());
		ArmedCar car = new ArmedCar(luxuryCar, new Gun());
		car.decorate();
		
		Car sedanCar = CarFactory.getCar(CarType.SEDAN, new SmallEngine());
		SportCar sportCar= new SportCar(sedanCar);
		sportCar.decorate();
	}
	
	public static void bridgePattern(){
		Car luxuryCar = CarFactory.getCar(CarType.LUXURY, new MediumEngine());
		Car sedanCar = CarFactory.getCar(CarType.SEDAN, new SmallEngine());
		
		luxuryCar.startEngine();
		sedanCar.startEngine();

	}
	
	public static void builderPattern() {
		CarBuilder carBuilder = new LuxuryCarBuilder();
		CarDirectorBuilder director = new CarDirectorBuilder(carBuilder);
		director.buildCar();
		System.out.println(director.getCar().toString());
		
		carBuilder = new SedanCarBuilder();
		director = new CarDirectorBuilder(carBuilder);
		director.buildCar();
		System.out.println(director.getCar().toString());
	}
	
	public static void factoryPattern(){
		Car c1 = CarFactory.getCar(CarType.LUXURY);
	}
	
	public static void singletonPattern(){
		UserSession session = UserSession.getInstance();
		session.addData(1, new String("abcd"));
		session.addData(2, new String("fds"));
		System.out.println(session.getDataMap());
	}
	
	public static void adapterPattern(){
		CarController carController = new CarController();
		CarListAdapter carListAdapter = new CarListAdapter(CarManager.getInstance());
		carController.importAllCar(carListAdapter.getListCarImport());
	}

}
