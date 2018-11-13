package rest;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import repository.UserBookingRepo;

@Path ("/User")

public class UserEndpoint {

	@Inject
	private UserBookingRepo service;

	@Path("/getAllUsers")
	@GET
	@Produces({ "application/json" })
	public String getAllUsers() {
		return service.getAllUsers();
	}
	
	@Path("/getUser/{Id}")
	@GET
	@Produces({ "application/json" })
	public String getUser(@PathParam("Id") Long Id) {
		return service.getUser(Id);
	}

	@Path("/addUser")
	@POST
	@Produces({ "application/json" })
	public String addUser(String userName) {
		return service.addUser(userName);
	}

	@Path("/deleteUser/{Id}")
	@GET
	@Produces({ "application/json" })
	public String deleteUser(@PathParam("Id") Long Id) {
		return service.deleteUser(Id);
	}
	@Path("/updateUser/{Id}")
	@PUT
	@Produces({"application/json"})
	public String updateUser(@PathParam("Id") Long Id, String userName ) 
	{
		return service.updateUser(Id, userName);
	}

	public void setService(UserBookingRepo service) {
		this.service = service;
	}

}


