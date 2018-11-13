package Util;



import com.google.gson.Gson;

import domain.Booking;
import domain.User;



public class JSONUtil {
	private Gson gson;

	public JSONUtil() {
		this.gson = new Gson();
	}

	public String getJSONForObject(Object obj) {
		return gson.toJson(obj);
	}

	public <T> T getObjectForJSONBooking(String jsonString, Long userId, Class<T> class1) {
		return gson.fromJson(jsonString, class1);
	}

	public <T> T getObjectForJSONUser(String jsonString, Class<T> class2) {
		return gson.fromJson(jsonString, class2);
	}

	
}


