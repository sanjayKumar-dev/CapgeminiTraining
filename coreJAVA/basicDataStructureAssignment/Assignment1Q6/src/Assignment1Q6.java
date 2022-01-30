import java.util.Scanner;
public class Assignment1Q6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String user = sc.nextLine();
		String pass = sc.nextLine();
		Login obj = new Login();
		System.out.println(obj.loginUser(user, pass));		
	}
}
