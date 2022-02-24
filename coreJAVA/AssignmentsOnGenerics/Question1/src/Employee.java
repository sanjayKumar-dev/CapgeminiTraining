
public class Employee {
	
	private int id; 
	private String name; 
	private int salary ;
	private String department ;
	
	
	
	public Employee(int id, String name, int salary, String department) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.department = department;
	}



	public void displayDetails() {
		System.out.println(
				"Id : "+id +"\n"+
				"Name : "+name+"\n"+
				"Salary : "+salary+"\n"+
				"Department : "+department
				);
	}

}
