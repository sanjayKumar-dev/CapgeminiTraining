package Question5;

import javax.annotation.Resource;
import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Required;

public class customerData {
	@Inject
	private Customer customer;

	public Customer getCustomer() {
		return customer;
	}
	
	@Required
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	public void displayData() {
		System.out.println("Id : "+customer.getCustomerId());
		System.out.println("Name : "+customer.getCustomerName());
	}

}
