import java.util.HashMap;

public class Question2 {
	
	public static void main(String[] args) {
		HashMap<Integer,Double> hm = new HashMap<>();
		hm.put(123, 1.23);
		hm.put(456, 4.56);
		hm.put(678, 6.78);
		hm.put(890, 8.9);
		hm.put(234, 2.34);
		hm.put(567, 5.67);
		hm.put(891, 8.91);
		hm.put(12, 1.2);
		hm.put(1, 1.0);
		hm.put(3, 1.3);
		hm.put(13, 1.232);
		
		hm.forEach((K, V) -> System.out.println(K + " "+V));
	}

}
