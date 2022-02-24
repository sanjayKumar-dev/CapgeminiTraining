package Question9;



public class beanLifeCycle {
	
	private String demo;

	public String getDemo() {
		return demo;
	}

	public void setDemo(String demo) {
		this.demo = demo;
	}
	
	public void initCustomer() {
		System.out.println("Initialize Bean");
	}
	

	public void destroyCustomer() {
		System.out.println("Destroy Bean");
	}

}
