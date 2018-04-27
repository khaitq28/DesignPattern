package models.car;

import models.car.engine.IEngine;

public abstract class Truck extends Vehicle {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4429221422505016207L;
	
	private TruckType truckType;
	
	public TruckType getTruckType() {
		return truckType;
	}

	public void setTruckType(TruckType truckType) {
		this.truckType = truckType;
	}

	public Truck(TruckType type){
		this.truckType = type;
	}
	
	public Truck(TruckType type, IEngine engine){
		this.truckType = type;
		this.engine = engine;
	}
	

}
