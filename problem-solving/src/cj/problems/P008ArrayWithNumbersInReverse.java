package cj.problems;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class P008ArrayWithNumbersInReverse {

	// Create an array having numbers in reversed order
	// from n to 1
	private static int[] generateNumbersReverse(int n) {
		int[] numbers = new int[n];
		int i=0;
		int start=n;
		while(i<n) {
			numbers[i]=start;
			start--;
			i++;
			
		}

		// Using while loop define the values of the
		// numbers starting from 1 to n.

		return numbers;
	}

	@Test
	void test() {
		int[] numbers = {5, 4, 3, 2, 1};
		assertArrayEquals(numbers, generateNumbersReverse(5));
	}

}
