package rest;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import Util.Constants;
import repository.UserBookingRepo;

@Path (Constants.U_SUPERPATH)

public class UserEndpoint {

	public static final String UPDU_PATH = "/updateUser/{Id}";
	@Inject
	private UserBookingRepo service;

	@Path(Constants.GA_PATH)
	@GET
	@Produces({ Constants.PROD_JSON })
	public String getAllUsers() {
		return service.getAllUsers();
	}
	
	@Path(Constants.GU_PATH)
	@GET
	@Produces({ Constants.PROD_JSON })
	public String getUser(@PathParam("Id") Long Id) {
		return service.getUser(Id);
	}

	@Path(Constants.AU_PATH)
	@POST
	@Produces({ Constants.PROD_JSON })
	public String addUser(String userName) {
		return service.addUser(userName);
	}

	@Path(Constants.DELU_PATH)
	@GET
	@Produces({ Constants.PROD_JSON })
	public String deleteUser(@PathParam("Id") Long Id) {
		return service.deleteUser(Id);
	}
	@Path(Constants.UPDU_PATH)
	@PUT
	@Produces({Constants.PROD_JSON})
	public String updateUser(@PathParam("Id") Long Id, String userName ) 
	{
		return service.updateUser(Id, userName);
	}

	public void setService(UserBookingRepo service) {
		this.service = service;
	}

}


