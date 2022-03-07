package com.example.question3.address;

public class Address {
	
	private String zipCode;
	private String city;
	private String state;
	private String country;
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Address(String zipCode, String city, String state, String country) {
		super();
		this.zipCode = zipCode;
		this.city = city;
		this.state = state;
		this.country = country;
	}
	public Address() {
		super();
	}
	
	
	

}
