package factory;

import models.car.BigTruck;
import models.car.MediumTruck;
import models.car.Truck;
import models.car.TruckType;

public class TruckFactory {
	
	public static Truck createTruck(TruckType type){
		
		Truck truck = null;
		switch(type){
		case BIG:
			truck = new BigTruck();
			break;
		case MEDIUM:
			truck = new MediumTruck();
		default:
			
		}
		
		return truck;
	}

}
