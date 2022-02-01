
public class AssignmentsOnString {
	public static void main(String[] args) {
		
		//Solution of Q1
		String str = "Hello World";
		System.out.println(str.length());
		
		//Solution of Q2
		String str1 = "Hello,";
		String str2 = "How are you";
		System.out.println(str1.concat(str2));
		
		//Solution of Q3
		String str3 = new String("Java String pool refers to collection of Strings which are stored in heap memory");
		
		//a
		System.out.println(str3.toLowerCase());
		
		//b
		System.out.println(str3.toUpperCase());
		
		//c
		System.out.println(str3.replace('a', '$'));
		
		//d
		String str4 = new String("java string pool refers to collection of strings which are stored in heap memory");
		System.out.println(str3.equals(str4));
		
		//e
		String str5 = str3.toLowerCase();
		System.out.println(str3.equals(str5));
		System.out.println();
		
		//Assignments on StringBuffer Class
		//Solution of Q1
		StringBuffer buffer = new StringBuffer();
		buffer.append("StringBuffer");
		buffer.append(" is a peer class of String");
		buffer.append(" that provides much of");
		buffer.append(" the functionality of strings");
		System.out.println(buffer);
		
		//Solution of Q2
		StringBuffer b = new StringBuffer("It is used to _ at the specified index position");
		int pos = 0;
		for(int i=0; i<b.length(); i++)
		{
			if(b.charAt(i) == '_')
			{
				pos = i;
				break;
			}
		}
		String s = b.substring(0, pos) + "insert text" + b.substring(pos+1, b.length());
		System.out.println(s);
		
		//Solution of Q3
		StringBuffer b1 = new StringBuffer("This method returns the reversed object on which it was called");
		System.out.println(b1.reverse());
		
		System.out.println();
		//System.out.println("String Builder");
		
		//Assignments on StringBuilder Class
		//Solution of Q1
		StringBuilder builder = new StringBuilder();
		builder.append("StringBuilder");
		builder.append(" is a peer class of String");
		builder.append(" that provides much of");
		builder.append(" the functionality of strings");
		System.out.println(builder);
		
		//Solution of Q2
		StringBuilder bui = new StringBuilder("It is used to _ at the specified index position");
		int pos1 = 0;
		for(int i=0; i<bui.length(); i++)
		{
			if(bui.charAt(i) == '_')
			{
				pos1 = i;
				break;
			}
		}
		String sbui = bui.substring(0, pos1) + "insert text" + bui.substring(pos1+1, bui.length());
		System.out.println(sbui);
		
		//Solution of Q3
		StringBuffer bui1 = new StringBuffer("This method returns the reversed object on which it was called");
		System.out.println(bui1.reverse());
	} 

}
