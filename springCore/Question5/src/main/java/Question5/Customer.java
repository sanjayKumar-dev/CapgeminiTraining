package Question5;

import org.springframework.beans.factory.annotation.Required;

public class Customer {
	
	private int customerId;
	private String customerName;
	public int getCustomerId() {
		return customerId;
	}
	@Required
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	

}
