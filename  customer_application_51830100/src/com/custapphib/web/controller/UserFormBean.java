package com.custapphib.web.controller;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

public class UserFormBean {
	@NotEmpty(message = "email shldn't be blank")
	@Email(message = "please enter valid email")
	private String email;
	@NotEmpty(message = "password shldn't be blank")
	private String password;

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

}
