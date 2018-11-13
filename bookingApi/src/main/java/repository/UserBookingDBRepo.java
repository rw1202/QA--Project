package repository;

import java.util.Collection;
import static javax.transaction.Transactional.TxType.*;

import javax.enterprise.inject.Default;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import Util.JSONUtil;
import domain.Booking;
import domain.User;

@Transactional(SUPPORTS)
@Default
public class UserBookingDBRepo implements UserBookingRepo {
	@Inject
	private JSONUtil util;
	@PersistenceContext(unitName = "primary")
	private EntityManager manager;
	


	public String getAllBookings() {
		Query query = manager.createQuery("Select a FROM Booking a");
		Collection<Booking> BList = (Collection<Booking>) query.getResultList();
		return util.getJSONForObject(BList);

	}

	@Transactional(REQUIRED)
	public String addBooking(String dateAndTime) {
		Booking bk1 = util.getObjectForJSON(dateAndTime, Booking.class);
		manager.persist(bk1);
		return "{\"message\":\"Booking Added\"}";
	}

	@Transactional(REQUIRED)
	public String deleteBooking(Long Id) {
		Booking bkInDb = findBooking(Id);
		if (bkInDb != null) {
			manager.remove(bkInDb);
		}
		return "{\"message\": \"Booking sucessfully deleted\"}";
	}

	public String getBooking(Long Id) {
		Booking bk1 = manager.find(Booking.class, Id);
		return util.getJSONForObject(bk1);

	}

	@Transactional(REQUIRED)
	public String updateBooking(Long Id, String dateAndTime) {

		Booking updatedBk = util.getObjectForJSON(dateAndTime, Booking.class);
		Booking bkFromDB = findBooking(Id);
		if (bkFromDB != null) {
			bkFromDB = updatedBk;
			manager.merge(bkFromDB);
		}
		return "{\"message\": \"Booking sucessfully updated\"}";
	}

	private Booking findBooking(Long Id) {
		return manager.find(Booking.class, Id);
	}

	

	public void setUtil(JSONUtil util) {
		this.util = util;
	}


	public String getAllUsers() {
		Query query = manager.createQuery("Select a FROM User a");
		Collection<User> UList = (Collection<User>) query.getResultList();
		return util.getJSONForObject(UList);

		
	}

	
	public String getUser(Long Id) {
		User U1 = manager.find(User.class, Id);
		return util.getJSONForObject(U1);

		
	}

	@Transactional(REQUIRED)
	public String addUser(String userName) {
		User u1 = util.getObjectForJSON(userName, User.class);
		manager.persist(u1);
		return "{\"message\":\"User Added. Your User Id is "+u1.getUserId()+"\"}";
	}

	@Transactional(REQUIRED)
	public String deleteUser(Long Id) {
		User UInDb = findUser(Id);
		if (UInDb != null) {
			manager.remove(UInDb);
		}
		return "{\"message\": \"User sucessfully deleted\"}";
	}

	@Transactional(REQUIRED)
	public String updateUser(Long Id, String userName) {
		User updatedU = util.getObjectForJSON(userName, User.class);
		User UFromDB = findUser(Id);
		if (UFromDB != null) {
			UFromDB = updatedU;
			manager.merge(UFromDB);
		}
		return "{\"message\": \"User sucessfully updated\"}";
	}
	
	private User findUser(Long Id) {
		return manager.find(User.class, Id);
	}

	}

