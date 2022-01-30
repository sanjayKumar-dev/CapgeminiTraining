
public class Assignment1Q9 {

    public static void main(String[] args) {
    	Student s1 = new Student(10, 20, 30);
    	Student s2 = new Student(10, 20, 30);
    	Student s3 = new Student(10, 20, 30);
    	
    	System.out.println(s1.sum()+s2.sum()+s3.sum());
    	System.out.println( (s1.sum()+s2.sum()+s3.sum())/3 );
    	
    	System.out.println();
    	
    	System.out.println( s1.returnNum('a') + s2.returnNum('a') + s3.returnNum('a'));
    	System.out.println( (s1.returnNum('a') + s2.returnNum('a') + s3.returnNum('a'))/3 );
    	
    	System.out.println();
    	
    	System.out.println( s1.returnNum('b') + s2.returnNum('b') + s3.returnNum('b'));
    	System.out.println( (s1.returnNum('b') + s2.returnNum('b') + s3.returnNum('b'))/3 );
    	
    	System.out.println();
    	
    	System.out.println( s1.returnNum('c') + s2.returnNum('c') + s3.returnNum('c'));
    	System.out.println( (s1.returnNum('c') + s2.returnNum('c') + s3.returnNum('c'))/3 );
    	
    }
}