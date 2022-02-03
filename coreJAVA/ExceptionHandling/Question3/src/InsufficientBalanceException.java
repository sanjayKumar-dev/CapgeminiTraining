
public class InsufficientBalanceException extends RuntimeException {

	
	public InsufficientBalanceException() {
		super();
	}
	
	public InsufficientBalanceException(int n) {
		System.out.println("Insufficient Balance : "+n);
	}

}
