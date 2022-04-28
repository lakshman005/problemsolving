package cj.problems;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class P013CountDigits {
	
	// Count the number digits in a given integer number.
	// Example: 39874 -> 5
	// Hint: Dividing a number by 10, truncates the last digit. 
	//       Repeat this step till it becomes zero. How many ever
	//       times till it runs till it becomes zero represents 
	//       the number of digits.
	private static int countDigits(int number) {
		int digitCount = 0;
		
		while(number>0) {
			number=number/10;
			digitCount++;
		}
		
		// write code here
		
		return digitCount;
	}

	@Test
	void test() {
		assertEquals(5, countDigits(39874));
	}

}
