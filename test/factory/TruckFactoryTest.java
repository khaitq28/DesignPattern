package factory;

import static org.junit.Assert.*;
import models.car.BigTruck;
import models.car.MediumTruck;
import models.car.TruckType;

import org.junit.Test;

import sun.nio.cs.ext.Big5;

public class TruckFactoryTest {

	@Test
	public void testGetTruck() {
		assertTrue(TruckFactory.createTruck(TruckType.MEDIUM) instanceof MediumTruck);
		
		assertTrue(TruckFactory.createTruck(TruckType.BIG) instanceof BigTruck);

	}

}
