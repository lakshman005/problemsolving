package cj.problems;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class P007ArrayWithNumbers {
	
	// Create an array having numbers from 1 to n
	private static int[] generateNumbers(int n) {
		int[] numbers = new int[n];
		int i=0;
		while(i<n) {
			numbers[i]=i+1;
			i++;
			
		}
		
		// Using while loop define the values of the 
		// numbers starting from 1 to n.
		
		return numbers;
	}

	@Test
	void test() {
		int[] numbers = {1, 2, 3, 4, 5};
		assertArrayEquals(numbers, generateNumbers(5));
		
	}

}
