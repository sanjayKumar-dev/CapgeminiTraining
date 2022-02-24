package Question8;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Customer {
	
	private int customerId;
	private String customerName;
	
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public void displayData() {
		System.out.println("Id : "+ customerId);
		System.out.println("Name : "+ customerName);
	}
	
	@PostConstruct
	public void initCustomer() {
		System.out.println("Init Customer");
	}
	
	@PreDestroy
	public void destroyCustomer() {
		System.out.println("Destroy Customer");
	}

}
