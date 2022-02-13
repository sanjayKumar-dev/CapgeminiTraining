import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

public class MinMaxTest {

	MinMaxFinder minMax;

	@Test
	@DisplayName("Testing Find Min Max Function")
	public void findMinMaxTest() {
		minMax = new MinMaxFinder();
		int arr[] = {5, 8, 2, 9};		
		String expected = Integer.toString(29);
		String actual = minMax.findMinMax(arr);
		assertEquals(expected, actual);
		
		
		int arr1[] = {51, -82, 0, 9};
		String expected1 = Integer.toString(-8251);
		assertEquals(expected1, minMax.findMinMax(arr1));

		int arr2[] = {0,0,0};
		String expected2 = Integer.toString(0);
		expected2 += Integer.toString(0);
		assertEquals(expected2, minMax.findMinMax(arr2));
				
		
	}

}
