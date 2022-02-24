import java.util.ArrayList;

public class Assignment5Q1 {

    public static void main(String[] args) {
    	
    	Fruit f1 = new Fruit("apple", 50, 5, "red");
    	Fruit f2 = new Fruit("banana", 100, 10, "yellow");
    	Fruit f3 = new Fruit("orange", 90, 8, "orange");
    	
    	ArrayList<Fruit> f =new ArrayList<>();
    	f.add(f1);
    	f.add(f2);
    	f.add(f3);
    	
    	//Solution for 1. Display the fruit names of low calories fruits i.e. calories < 100 sorted in descending order of calories.
    	f.stream()
    	.filter(i -> i.getCalories()<100)
    	.sorted((fr1, fr2) -> fr2.getCalories() - fr1.getCalories())
    	.forEach(n -> System.out.println(n.getName()));
    	
    	System.out.println();
    	
    	//Solution for 2. Display color wise list of fruit names.
    	f.stream()
    	.sorted( (fr1, fr2) -> fr1.getColor().compareTo(fr2.getColor()) )
    	.forEach(n -> System.out.println(n.getName()));
    	
    	System.out.println();
    	
    	//Solution for 3. Display only RED color fruits sorted as per their price in ascending order.
    	f.stream()
    	.filter(fr -> fr.getColor().contentEquals("red"))
    	.sorted( (fr1, fr2) -> fr1.getPrice()-fr2.getPrice() )
    	.forEach(n -> System.out.println(n.getName()));
    }

}