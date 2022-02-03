import java.util.Scanner;
public class Question2 {
	 static public void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = 0;
		sc.close();
		try {
			c = a/b;
		} catch (ArithmeticException ex) { 
		      System.out.println("Division by zero.");
		      throw new UnsupportedOperationException();
		}
		
		System.out.println(c);
		
		
	}
}