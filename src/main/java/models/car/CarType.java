package models.car;

public enum CarType {

	SMALL, 
	
	SEDAN,
	
	LUXURY,
	
	UNKNOWN;
	
	
	public static CarType getCarType(Integer carTypeId){
		
		switch (carTypeId) {
		case 1:
			return SMALL;
		case 2:
			return SEDAN;
		case 3:
			return LUXURY;
		default:
			return UNKNOWN;
		}
	}
	
}
