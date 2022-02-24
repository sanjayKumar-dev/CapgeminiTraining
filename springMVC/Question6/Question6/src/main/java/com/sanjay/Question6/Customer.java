package com.sanjay.Question6;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Customer 
{
@NotBlank(message="Username can't be empty")
@Size(min=8,max=20,message="should be between 2 and 20")
@Pattern(regexp="^[a-zA-z0-9]+$")
private String username;

@NotBlank(message="password can't be empty")
@Size(min=8,max=20,message="should be between 2 and 20")
@Pattern(regexp="/^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[#$@!%&*?])[A-Za-z\\d#$@!%&*?]{8,20}$/")
private String password;

@NotBlank(message="Email can't be empty")
@Pattern(regexp="\"^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$\"")
private String email;

@NotBlank(message="City must be selected")
private String city;

private long contact;

@NotBlank(message="Zipcode can't be empty")
@Pattern(regexp="\"^[0-9]{6}\"")
private long zipcode;

public  Customer()
{
	
}

public String getUsername() {
	return username;
}

public void setUsername(String username) {
	this.username = username;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public long getContact() {
	return contact;
}

public void setContact(long contact) {
	this.contact = contact;
}

public long getZipcode() {
	return zipcode;
}

public void setZipcode(long zipcode) {
	this.zipcode = zipcode;
}
public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}




}
