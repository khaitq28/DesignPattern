package adapter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import factory.CarFactory;
import models.car.Car;
import models.car.CarType;

public class CarListAdapter {
	
	private CarManager carManager;
	
	public CarListAdapter(CarManager carManager){
		this.carManager = carManager;
	}
	
	public List<Car> getListCarImport(){
		
		List<Car> listCarImport = new ArrayList<Car>();
		
		Map<Integer, String> listCarName 		=  carManager.getAllCar();
		Iterator<Entry<Integer, String>> it  	=  listCarName.entrySet().iterator();
		while(it.hasNext()){
			Entry<Integer, String>	e 			= it.next();
			Integer					carTypeId 	= e.getKey();
			String					carName 	= e.getValue();
			Car car 							= CarFactory.createCar(CarType.getCarType(carTypeId));
			car.setName(carName);
			listCarImport.add(car);
		}
		return listCarImport;
	}
	

}
