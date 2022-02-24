//Java 11 supports var keyword for variable declarations. List the scenarios where var
//keyword cannot be used for such variable declarations. Give reason in support of 
//your answer for each scenario. 



import java.util.ArrayList;

public class Question2 {
	static var x = 50;
	public static void main(String[] args) {
		
		//var cannot be used in an instance and global variable declaration
		System.out.println(x);
		
		
		//var cannot be used as a Generic type
		ArrayList<var> arr = new ArrayList<>();
		
		
		//var cannot be used without initialization
		var t;
		
		//var cannot be used with Lambda Expression
		abc x = (a, b) -> a+b;
		
	}
	
	//var cannot be used for method return type
	static var method1 ()
	{
		
	}
	//var cannot be used for method parameter
	static void method2(var i, var j)
	{
		
	}
	
	interface abc{
		//var cannot be used with Lambda Expression
		var add(int a, int b);
	}

}
