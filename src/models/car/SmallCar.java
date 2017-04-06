package models.car;

public class SmallCar extends Car {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4631542583480007065L;

	public SmallCar() {
		super(CarType.SMALL);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void startEngine() {
		System.out.println("Small start engine");
		engine.startEngine();
	}

}
