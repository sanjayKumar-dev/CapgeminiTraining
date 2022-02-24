import java.util.ArrayList;

class Swap<E>{
	 ArrayList<E> arr = new ArrayList<>();
	
	public void swap(E a, E b) {
		arr.add(b);
		arr.add(a);
	}
	
}

public class Question3 {
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(5);
		arr.add(6);
		
		
		Swap<Integer> s = new Swap<>();
		for(int i=1; i<arr.size(); i+=2)
		{
			s.swap(arr.get(i-1), arr.get(i));
		}
		
		for(Integer a : s.arr)
		{
			System.out.println(a);
		}
	}

}
