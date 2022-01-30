import java.util.Scanner;
public class Assignment1Q5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ctc = sc.nextInt();
		TaxAmount obj = new TaxAmount();
		System.out.println(obj.calculateTaxAmount(ctc));
	}
}

