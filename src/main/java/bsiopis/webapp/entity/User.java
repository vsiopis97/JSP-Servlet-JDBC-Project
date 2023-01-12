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
 * <h1>User Entity Class</h1> 
 * The base Entity class of the application, it
 * consists of all the fields that store the data of the user. Connects with the
 * database columns via Hibernate annotations.
 * Also includes One-to-One mapping with the Address Entity.
 * 
 * @author Bill Siopis
 * @version 1.0
 * @since 2022-12-15
 * 
 */
@Entity
@Table(name = "users")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "firstName")
	@NotNull(message = "is required!")
	@Size(min = 1, max = 30, message = "required, 1-30 characters!")
	private String firstName;

	@Column(name = "surname")
	@NotNull(message = "is required!")
	@Size(min = 1, max = 30, message = "required, 1-30 characters!")
	private String surname;

	@Column(name = "gender")
	@NotNull(message = "is required!")
	@Size(min = 1, message = "is required!")
	private String gender;

	@Column(name = "birthdate")
	@NotNull(message = "is required!")
	@Size(min = 1, message = "is required!")
	private String birthdate;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "address_id")
	private Address address;

	public User() {

	}

	public User(String firstName, String surname, String gender, String birthdate) {

		this.firstName = firstName;
		this.surname = surname;
		this.gender = gender;
		this.birthdate = birthdate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", firstName=" + firstName + ", surname=" + surname + ", gender=" + gender
				+ ", birthdate=" + birthdate + ", address=" + address + "]";
	}

}
