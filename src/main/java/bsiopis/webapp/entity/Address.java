package bsiopis.webapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Address Entity Class. The secondaryEntity class of the application, it
 * consists of the two non-mandatory address values of the user. Connects with
 * the database columns via Hibernate annotations. It is mapped to the User
 * Entity via One-to-One mapping.
 * 
 * @author Bill Siopis
 * @version 1.0
 * @since 2022-12-15
 * 
 */

@Entity
@Table(name = "address")
public class Address {

	/**
	 * Represents the Id column of the Database Table "Address"
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	/**
	 * Represents the work_address column of the Database Table "Address"
	 */
	@Column(name = "work_address")
	private String workAddress;

	/**
	 * Represents the home_address column of the Database Table "Address"
	 */
	@Column(name = "home_address")
	private String homeAddress;

	/**
	 * No argument constructor
	 */
	public Address() {

	}

	/**
	 * Argument constructor
	 * 
	 * @param workAddress the work address of a User
	 * @param homeAddress the home address of a User
	 */
	public Address(String workAddress, String homeAddress) {
		this.workAddress = workAddress;
		this.homeAddress = homeAddress;
	}

	/**
	 * Getter method of the id parameter
	 * 
	 * @return returns the Id of the Address object
	 */
	public int getId() {
		return id;
	}

	/**
	 * Setter method of the Id parameter
	 * 
	 * @param id the Id of the Address object
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Getter method of the workAddress parameter
	 * 
	 * @return returns the Work Address of the Address object (User's Work Address)
	 */
	public String getWorkAddress() {
		return workAddress;
	}

	/**
	 * Setter method of the workAddress parameter
	 * 
	 * @param workAddress the Work Address of the Address object (User's Work
	 *                    Address)
	 */
	public void setWorkAddress(String workAddress) {
		this.workAddress = workAddress;
	}

	/**
	 * Getter method of the homeAddress parameter
	 * 
	 * @return returns the Home Address of the Address object (User's Home Address)
	 */
	public String getHomeAddress() {
		return homeAddress;
	}

	/**
	 * Setter method of the homeAddress parameter
	 * 
	 * @param homeAddress the Home Address of the Address object (User's Home
	 *                    Address)
	 */
	public void setHomeAddress(String homeAddress) {
		this.homeAddress = homeAddress;
	}

}
