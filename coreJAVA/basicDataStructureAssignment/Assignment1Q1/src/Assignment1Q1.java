import java.util.Scanner;

public class Assignment1Q1 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		ArmstrrongOrNot obj = new ArmstrrongOrNot();		
		System.out.println( obj.armstrongCheck(a));		
	}

}
