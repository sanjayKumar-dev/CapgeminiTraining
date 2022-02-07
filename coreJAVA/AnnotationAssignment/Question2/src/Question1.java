import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
//@Repeatable(Target.class)
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.LOCAL_VARIABLE})
@Retention(RetentionPolicy.RUNTIME)
@interface Info
{
	int AuthorID();
	String Author() default "Default";
	String Supervisor() default "Default";
	String Date();
	String Time();
	int Version();
	String Description() default "Default";
	
}

@Info(AuthorID = 123, Date = "23 Jan 2021", Time = "12.30 PM", Version = 2 )
class dev
{
	
	@Info(AuthorID = 124, Date = "23 Jan 2021", Time = "12.30 PM", Version = 2 )
	public void getInfo() {
		System.out.println("getInfo");
	}
}

public class Question1 {
	public static void main(String[] args) {
		dev obj = new dev();
		obj.getInfo();
	}

}
