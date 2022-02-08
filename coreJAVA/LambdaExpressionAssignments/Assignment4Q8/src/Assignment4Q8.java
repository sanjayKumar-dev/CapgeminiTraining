import java.util.ArrayList;

public class Assignment4Q8 {
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(5);
		
		Thread myThread = new Thread( () -> arr.forEach(n -> System.out.println(n)));
		myThread.start();
	}

}
