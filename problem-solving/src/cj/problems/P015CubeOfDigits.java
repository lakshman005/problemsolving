package cj.problems;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class P015CubeOfDigits {
	
	// Given an integer number, find the cube of each digit.
	// Ex -> 152 - (1 ^ 3), (5 ^ 3), (2 ^ 3) = 1, 125, 8.
	// Hint: 1. Count the number of digits and create an array based on 
	//          the number of digits.
	//       2. Split the digits, then cube the number and 
	//          store them in the array in the respective position.
	private static int[] cubeOfDigits(int number) {
		int quo;
		int numbers[]=new int[3];
		int i=2;
		while(number>0) {
			quo=number%10;
			quo=(int)Math.pow(quo,3);
			number=number/10;
			numbers[i]=quo;
			i--;
		}
		
	 return numbers;
	}

	@Test
	void test() {
		int[] numbers = {1, 125, 8};
		assertArrayEquals(numbers, cubeOfDigits(152));
	}
 
}
