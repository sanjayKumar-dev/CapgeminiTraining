import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class demoForExamples {

	  @BeforeAll
	  @Test
	  public void runOnceBeforeAllTests() {
	    System.out.println("@BeforeAll executed");
	  }
	
	  @BeforeEach
	  @Test
	  public void runBeforeEveryTest() {
	    System.out.println("@BeforeEach executed");
	  }

	  @AfterEach
	  @Test
	  public void runAfterEveryTest() {
	    System.out.println("@AfterEach executed \n");
	  }
	  @AfterAll
	  @Test
	  public void runOnceAfterAllTests() {
	    System.out.println("@AfterAll executed");
	  }
	  
	  @Test
	  public void testMethod1() {
	    System.out.println("@Test method 1 executed");
	  }
	  
	  @Test
	  public void testMethod2() {
	    System.out.println("@Test method 2 executed");
	  }
}
