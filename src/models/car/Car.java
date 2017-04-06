package models.car;

import models.car.engine.IEngine;

public abstract class Car  extends  Vehicle {
	
	/**
	 * 
	 */
	
	private static final long serialVersionUID = -8417163300419420210L;

	private CarType carType;
	
	private String name;
	
	private Integer iNumber;
	
	public Integer getiNumber() {
		return iNumber;
	}

	public void setiNumber(Integer iNumber) {
		this.iNumber = iNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public CarType getCarType() {
		return carType;
	}

	public void setCarType(CarType carType) {
		this.carType = carType;
	}

	public Car(CarType carType){
		this.carType = carType;
	}
	
	public Car(){
	}
	
	public Car(CarType carType, IEngine engine){
		this.carType = carType;
		this.engine = engine;
	}
	
	protected void construct(){
//		System.out.println("Car type  = : " + carType);
	}
	
	public String toString(){
		return carType + " - " + name + " - " + iNumber + "- " + Id;
	}
	

}




