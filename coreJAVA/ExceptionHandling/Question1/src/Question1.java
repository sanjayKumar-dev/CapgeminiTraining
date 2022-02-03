import java.util.*;
public class Question1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = 0;
		try {
			c = a/b;
		} catch (ArithmeticException ex) { 
		      System.out.println("Division by zero.");
		}
		
		System.out.println(c);
	}
}
