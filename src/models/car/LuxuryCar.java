package models.car;

import models.car.engine.IEngine;

public class LuxuryCar extends Car {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8804686995088770015L;

	public LuxuryCar() {
		super(CarType.LUXURY);
		construct();
	}
	
	public LuxuryCar(IEngine engine) {
		super(CarType.LUXURY, engine);
		construct();
	}
	
	
	@Override
	protected void construct(){
		super.construct();
	}

	@Override
	public void startEngine() {
		System.out.println("Luxury start engine");
		engine.startEngine();
	}



}
