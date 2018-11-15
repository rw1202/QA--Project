package repository;

public interface UserBookingRepo {
	String getAllBookings();

	String addBooking(String dateAndTime, Long userId);

	String deleteBooking(Long Id);

	String getBooking(Long Id);

	String updateBooking(Long Id, String dateAndTime, Long userId);

	String getAllUsers();

	String getUser(Long Id);

	String addUser(String userName);

	String deleteUser(Long Id);

	String updateUser(Long Id, String userName);

}
