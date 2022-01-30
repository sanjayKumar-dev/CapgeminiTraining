
public class Student {
	private int a;
	private int b;
	private int c;
	
	Student(int a, int b, int c)
	{
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public int sum()
	{
		return (a+b+c);
	}
	
	public int returnNum(char x)
	{
		if(x == 'a')
			return this.a;
		else if(x == 'b')
			return this.b;
		else
			return this.c;
	}
	
	

}
