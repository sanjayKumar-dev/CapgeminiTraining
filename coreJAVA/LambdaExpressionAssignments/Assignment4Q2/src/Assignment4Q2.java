import java.util.ArrayList;
import java.util.function.Predicate;

public class Assignment4Q2 {

    private int totalPrice;
    private String status;

    public Assignment4Q2(int totalPrice, String status) {
		super();
		this.totalPrice = totalPrice;
		this.status = status;
	}


	public static ArrayList<Assignment4Q2> listOfOrders(ArrayList<Assignment4Q2> arr, Predicate<Assignment4Q2> pr) {
		
		ArrayList<Assignment4Q2> a = new ArrayList<>();
		for (Assignment4Q2 i : arr)
		{
			if( pr.test(i))
			{
				System.out.println("totalPrice : " + i.totalPrice + " Status : "+i.status);
			}
		}
		
		return a;
		
	}
    
    
    public static void main(String[] args) {
    	
    	ArrayList<Assignment4Q2> a = new ArrayList<>();
    	a.add(new Assignment4Q2(1000000, "completed"));
    	a.add(new Assignment4Q2(1000, "pending"));
    	a.add(new Assignment4Q2(10001, "accepted"));
    	a.add(new Assignment4Q2(125000, "completed"));
    	a.add(new Assignment4Q2(125, "completed"));
    	
    	Predicate<Assignment4Q2> pr=e->(e.totalPrice>10000 && (e.status.contentEquals("accepted") || e.status.contentEquals("completed")));
    	listOfOrders(a, pr);    	
    }
}

