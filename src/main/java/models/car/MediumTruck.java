package models.car;

public class MediumTruck extends Truck {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7274873825146598959L;

	public MediumTruck() {
		super(TruckType.MEDIUM);
	}

	@Override
	public void startEngine() {
		engine.startEngine();
	}

}
