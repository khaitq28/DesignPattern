package adapter;

import java.util.List;

import models.car.Car;


public class CarController {
	
	public  void importAllCar(List<Car> listCar) {
		saveToDb(listCar);
		
		
		
		displayNewItems(listCar);
		
	}
	
	private void saveToDb(List<Car> listCar){
		
	}
	
	private void displayNewItems(List<Car> listCar){
		for(Car car : listCar){
			System.out.println(car.toString());
		}
		
		
	}
	

}
