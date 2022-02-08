import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Assignment4Q5 {
    static List<String> list = Arrays.asList("alpha", "bravo", "charlie", "delta", "echo", "foxtrot");
        
    public static String processWords(List<String> list, Consumer<List<String>> c)
    {
    	c.accept(list);
    	return list.toString();
    }

    public static void main(String[] args) {
    	Consumer<List<String>> c= lis ->
	   	 {
		   	for(int i=0;i<lis.size();i++)
		   	{
		   		String word=list.get(i);
		   		lis.set(i, ""+word.charAt(0));
		   	}
	   	 };
	   	System.out.println(processWords(list, c));
	   	 
    	
    }

    
}