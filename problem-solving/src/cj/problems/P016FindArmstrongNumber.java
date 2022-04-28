package cj.problems;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class P016FindArmstrongNumber {
	
	// Given an integer number, find if it is an Armstrong 
	// number or not. A number is an Armstrong number, if the 
	// sum of the cube of the digits is the same as the number.
	// Ex: 153 -> (1^3) + (5^3) + (3^3) = 1 + 125 + 27 = 153.
	private static boolean isArmstrongNumber(int number) {
		
		int temp=number;
		int quo;
		int sum=0;
		while(number>0) {
			quo=number%10;
			quo= (int) Math.pow(quo,3);
			sum+=quo;
			number=number/10;
		}
		if(temp==sum) {
			return true;
		}
		else {
			return false;
		}
		
	}

	@Test
	void test1() {
		assertTrue(isArmstrongNumber(153));
	}

	@Test
	void test2() {
		assertFalse(isArmstrongNumber(154));
	}

}
