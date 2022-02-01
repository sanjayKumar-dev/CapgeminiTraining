public class Assignment2Q3 {
    public static void main(String[] args) {
    	CurrentAccount ca = new CurrentAccount();
    	SavingsAccount sa = new SavingsAccount();
    	System.out.println(ca.getCash());
    	System.out.println(sa.getCash());
    	System.out.println(ca.getCash() + sa.getCash());
    }
}

