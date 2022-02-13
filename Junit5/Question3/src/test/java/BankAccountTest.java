import static org.junit.Assert.*;

import org.junit.Test;

public class BankAccountTest {
	BankAccount ba = new BankAccount();

	@Test
	public void test() throws InsufficientFundsExpcetion {
		assertEquals(true, ba.withdraw(9000));
		assertEquals(true, ba.withdraw(100));
		assertEquals(true, ba.withdraw(100000));
		assertEquals(true, ba.withdraw(0));
		
	}

}
