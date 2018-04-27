package iterator;

import factory.CarFactory;
import models.car.Car;
import models.car.CarType;

import java.util.ArrayList;
import java.util.List;

public class CarContainer implements IContainer{

	private List<Car> listCar;
	
	public CarContainer(){
		listCar = new ArrayList<Car>();
		listCar.add(CarFactory.createCar(CarType.LUXURY));
		listCar.add(CarFactory.createCar(CarType.SEDAN));
		listCar.add(CarFactory.createCar(CarType.SMALL));
	}
	
	public IIterator createIterator() {
		IIterator carIterator = new CarIterator();
		return carIterator;
	}
	
	private class CarIterator implements IIterator {
		private int index = 0;
		
		public Boolean hasNext() {
			if(index >= listCar.size()){
				return false;
			}
			return true;
		}

		public Object next() {
			if(this.hasNext()){
				return listCar.get(index++);
			}
			return null;
		}
	}

}
