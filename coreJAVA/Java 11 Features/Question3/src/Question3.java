import java.util.ArrayList;

public class Question3 {
	public static void main(String[] args) {
		
		ArrayList<String> arr = new ArrayList<>();
		arr.add("A");
		arr.add("quick");
		arr.add("brown");
		arr.add("fox");
		arr.add("jumps");
		arr.add("over");
		arr.add("the");
		arr.add("lazy");
		arr.add("dog");
		
		String [] str = new String[arr.size()];
		str = arr.toArray(str);
		
		for(int i=0; i<str.length; i++)
		{
			System.out.println(str[i]);
		}
		
		
	}

}
