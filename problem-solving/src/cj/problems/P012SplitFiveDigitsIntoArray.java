package cj.problems;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class P012SplitFiveDigitsIntoArray {

	// Digits of a five digit number should be split and 
	// returned in an array of size five having the split numbers
	// Ex: Number - 34567 -> Array having {3, 4, 5, 6, 7}
	// Steps to implement:
	// 1. Get the last digit using modulus operator and 
	//    store it as last item in array.
	// 2. Truncate last digit using division operator.
	// 3. Apply modulus on the number after truncation to 
	//    get the second digit and store in the second position 
	//    of the array.
	// 4. Repeat above step three more times to get the digits 
	//    one by one and store it in the respective array position.
	private static int[] splitDigits(int number) {
		int[] numbers = new int[5];
		int remainder, quotient = 0;
		int i=4;
		while(number!=0) {
			quotient=number%10;
			numbers[i]=quotient;
			number=number/10;
			i--;
		}
		
		// Write code here. Use the above variables. Don't create new variables.
		
		return numbers;
	}
	
	
	@Test
	void test1() {
		int[] expected = {3, 4, 5, 6, 7};
		assertArrayEquals(expected, splitDigits(34567));
	}

	@Test
	void test2() {
		int[] expected = {9, 1, 7, 8, 2};
		assertArrayEquals(expected, splitDigits(91782));
	}

}
