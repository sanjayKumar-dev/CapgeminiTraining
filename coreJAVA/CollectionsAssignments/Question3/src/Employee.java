
public class Employee {
	
	private int id;
	private String name;
	private String Department;
	private int Salary;
	
	public Employee(int id, String name, String department, int salary) {
		super();
		this.id = id;
		this.name = name;
		Department = department;
		Salary = salary;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getDepartment() {
		return Department;
	}

	public int getSalary() {
		return Salary;
	}
	
	
	

}
