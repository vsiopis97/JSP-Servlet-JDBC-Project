package bsiopis.webapp.controller;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * 
 * User Input Class. The UserInput class works as a Data Transfer Object (DTO)
 * in order to effectively pass values inside the address fields of the User
 * class
 * 
 * @author Bill Siopis
 * @version 1.0
 * @since 2022-12-15
 *
 */
public class UserInput {

	/**
	 * Represents the firstName column of the Database Table "Users"
	 */
	@NotNull(message = "is required!")
	@Size(min = 1, max = 30, message = "required, 1-30 characters!")
	private String firstName;
	/**
	 * Represents the surname column of the Database Table "Users"
	 */
	@NotNull(message = "is required!")
	@Size(min = 1, max = 30, message = "required, 1-30 characters!")
	private String surname;
	/**
	 * Represents the gender column of the Database Table "Users"
	 */
	@NotNull(message = "is required!")
	@Size(min = 1, message = "is required!")
	private String gender;
	/**
	 * Represents the birthdate column of the Database Table "Users"
	 */
	@NotNull(message = "is required!")
	@Size(min = 1, message = "is required!")
	private String birthdate;
	/**
	 * Represents the work_address column of the Database Table "Address"
	 */
	private String workAddress;
	/**
	 * Represents the home_address column of the Database Table "Address"
	 */
	private String homeAddress;

	/**
	 * No arg constructor
	 */
	public UserInput() {
		super();
	}

	/**
	 * Getter method of the firstName parameter
	 * 
	 * @return returns the First Name of the UserInput object
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Setter method of the firstName parameter
	 * 
	 * @param firstName the First Name of the UserInput Object
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * Getter method of the surname parameter
	 * 
	 * @return returns the surname of the UserInput object
	 */
	public String getSurname() {
		return surname;
	}

	/**
	 * Setter method of the surname parameter
	 * 
	 * @param surname the surname of the UserInput Object
	 */
	public void setSurname(String surname) {
		this.surname = surname;
	}

	/**
	 * Getter method of the gender parameter
	 * 
	 * @return returns the Gender of the UserInput object
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * Setter method of the gender parameter
	 * 
	 * @param gender the Gender of the UserInput Object
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * Getter method of the birthdate parameter
	 * 
	 * @return returns the Date of Birth of the UserInput object
	 */
	public String getBirthdate() {
		return birthdate;
	}

	/**
	 * Setter method of the birthdate parameter
	 * 
	 * @param birthdate the Date of Birth of the UserInput Object
	 */
	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}

	/**
	 * Getter method of the workAddress parameter
	 * 
	 * @return returns the Work Address of the UserInput object
	 */
	public String getWorkAddress() {
		return workAddress;
	}

	/**
	 * Setter method of the workAddress parameter
	 * 
	 * @param workAddress the Work Address of the UserInput Object
	 */
	public void setWorkAddress(String workAddress) {
		this.workAddress = workAddress;
	}

	/**
	 * Getter method of the homeAddress parameter
	 * 
	 * @return returns the Home Address of the UserInput object
	 */
	public String getHomeAddress() {
		return homeAddress;
	}

	/**
	 * Setter method of the homeAddress parameter
	 * 
	 * @param homeAddress the Home Address of the UserInput Object
	 */
	public void setHomeAddress(String homeAddress) {
		this.homeAddress = homeAddress;
	}

}
