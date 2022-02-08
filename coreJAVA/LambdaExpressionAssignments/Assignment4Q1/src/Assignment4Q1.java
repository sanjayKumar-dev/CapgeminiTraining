public class Assignment4Q1 {
    public static double addition(int num1,int num2){
    	lamda get = (x, y) -> (x+y);    	
    	return (double)(get .operation(num1, num2));
    }
 
    public static double subtraction(int num1,int num2){
    	lamda get = (x, y) -> (x-y);    	
    	return (double)(get.operation(num1, num2));
    }
    
    public static double multiplication(int num1,int num2){
    	lamda get = (x, y) -> (x*y);    	
    	return (double)(get.operation(num1, num2));
    }
    
    public static double division(int num1,int num2){
    	lamda get = (x, y) -> (x/y);    	
    	return (double)(get.operation(num1, num2));
    }    
    
    public static void main(String[] args) {
    	
    	int a = 10, b = 5;
    	System.out.println(addition(a, b));
    	System.out.println(subtraction(a,b));
    	System.out.println(multiplication(a,b));
    	System.out.println(division(a,b));
    }
    
    interface lamda
    {
    	int operation(int a, int b);
    }
}