package iterator;

import java.util.ArrayList;
import java.util.List;
import factory.CarFactory;
import models.car.Car;
import models.car.CarType;

public class CarContainer implements IContainer{

	private List<Car> listCar;
	
	public CarContainer(){
		listCar = new ArrayList<Car>();
		listCar.add(CarFactory.getCar(CarType.LUXURY));
		listCar.add(CarFactory.getCar(CarType.SEDAN));
		listCar.add(CarFactory.getCar(CarType.SMALL));
	}
	
	@Override
	public IIterator createIterator() {
		IIterator carIterator = new CarIterator();
		return carIterator;
	}
	
	private class CarIterator implements IIterator {
		private int index = 0;
		
		@Override
		public Boolean hasNext() {
			if(index >= listCar.size()){
				return false;
			}
			return true;
		}

		@Override
		public Object next() {
			if(this.hasNext()){
				return listCar.get(index++);
			}
			return null;
		}
	}

}
