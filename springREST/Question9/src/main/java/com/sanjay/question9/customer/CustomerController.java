package com.sanjay.question9.customer;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;

	@RequestMapping("/customer")
	public List<Customer> getAllCustomer(){
		return customerService.getAllCustomer();
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/customer")
	public void addTopic(@RequestBody Customer customer) {
		customerService.addCustomer(customer);
	}
	
	@RequestMapping("/customer/{id}")
	public Optional<Customer> getCustomer(@PathVariable int id){
		return customerService.getCustomer(id);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/customer/{id}")
	public void updateCustomer(@RequestBody Customer customer, @PathVariable int id) {
		customerService.updateCustomer(customer);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/customer/{id}")
	public void deleteCustomer(@PathVariable int id) {
		customerService.deleteCustomer(id);
	}

}
