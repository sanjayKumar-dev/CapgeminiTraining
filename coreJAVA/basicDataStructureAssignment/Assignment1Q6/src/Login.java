import java.util.Scanner;
class Login{
    String userId = "Ajay",password = "password";
    
    public String loginUser(String user, String pass) {
    	Scanner sc = new Scanner(System.in);
    	String str = "Welcome " + userId;
    	if(user == userId && pass == password)
    	{
    		return str;
    	}
    	if(user != userId || pass != password)
    	{
//    		System.out.println("You have entered wrong credentials ,please enter the right credentials.");
//    		String tempU = sc.nextLine();
//    		String tempP = sc.nextLine();
    		for(int i=1; i<3; i++)
    		{
    			System.out.println("You have entered wrong credentials ,please enter the right credentials.");
    			String tempU = sc.nextLine();
        		String tempP = sc.nextLine();
        		if(userId == tempU && password == tempP)
        			return str;
    		}
    		
    		return "Contact Admin";
    	}
    	return str;
    }

}