import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Assignment4Q6 {
	
	static List<String> list = Arrays.asList("alpha", "bravo", "charlie", "delta", "echo", "foxtrot");

    public static List<String> convertToUpperCase(List<String> list, Consumer<List<String>> c) {
    	c.accept(list);
    	return list;
    }  
    
    
    public static void main(String[] args) {
    	
    	Consumer<List<String>> c= lis ->
	   	 {
		   	for(int i=0;i<lis.size();i++) {
		   		lis.set(i, list.get(i).toUpperCase());
		   	}
	   	 };
	   	 
	   	System.out.println(convertToUpperCase(list, c));
    	
    }
}