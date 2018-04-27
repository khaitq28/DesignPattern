package models.car;

public class SedanCar extends Car {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4131149387144007503L;

	public SedanCar(){
		super(CarType.SEDAN);
		construct();
	}

	@Override
	protected void construct() {
		super.construct();
		
	}

	@Override
	public void startEngine() {
		System.out.println("Sedan start engine");
		engine.startEngine();
	}
}
