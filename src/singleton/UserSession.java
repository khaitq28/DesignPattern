package singleton;

import java.util.HashMap;
import java.util.Map;

public class UserSession {

	private static UserSession userSession;
	
	private Map<Object, Object> dataMap = null;
	
	public Map<Object, Object> getDataMap() {
		return dataMap;
	}

	public void setDataMap(Map<Object, Object> dataMap) {
		this.dataMap = dataMap;
	}

	public static  UserSession getInstance(){
		if(userSession == null){
			userSession = new UserSession();
		}
		return userSession;
	}

	private UserSession(){
		
	}
	
	public void addData(Object key, Object value){ 
		if( dataMap == null){
			dataMap = new HashMap<Object, Object>();
		}
		dataMap.put(key, value);
	}

		
		
	
}
