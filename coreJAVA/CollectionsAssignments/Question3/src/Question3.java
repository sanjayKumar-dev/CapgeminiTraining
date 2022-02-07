import java.util.Comparator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;


class idComparator implements Comparator<Employee>
{
   
    public int compare(Employee e1, Employee e2)
    {
        return e1.getId()-e2.getId();
    }
}
 
class nameComparator implements Comparator<Employee>
{
   
    public int compare(Employee e1, Employee e2)
    {
    	
    	return e1.getName().compareTo(e2.getName());
    }
}

class depComparator implements Comparator<Employee>
{
   
    public int compare(Employee e1, Employee e2)
    {
    	
    	return e1.getDepartment().compareTo(e2.getDepartment());
    }
}

class salComparator implements Comparator<Employee>
{
   
    public int compare(Employee e1, Employee e2)
    {
    	return e1.getSalary()-e2.getSalary();
    }
}

public class Question3 {
	public static void main(String[] args) {
		Employee e1 = new Employee(1, "a", "IT", 5000);
		Employee e2 = new Employee(12, "b", "MT", 5400);
		Employee e3 = new Employee(13, "c", "IT", 5000);
		Employee e4 = new Employee(14, "d", "IT", 50000);
		Employee e5 = new Employee(15, "e", "KT", 5800);
		Employee e6 = new Employee(16, "f", "IT", 5056);
		Employee e7 = new Employee(17, "g", "ST", 5090);
		Employee e8 = new Employee(18, "h", "IT", 5700);
		Employee e9 = new Employee(19, "i", "IT", 5001);
		Employee e10 = new Employee(10, "j", "IT", 5030);
		
		
		Set<Employee> ts1 ;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1. Id, 2. Name, 3. Department, 4. Salary ");
		int n = sc.nextInt();
		sc.close();
		
		if(n == 1)
		{
			ts1 = new TreeSet<>(new idComparator());
		}
		else if(n==2)
		{
			ts1 = new TreeSet<>(new nameComparator());
		}
		else if(n==3)
		{
			ts1 = new TreeSet<>(new depComparator());
		}
		else
		{
			ts1 = new TreeSet<>(new salComparator());
		}
		
		ts1.add(e1);
		ts1.add(e2);
		ts1.add(e3);
		ts1.add(e4);
		ts1.add(e5);
		ts1.add(e6);
		ts1.add(e7);
		ts1.add(e8);
		ts1.add(e9);
		ts1.add(e10);
		
		
		
		for(Employee e : ts1)
		{
			System.out.println(e.getId() + " "+ e.getName()+ " "+ e.getDepartment()+ " "+ e.getSalary());
		}
		
	}

}
