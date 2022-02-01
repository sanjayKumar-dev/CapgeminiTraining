class SingletonInheritanceCheck{
	private static Singleton single_instance = null;
	public String check;
  SingletonInheritanceCheck()
	{
		check="my singleton";
		
	}
	
	public void getInstance()
	{
		System.out.println(check);
	}
}
public class Assignment2Q1 {
	public static void main(String[] args) {
		SingletonInheritanceCheck s = new SingletonInheritanceCheck();
		
	}	
}
