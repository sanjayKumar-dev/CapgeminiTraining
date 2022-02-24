
public class Question1 {
	public static void main(String[] args) {
		var p = 5000;
		var r = 5;
		var t = 2;
		
		si s = (var a, var b, var c) -> (a*b*c)/100;
		System.out.println(s.calculate(p, r, t));
		
	}
	
	interface si{
		int calculate(int a, int b, int c);
	}

}
