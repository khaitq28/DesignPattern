package pattern.factory;

import pattern.models.car.BigTruck;
import pattern.models.car.MediumTruck;
import pattern.models.car.Truck;
import pattern.models.car.TruckType;

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
