package adapter;

import java.util.HashMap;
import java.util.Map;

public class CarManager {

	private static CarManager instance;
	
	private CarManager(){
		
	}
	
	private Map<Integer, String> listCarName  = new HashMap<Integer, String>();
	
	public static CarManager getInstance(){
		if (instance == null){
			instance = new CarManager();
		}
		return instance;
	}
	
	public  Map<Integer, String> getAllCar(){
		
		listCarName.put(1, "car1");
		listCarName.put(2, "car2");
		listCarName.put(3, "car3");
//		listCarName.put(4, "car4");
		
		return listCarName;
	}
	
}
