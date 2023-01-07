package simpleWebApplication.User;

import javax.persistence.*;

@Entity
@Table(name="users2")
public class User2 {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="waddress")
	private String waddress=null;
	
	@Column(name="haddress")
	private String haddress=null;
	
	public User2() {
		
	}

	public User2(String waddress, String haddress) {
		this.waddress = waddress;
		this.haddress = haddress;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getWaddress() {
		return waddress;
	}

	public void setWaddress(String waddress) {
		this.waddress = waddress;
	}

	public String getHaddress() {
		return haddress;
	}

	public void setHaddress(String haddress) {
		this.haddress = haddress;
	}
	
}
