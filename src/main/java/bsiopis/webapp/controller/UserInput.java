package bsiopis.webapp.controller;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class UserInput {

	@NotNull(message="is required!")
	@Size(min=1, max=30, message="required, 1-30 characters!")
	private String firstName;
	@NotNull(message="is required!")
	@Size(min=1, max=30, message="required, 1-30 characters!")
	private String surname;
	@NotNull(message="is required!")
	@Size(min=1, message="is required!")
	private String gender;
	@NotNull(message="is required!")
	@Size(min=1, message="is required!")
	private String birthdate;
	private String workAddress;
	private String homeAddress;
	
	public UserInput() {
		super();
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
	
}
