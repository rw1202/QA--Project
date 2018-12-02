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


@Path (Constants.BK_SUPERPATH)

public class BookingEndpoint {
	
	
	

	
	@Inject
	private UserBookingRepo service;

	@Path(Constants.GET_ALL_BKS)
	@GET
	@Produces({ Constants.PROD_JSON })
	public String getAllBookings() {
		return service.getAllBookings();
	}
	
	@Path(Constants.GET_BKS)
	@GET
	@Produces({ Constants.PROD_JSON })
	public String getBooking(@PathParam("Id") Long Id) {
		return service.getBooking(Id);
	}

	@Path(Constants.ADD_BK)
	@POST
	@Produces({Constants.PROD_JSON })
	public String addBooking(String dateAndTime, Long userId) {
		return service.addBooking(dateAndTime, userId);
	}

	@Path(Constants.DEL_BK)
	@GET
	@Produces({ Constants.PROD_JSON })
	public String deleteBooking(@PathParam("Id") Long Id) {
		return service.deleteBooking(Id);
	}
	@Path(Constants.UPD_BK)
	@PUT
	@Produces({Constants.PROD_JSON})
	public String updateBooking(@PathParam("Id") Long Id, String dateAndTime, Long userId ) 
	{
		return service.updateBooking(Id, dateAndTime, userId);
	}

	public void setService(UserBookingRepo service) {
		this.service = service;
	}

}





