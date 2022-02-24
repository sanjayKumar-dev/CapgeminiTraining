import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Assignment5Q2 {
    public static int maxComments(List<News> news) {
    	int id = 0;
    	int n1 = 0;
    	for(News n : news)
    	{
    		int x = n.getComment().length();
    		if(x>n1) {
    			id = n.getNewsId();
    			n1 = x;
    		}
    	}
    		//n1 = max(n.getComment().length(), n1);
    	return id;
    }

    public static long budgetCount (List < News > news) {
    	long c = 0;
    	c = news.stream()
    			.filter(n -> n.getComment().contains("budget"))
    			.count();
    	return c;
    }
    public static String maxCommentsByUser (List < News > news) {
    	
    	String str = "";
    	long c= 0;
    	for(News n : news)
    	{
    		long x = news.stream()
    		.filter(i -> i.getCommentByUser().contains(n.getCommentByUser()))
    		.count();
    		if(x>c)
    		{
    			c = x;
    			str = n.getCommentByUser();
    		}
    		
    	}
    	
    	return str;
    }

    public static Map<String, Integer> sortMaxCommentsByUser (List < News > news) {
    	
    	Map<String, Integer> m = new TreeMap<>();
    	
    	for(News n : news)
    	{
    		long x = news.stream()
    		.filter(i -> i.getCommentByUser().contains(n.getCommentByUser()))
    		.count();
    		m.put(n.getCommentByUser(), (int)x);
    	}
    	return m;
    	
    }

    public static void main(String[] args) {
    	
    	News n = new News(123, "abc", "xyz", "Yes its");
    	News n1 = new News(124, "bcd", "abc", "Yes 'budget its all");
    	News n2 = new News(125, "cde", "bcd", "Yes its max");
    	News n3 = new News(126, "def", "abc", "Yes its notMax");
    	News n4 = new News(127, "efg", "def", "Yes its well 'budget");
    	List<News> list = new ArrayList<>();
    	list.add(n);
    	list.add(n1);
    	list.add(n2);
    	list.add(n3);
    	list.add(n4);
    	System.out.println(maxComments(list));
    	System.out.println(budgetCount(list));
    	System.out.println(maxCommentsByUser(list));
    	Map<String, Integer> m;
    	m = sortMaxCommentsByUser(list);
    	for(Map.Entry<String, Integer> x : m.entrySet())
    	{
    		System.out.println(x.getKey()+" "+x.getValue());
    	}
    	
    }
}