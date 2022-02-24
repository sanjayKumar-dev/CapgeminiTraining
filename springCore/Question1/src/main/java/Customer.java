
public class Customer {
	private int customerId;
	private String customerName;
	private String customerContact;
	private Address customerAddress;
	
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
	public String getCustomerContact() {
		return customerContact;
	}
	public void setCustomerContact(String customerContact) {
		this.customerContact = customerContact;
	}
	public Address getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(Address customerAddress) {
		this.customerAddress = customerAddress;
	}
	
	public void printAll() {
		System.out.println("Customer Id : " + customerId);
		System.out.println("Customer Name : " + customerName);
		System.out.println("Customer Contact: " + customerContact);
		System.out.println("Customer Address : " + customerAddress.getStreet()+ ", "+ customerAddress.getCity()+ ", "+ customerAddress.getState()+", "+ customerAddress.getCountry()+", "+customerAddress.getZip() );
	}

}
