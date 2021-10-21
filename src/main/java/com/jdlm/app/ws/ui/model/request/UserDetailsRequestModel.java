package com.jdlm.app.ws.ui.model.request;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class UserDetailsRequestModel {

	@NotNull(message = "First name cannot be null")
	@Size(min = 2, message = "First name must not be less than 2 characters")
	private String firstName;

	@NotNull(message = "Last name cannot be null")
	@Size(min = 2, message = "Last name must not be less than 2 characters")
	private String lastName;

	@NotNull(message = "Email cannot be null")
	@Email(message = "Email format is wrong.")
	private String email;

	@NotNull(message = "Password name cannot be null")
	@Size(min = 8, max = 16, message = "Password must be equal or grater then 8 characters and less than 16 characters")
	private String password;

	private String userId;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	
	


}