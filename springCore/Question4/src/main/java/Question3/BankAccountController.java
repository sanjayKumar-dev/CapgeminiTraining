package Question3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;

@Controller
public class BankAccountController {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		BankAccountServiceImpl bA = (BankAccountServiceImpl) context.getBean("bankAccountService");
		System.out.println(bA.withdraw(123, 5));
		System.out.println(bA.deposit(124, 10));
		System.out.println(bA.fundTransfer(123, 125, 10));
		System.out.println(bA.getBalance(123));
	}

}
/* <property name="bankAccount">
	<list>
	<ref bean="bankAccount1" />
	<ref bean="bankAccount2" />
	<ref bean="bankAccount3" />
</list>
</property> */