package domain;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;




@Entity

public class Booking {
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "bookingId")
	private Long bookingId;
	@Column(length= 100)
	private String dateAndTime;
	
	

	Booking(){};
	
	public Booking(Long bookingId, String dateAndTime) {
		this.bookingId=bookingId;
		this.dateAndTime=dateAndTime;
	
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
