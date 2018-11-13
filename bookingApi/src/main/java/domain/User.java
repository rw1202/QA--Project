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
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "User_Id")
	private Long userId;
	@Column(length = 100)
	 private String userName;
	@JoinColumn(name = "User_Id", referencedColumnName ="User_Id")
	@OneToMany (fetch = FetchType.EAGER, cascade= CascadeType.ALL)
    private List<Booking> bookings;
	
	User(){};

	public  User(Long userId, String userName) {
		this.userId= userId;
		this.userName= userName;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	
	

}
