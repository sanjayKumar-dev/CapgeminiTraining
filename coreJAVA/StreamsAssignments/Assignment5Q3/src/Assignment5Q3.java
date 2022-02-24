import java.util.ArrayList;
import java.util.List;

class Trader {
    private String name;
    private String city;
	public Trader(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}
	
	public String getName() {
		return name;
	}
	public String getCity() {
		return city;
	}

}

public class Assignment5Q3 {
	
	
    public static List<String> printUniqueCities (List <Trader> traders) { 
    	
    	List<String> list = new ArrayList<>();
    	
    	traders.stream()
    	.distinct()
    	.forEach(n -> list.add(n.getName()));;
    	
    	return list;
    	
    	
    	
    	
    }
    public static List<String> tradersFromPuneSortByName(List<Trader> traders) {
    	
    	List<String> list = new ArrayList<>();
    	traders.stream()
    	.filter(n -> n.getCity().equals("Pune"))
    	.forEach(p -> list.add(p.getName()));
    	
    	list.sort(null);
    	
    	return list;
    	
    }
    public static String allTrader3Names(List<Trader> traders) {
    	
    	List<String> list=new ArrayList<>();
		traders.stream().forEach(n -> list.add(n.getName()));
    	list.sort(null);
    	String str = "";
    	for(int i=0; i<list.size(); i++)
    	{
    		str += list.get(i);
    	}
    	
    	return str;
    	
    	
    }
    public static ArrayList<Trader> areAnyTradersFromIndore(List<Trader> arr2) {
    	
    	ArrayList<Trader> arr = new ArrayList<>();
    	arr2.stream()
    	.filter(n -> n.getCity().equals("Indore"))
    	.forEach(x -> arr.add(x));
    	
    	return arr;
    }
    
    
    public static void main(String[] args) {
    	Trader t1  = new Trader("abc", "Mumbai");
    	Trader t2  = new Trader("bcd", "Delhi");
    	Trader t3  = new Trader("dde", "Pune");
    	Trader t4  = new Trader("cef", "Lucknow");
    	Trader t5  = new Trader("feg", "Varansi");
    	Trader t6  = new Trader("efg", "Varansi");
    	Trader t7  = new Trader("ade", "Pune");
    	Trader t8  = new Trader("xyz", "Indore");
    	List<Trader> arr = new ArrayList<>();
    	arr.add(t1);
    	arr.add(t2);
    	arr.add(t3);
    	arr.add(t4);
    	arr.add(t5);
    	arr.add(t6);
    	arr.add(t7);
    	arr.add(t8);
    	List<String> l = printUniqueCities(arr);
    	l.forEach(System.out::println);
    	
    	System.out.println();
    	
    	List<String> l1 = tradersFromPuneSortByName(arr);
    	l1.forEach(System.out::println);

    	System.out.println();
    	
    	System.out.println(allTrader3Names(arr));
    	
    	System.out.println();
    	ArrayList<Trader> a1 = areAnyTradersFromIndore(arr);
    	a1.forEach(x -> System.out.println(x.getName()));
    }
}