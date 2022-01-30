import java.util.Scanner;
public class Assignment1Q4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double s1 = sc.nextDouble();
		double s2 = sc.nextDouble();
		double s3 = sc.nextDouble();
		ResultDeclaration obj = new ResultDeclaration();
		
		System.out.println(obj.declareResults(s1, s2, s3));
	}
}
