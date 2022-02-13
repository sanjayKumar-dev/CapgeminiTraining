
public class BankAccount {
	private int amount = 10000;
	public boolean withdraw(int amoutToWithdraw) throws InsufficientFundsExpcetion {
			
		if(amoutToWithdraw > amount) {
			 throw new InsufficientFundsExpcetion();
		}
		amount -= amoutToWithdraw;
		return true;
	}
	

}


