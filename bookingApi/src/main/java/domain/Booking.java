package domain;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;




@Entity

public class Booking {
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "bookingId")
	private Long bookingId;
	@Column(length= 100)
	private String dateAndTime;

	@Column(name ="userId")
	private Long userId;



	


	

	Booking(){};
	
	public Booking(Long bookingId, String dateAndTime, Long userId) {
		this.bookingId=bookingId;
		this.dateAndTime=dateAndTime;

		this.userId=userId;
		

		

	
	}
	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getDateAndTime() {
		return dateAndTime;
	}
	public void setDateAndTime(String dateAndTime) {
		this.dateAndTime = dateAndTime;
	}
	public void setBookingId(Long bookingId) {
		this.bookingId = bookingId;
	}
	public Long getBookingId() {
		return bookingId;
	} 
	

}
