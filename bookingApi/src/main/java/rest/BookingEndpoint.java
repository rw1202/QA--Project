package rest;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;



import repository.UserBookingRepo;


@Path ("/Booking")

public class BookingEndpoint {
	
	
	@Inject
	private UserBookingRepo service;

	@Path("/getAllBookings")
	@GET
	@Produces({ "application/json" })
	public String getAllBookings() {
		return service.getAllBookings();
	}
	
	@Path("/getBooking/{Id}")
	@GET
	@Produces({ "application/json" })
	public String getBooking(@PathParam("Id") Long Id) {
		return service.getBooking(Id);
	}

	@Path("/addBooking")
	@POST
	@Produces({ "application/json" })
	public String addBooking(String dateAndTime) {
		return service.addBooking(dateAndTime);
	}

	@Path("/deleteBooking/{Id}")
	@GET
	@Produces({ "application/json" })
	public String deleteBooking(@PathParam("Id") Long Id) {
		return service.deleteBooking(Id);
	}
	@Path("/updateBooking/{Id}")
	@PUT
	@Produces({"application/json"})
	public String updateBooking(@PathParam("Id") Long Id, String dateAndTime ) 
	{
		return service.updateBooking(Id, dateAndTime);
	}

	public void setService(UserBookingRepo service) {
		this.service = service;
	}

}





