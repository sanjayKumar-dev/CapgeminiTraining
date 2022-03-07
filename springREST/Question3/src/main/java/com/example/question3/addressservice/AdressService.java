package com.example.question3.addressservice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.example.question3.address.Address;

public class AdressService {
	
	private List<Address> address = new ArrayList<>(Arrays.asList(
			new Address("1234", "mau", "UP", "India"),
			new Address("1255", "patna", "Bihar", "India"),
			new Address("1534", "jalndhar", "Punjab", "India")
			));
	
	public Address getTopic(String id) {
		return address.stream().filter(t -> t.getZipCode().equals(id)).findFirst().get();
	}

}
