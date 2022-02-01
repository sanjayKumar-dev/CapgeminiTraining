abstract class Persistence {
    abstract public String persist();
}
class FilePersistence extends Persistence{
    @Override
    public String persist() {
    	return "FilePersistence";
    }
    
    public String persist1() {
    	return "FilePersistence1";
    }
}
class DatabasePersistence extends Persistence{
    @Override
    public String persist() {
    	return "DatabasePersistence";
    }
}

public class Assignment2Q6 {
    public static void main(String[] args) {
    	Persistence obj = new FilePersistence();
    	Persistence obj1 = new DatabasePersistence();
    	System.out.println(obj.persist());
    	System.out.println(obj1.persist());
    }
}