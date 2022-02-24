package Question3;

import java.util.List;

public class BankAccountServiceImpl implements BankAccountService {
	
	private List<BankAccount> bankAccount;
	
	public List<BankAccount> getBankAccount() {
		return bankAccount;
	}

	public void setBankAccount(List<BankAccount> bankAccount) {
		this.bankAccount = bankAccount;
	}

	public double withdraw(long accountId, double balance) {
		
		double remainBal = 0;
		for(BankAccount bA : bankAccount) {
			if(bA.getAccountId() == accountId) {
				remainBal = bA.getAccountBalance() - balance;
				bA.setAccountBalance((long)remainBal);
			}
		}
		return remainBal;
	}

	public double deposit(long accountId, double balance) {
		double remainBal = 0;
		for(BankAccount bA : bankAccount) {
			if(bA.getAccountId() == accountId) {
				remainBal = bA.getAccountBalance() + balance;
				bA.setAccountBalance((long)remainBal);
			}
		}
		return remainBal;
	}

	public double getBalance(long accountId) {
		
		double Bal = 0;
		for(BankAccount bA : bankAccount) {
			if(bA.getAccountId() == accountId) {
				Bal = bA.getAccountBalance();
			}
		}
		return Bal;
	}

	public boolean fundTransfer(long fromAccount, long toAccount, double amont) {
		
		boolean status = false;
		for(BankAccount bA : bankAccount) {
			if(bA.getAccountId() == fromAccount) {
				for(BankAccount ba : bankAccount) {
					if(ba.getAccountId() == toAccount) {
						bA.setAccountBalance((long) (bA.getAccountBalance()-amont));
						ba.setAccountBalance((long) (ba.getAccountBalance()+amont)) ;
						status = true;
					}
				}
			}
		}
		return status;
	}

}
