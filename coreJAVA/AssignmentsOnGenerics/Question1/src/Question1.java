import java.util.HashSet;

public class Question1 {
	public static void main(String[] args) {
		Employee employee1 = new Employee(123, "abc", 50000, "IT");
		Employee employee2 = new Employee(123, "bcd", 5000, "Marketing");
		Employee employee3 = new Employee(123, "cde", 30000, "Management");
		
		HashSet<Employee> hashSet = new HashSet<>();
		hashSet.add(employee1);
		hashSet.add(employee2);
		hashSet.add(employee3);
		
		hashSet.forEach( n -> n.displayDetails());
	}

}
