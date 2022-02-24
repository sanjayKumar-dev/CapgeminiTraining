package com.sanjay.Question4;

import java.io.Serializable;

public class User implements Serializable {

	private static final long serialVersionUID = 1L;

	private String id;
	private String userName;
	private String userEmail;
	private String userPassword;
	
	public User(String id, String userName, String userEmail, String userPassword) {
		super();
		this.id = id;
		this.userName = userName;
		this.userEmail = userEmail;
		this.userPassword = userPassword;
	}


	public User() {
		super();
	}


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	

	
}