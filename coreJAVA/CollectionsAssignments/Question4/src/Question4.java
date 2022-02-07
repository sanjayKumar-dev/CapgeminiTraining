import java.util.GregorianCalendar;
import java.util.LinkedList;

public class Question4 {
	public static void main(String[] args) {
		cal c = new cal(new GregorianCalendar(2021, 07, 18));
		cal c1 = new cal(new GregorianCalendar(1999, 07, 18));
		cal c2 = new cal(new GregorianCalendar(1998, 07, 18));
		cal c3 = new cal(new GregorianCalendar(1997, 07, 18));
		cal c4 = new cal(new GregorianCalendar(1996, 07, 18));
		
		
		LinkedList<cal> ll = new LinkedList<>();
		ll.add(c);
		ll.add(c1);
		ll.add(c2);
		ll.add(c3);
		ll.add(c4);
		//System.out.println(c.getYear());
		
		
		for (cal dob : ll) {
            int year = dob.getYear();
            if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
	            System.out.println("Your date of birth is "+dob.getCal()+" and it was a leap year");
		} else {
        	System.out.println("Your date of birth is "+ dob.getCal()+" and it was not a leap year");
        }
		
		}
		
		
//		System.out.println(c.getCal());
	}

}
