
public class bank {
	int bal = 0;
	
	public bank(int bal) {
		this.bal = bal;
	}
	
	public void setBal(int bal){
		this.bal = bal;
	}
	
	public int getBal() {
		return bal;
	}
	
	public void trans(int n) {
		if(n>bal) {
			throw new InsufficientBalanceException(n);			
		}
		else if(n<=0) {
			throw new IllegalBankTransactionException();
		}
		else {
			bal -= n;
			System.out.println("Remaining bal is : "+ bal);
		}
	}

}
