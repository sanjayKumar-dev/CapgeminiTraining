import java.util.Scanner;
public class Assignment1Q3 {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		double p = sc.nextDouble();
		double r = sc.nextDouble();
		//int n = sc.nextInt();
		int t = sc.nextInt();
		SiCi obj = new SiCi();
		System.out.println(obj.simpleInterest(p, t, r));
		System.out.println(obj.compoundInterest(p, t, r));
	}

}
