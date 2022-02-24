import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Question4 {
	public static void main(String[] args) {
		var path = "E:\\CapgeminiTraining\\coreJAVA\\Java 11 Features\\Question4\\StudentList.txt";
		
		try {			
			String data = Files.readString(Path.of(path));
			String[] sub = data.split("\n");			
			System.out.println(sub.length);			
			System.out.println(data);
			
		} catch (IOException e) {
			e.printStackTrace();			
		}		
	}

}
