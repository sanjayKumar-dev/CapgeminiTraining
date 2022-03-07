package com.example.question3.addresscontroller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.question3.address.Address;
import com.example.question3.addressservice.AdressService;

@RestController
public class AddressController {
	

	private AdressService addressService = new AdressService();
	
	@RequestMapping("/address/{id}")
	public Address getTopic(@PathVariable String id) {
		return addressService.getTopic(id);
	}
	
}
