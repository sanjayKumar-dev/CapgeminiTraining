import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;



@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface Test
{
	int version() default 1; 
}

class xyz
{
	int x;
	
	public xyz(int x)
	{
		this.x = x;
	}
	
	@Test(version = 2)
	public void tes2()
	{
		if(x%2 == 0)
			System.out.println("Div by 2");
	}
	
	@Test(version = 3)
	public void tes3()
	{
		if(x%3 == 0)
			System.out.println("Div by 3");
	}
}
public class Question1 {
	
	@Test(version = 8)
	public static void justPrint()
	{
		System.out.println("Just Print");
	}
	
	public static void main(String[] args) {
		
		xyz obj = new xyz(12);
		obj.tes2();
		obj.tes3();
		justPrint();
		
	}

}
