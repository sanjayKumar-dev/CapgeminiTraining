
import org.springframework.expression.Expression;  
import org.springframework.expression.ExpressionParser;  
import org.springframework.expression.spel.standard.SpelExpressionParser;  
public class Test {  
public static void main(String[] args) {  
		ExpressionParser parser = new SpelExpressionParser();  
		  
		Expression exp = parser.parseExpression("'Hello SPEL'");  
		String message = (String) exp.getValue();  
		System.out.println(message);  
		//OR  
		//System.out.println(parser.parseExpression("'Hello SPEL'").getValue());  
		
		//Using concat() method with String
		ExpressionParser parser1 = new SpelExpressionParser();  
		Expression exp1 = parser1.parseExpression("'Welcome SPEL'.concat('!')");  
		String message1 = (String) exp1.getValue();  
		System.out.println(message1); 
		
		//Converting String into byte array
		Expression exp2 = parser.parseExpression("'Hello World'.bytes");  
		byte[] bytes = (byte[]) exp2.getValue();  
		for(int i=0;i<bytes.length;i++){  
		    System.out.print(bytes[i]+" ");  
		}  
		
		System.out.println();
		
		//Getting length after converting string into bytes
		Expression exp3 = parser.parseExpression("'Hello World'.bytes.length");  
		int length = (Integer) exp3.getValue();  
		System.out.println(length);  
		
		//Converting String contents into uppercase letter
		Expression exp4 = parser.parseExpression("new String('hello world').toUpperCase()");  
		String message2 = exp4.getValue(String.class);  
		System.out.println(message2);  
		//OR  
//		System.out.println(parser.parseExpression("'hello world'.toUpperCase()").getValue());  
	}  
}  


/*
SpEL is an exression language supporting the features of querying and manipulating an object graph at runtime.

There are many expression languages available such as JSP EL, OGNL, MVEL and JBoss EL. SpEL provides some additional features such as method invocation and string templating functionality.
*/