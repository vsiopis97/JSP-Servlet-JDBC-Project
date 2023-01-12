package bsiopis.webapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * <h1>Address Entity Class</h1> 
 * The secondaryEntity class of the application, it
 * consists of the two non-mandatory address values of the user. Connects with the
 * database columns via Hibernate annotations.
 * It is mapped to the User Entity via One-to-One mapping.
 * 
 * @author Bill Siopis
 * @version 1.0
 * @since 2022-12-15
 * 
 */

@Entity
@Table(name = "address")
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "work_address")
	private String workAddress;

	@Column(name = "home_address")
	private String homeAddress;

	public Address() {

	}

	public Address(String workAddress, String homeAddress) {
		this.workAddress = workAddress;
		this.homeAddress = homeAddress;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getWorkAddress() {
		return workAddress;
	}

	public void setWorkAddress(String workAddress) {
		this.workAddress = workAddress;
	}

	public String getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(String homeAddress) {
		this.homeAddress = homeAddress;
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", workAddress=" + workAddress + ", homeAddress=" + homeAddress + "]";
	}

}
