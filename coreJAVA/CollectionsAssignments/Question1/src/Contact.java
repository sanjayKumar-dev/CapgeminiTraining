
public class Contact {
	
	private long phNumber;
	private String name;
	private String email;
	private gender g;
	//enum gend;
	
	enum gender{
		Male,
		Female
	}
	
	public Contact(long phNumber, String name, String email, Contact.gender g) {
		super();
		this.phNumber = phNumber;
		this.name = name;
		this.email = email;
		this.g = g;
	}

	public long getPhNumber() {
		return phNumber;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public gender getG() {
		return g;
	}
	
	
	

}
