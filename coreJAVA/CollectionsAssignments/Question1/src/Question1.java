import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;


public class Question1 {
	public static void main(String[] args) {
		
		Contact c1 = new Contact(1234567890, "abc", "abc@gmail.com", Contact.gender.Female);
		Contact c2 = new Contact(1234567891, "bcd", "bcd@gmail.com", Contact.gender.Male);
		Contact c3 = new Contact(1234567892, "cde", "cde@gmail.com", Contact.gender.Female);
		
		
		Map<Long,Contact> c = new TreeMap<>(Collections.reverseOrder());
		c.put(c1.getPhNumber(), c1);
		c.put(c2.getPhNumber(), c2);
		c.put(c3.getPhNumber(), c3);
		
		for(long l: c.keySet())
			System.out.println(l);
		System.out.println("-----------------------------------------------------------------");
		for(Contact l: c.values()) {
			System.out.println(l.getName());
			System.out.println(l.getEmail());
			System.out.println(l.getG());
			System.out.println("-----------------------");
		}
		System.out.println("-----------------------------------------------------------------");
		System.out.println(c);
		System.out.println("-----------------------------------------------------------------");
		for(Map.Entry<Long, Contact> entry : c.entrySet())
		{
			System.out.println("Key : "+entry.getKey());
			System.out.println("Name : "+entry.getValue().getName());
			System.out.println("Email : "+entry.getValue().getEmail());
			System.out.println("Gender : "+entry.getValue().getG());
			System.out.println();
		}
		
			
	}

}
