package bsiopis.webapp.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * User Entity Class. The base Entity class of the application, it consists of
 * all the fields that store the data of the user. Connects with the database
 * columns via Hibernate annotations. Also includes One-to-One mapping with the
 * Address Entity.
 * 
 * @author Bill Siopis
 * @version 1.0
 * @since 2022-12-15
 * 
 */
@Entity
@Table(name = "users")
public class User {

	/**
	 * Represents the Id column of the Database Table "Users"
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	/**
	 * Represents the firstName column of the Database Table "Users"
	 */
	@Column(name = "firstName")
	@NotNull(message = "is required!")
	@Size(min = 1, max = 30, message = "required, 1-30 characters!")
	private String firstName;

	/**
	 * Represents the surname column of the Database Table "Users"
	 */
	@Column(name = "surname")
	@NotNull(message = "is required!")
	@Size(min = 1, max = 30, message = "required, 1-30 characters!")
	private String surname;

	/**
	 * Represents the gender column of the Database Table "Users"
	 */
	@Column(name = "gender")
	@NotNull(message = "is required!")
	@Size(min = 1, message = "is required!")
	private String gender;

	/**
	 * Represents the date of birth column of the Database Table "Users"
	 */
	@Column(name = "birthdate")
	@NotNull(message = "is required!")
	@Size(min = 1, message = "is required!")
	private String birthdate;

	/**
	 * Represents the link to the Database Table "Address" of the Database Table
	 * "Users"
	 */
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "address_id")
	private Address address;

	/**
	 * No arg constructor
	 */
	public User() {

	}

	/**
	 * Argument constructor
	 * 
	 * @param firstName a User's first Name
	 * @param surname   a User's surname
	 * @param gender    a User's gender
	 * @param birthdate a User date of birth
	 */
	public User(String firstName, String surname, String gender, String birthdate) {

		this.firstName = firstName;
		this.surname = surname;
		this.gender = gender;
		this.birthdate = birthdate;
	}

	/**
	 * Getter method of the id parameter
	 * 
	 * @return returns the Id of the User object
	 */
	public int getId() {
		return id;
	}

	/**
	 * Setter method of the id parameter
	 * 
	 * @param id the Id of the User
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Getter method of the firstName parameter
	 * 
	 * @return returns the First Name of the User object
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Setter method of the firstName parameter
	 * 
	 * @param firstName the First Name of the User Object
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * Getter method of the surname parameter
	 * 
	 * @return returns the Surname of the User object
	 */
	public String getSurname() {
		return surname;
	}

	/**
	 * Setter method of the surname parameter
	 * 
	 * @param surname the Surname of the User
	 */
	public void setSurname(String surname) {
		this.surname = surname;
	}

	/**
	 * Getter method of the gender parameter
	 * 
	 * @return returns the Gender of the User object
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * Setter method of the gender parameter
	 * 
	 * @param gender the Gender of the User
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * Getter method of the birthdate parameter
	 * 
	 * @return returns the Date of Birth of the User object
	 */
	public String getBirthdate() {
		return birthdate;
	}

	/**
	 * Setter method of the birthdate parameter
	 * 
	 * @param birthdate the Date of Birth of the User
	 */
	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}

	/**
	 * Getter method of the address object parameter
	 * 
	 * @return returns the Address table connection of the User object
	 */
	public Address getAddress() {
		return address;
	}

	/**
	 * Setter method of the address parameter
	 * 
	 * @param address the Address table connection of the User
	 */
	public void setAddress(Address address) {
		this.address = address;
	}

}
