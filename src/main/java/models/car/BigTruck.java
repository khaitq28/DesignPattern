package models.car;

public class BigTruck extends Truck {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3354583755090177679L;

	public BigTruck() {
		super(TruckType.BIG);
	}

	@Override
	public void startEngine() {
		engine.startEngine();
	}

}
