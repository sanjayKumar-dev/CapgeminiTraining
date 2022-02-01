
abstract class AbstractCheck{
	int a = 1;
	public abstract int get();
}

class getCheck extends AbstractCheck{
	public int get()
	{
		return a;
	}
}

abstract class secCheck{
}
 
public class Assignment2Q4 {
	public static void main(String[] args) {
		getCheck obj = new getCheck();
		
		System.out.println(obj.get());
	}

}
