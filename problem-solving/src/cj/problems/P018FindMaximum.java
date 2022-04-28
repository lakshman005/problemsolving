package cj.problems;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class P018FindMaximum {
	// Given an array of integers, find the maximum.
	// Ex: { 5, 2, 8, 9, 3 } -> Maximum is 9
	// Hint: Closely look into the previous problem 
	//       code. Whatever lines that are repeating, 
	//       it needs to be included in a loop.
	private static int findMaximum(int[] numbers) {
		int max = numbers[0];
		for(int i=0;i<numbers.length;i++) {
			for(int j=0;j<numbers.length;j++) {
				if(numbers[i]<numbers[j]) {
					max=numbers[j];
				}
			}
		}
		
		// write code here
		
		return max;
	}
	
	@Test
	void test1() {
		int[] numbers = { 5, 2, 8, 9, 3 };
		assertEquals(9, findMaximum(numbers));
	}

	@Test
	void test2() {
		int[] numbers = { 1, 3, 4, 5, 7, 8, 9 };
		assertEquals(9, findMaximum(numbers));
	}
}
