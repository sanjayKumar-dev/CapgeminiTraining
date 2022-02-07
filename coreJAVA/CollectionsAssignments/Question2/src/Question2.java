import java.util.HashSet;
import java.util.*;

public class Question2 {
	public static void main(String[] args) {
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("a");
		hs.add("b");
		hs.add("c");
		hs.add("d");
		hs.add("e");
		hs.add("f");
		hs.add("g");
		hs.add("h");
		hs.add("i");
		hs.add("j");
		hs.add("b");
		hs.add("j");
		hs.add("a");
		
		Iterator<String> itr = hs.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		HashSet<String> hs1 = new HashSet<>();
		while(itr.hasNext())
		{
			String str = itr.next();
			if(hs.contains(str))
			{
				hs1.add(str);
			}
		}
		System.out.println();
		
		Iterator<String> itr1 = hs1.iterator();
		while(itr1.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
