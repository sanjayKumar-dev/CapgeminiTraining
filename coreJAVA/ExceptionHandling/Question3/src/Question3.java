
public class Question3 {
	public static void main(String[] args) {
		bank b = new bank(1000);
		System.out.println(b.getBal());
		b.trans(500);
		//b.trans(0);
		b.trans(10000);
	}
}
