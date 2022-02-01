import java.util.*;
public class Assignment2Q7 {
	Scanner sc = new Scanner(System.in);
    private void selectRoles(){
    	System.out.println("Enter the role 1 for Owner and 2 for Customer");
    	
    	int x = sc.nextInt();
    	if(x == 1)
    		roles("Owner");
    	else if(x == 2)
    		roles("Customer");
    	else
    		System.out.println("Undefined");
    }
    private void roles(String role){
    	if(role == "Owner")
    	{
    		addItems();
    	}
    	else
    	{
    		placeOrder();
    	}
    }
    private void addItems() {
    	System.out.println("Enter the choice to add "+'\n'+"1. Candy" + '\n' + "2. Cookie" + '\n' + "3. Ice Cream");
    	addItemsOperation(sc.nextInt());
    }
    private void addItemsOperation(int choice) {
    	System.out.println("Enter the number of item to be added");
    	int n = sc.nextInt();
    	
    	if(choice == 1)
    	{
    		Candy obj = new Candy();
    		obj.addCandies(n);
    	}
    	else if(choice == 2)
    	{
    		Cookie obj = new Cookie();
    		obj.addCookies(n);
    	}
    	else if(choice == 3)
    	{
    		IceCream obj = new IceCream();
    		obj.addIceCreams(n);
    	}
    	else
    		System.out.println("Wrong input");
    	selectRoles();
    }
    private void placeOrder() {
    	System.out.println("Enter the choice to buy "+'\n'+"1. Candy" + '\n' + "2. Cookie" + '\n' + "3. Ice Cream");
    	placeOrderOperation(sc.nextInt());
    	
    }
    private void placeOrderOperation(int choice) {
    	System.out.println("Enter the number of item to buy");
    	int n = sc.nextInt();
    	if(choice == 1)
    	{
    		Candy obj = new Candy();
    		System.out.println("Total pice is : "+ (n*obj.getCost()));
    	}
    	else if(choice == 2)
    	{
    		Cookie obj = new Cookie();
    		System.out.println("Total pice is : "+ (n*obj.getCost()));
    	}
    	else if(choice == 3)
    	{
    		IceCream obj = new IceCream();
    		System.out.println("Total pice is : "+ (n*obj.getCost()));
    	}
    	else
    		System.out.println("Wrong input");
    	selectRoles();
    }
    
    public static void main(String[] args) {
    	
    	Assignment2Q7 obj=new  Assignment2Q7();
		obj.selectRoles();    	
    }
}