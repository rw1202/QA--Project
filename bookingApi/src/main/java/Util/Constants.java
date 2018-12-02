package Util;

public class Constants {
// DB REPO Constants
public static final String U_C_QUERY= "Select a FROM User a";	
	
public static final String B_C_QUERY= "Select a FROM Booking a";

public static final String U_NAME= "primary";

public static final String DEL_MESSAGE=  "{\"message\": \"Sucessfully deleted\"}";

public static final String ADD_MESSAGE= "{\"message\":\"Successfully Added\"}";

public static final String UPD_MESSAGE= "{\"message\": \"Sucessfully updated\"}";

// User EP Constants

public static final String U_SUPERPATH= "/User";

public static final String GA_PATH = "/getAllUsers";

public static final String PROD_JSON= "application/json";

public static final String GU_PATH= "/getUser/{Id}";

public static final String AU_PATH= "/addUser";

public static final String DELU_PATH = "/deleteUser/{Id}";

public static final String UPDU_PATH = "/updateUser/{Id}";

// Bookings EP Constants

public static final String BK_SUPERPATH= "/Booking";

public static final String GET_ALL_BKS = "/getAllBookings";

public static final String GET_BKS = "/getBooking/{Id}";

public static final String ADD_BK= "/addBooking";

public static final String DEL_BK= "/deleteBooking/{Id}";

public static final String UPD_BK= "/updateBooking/{Id}";




}
