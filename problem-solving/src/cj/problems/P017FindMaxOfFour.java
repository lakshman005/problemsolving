package cj.problems;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class P017FindMaxOfFour {
	
	// Find the maximum of the given four integers.
	// ############################################
	// ### The solution code should not define  ###
	// ### any additional variable.             ###
	// ############################################
	
	private static int max(int a, int b, int c, int d) {
		int ma = 0;
		if(a>b && a>c && a>d) {
			ma=a;
		}
		else if(b>a && b>c && b>d) {
			ma=b;
		}
		else if(c>a && c>b && c>d) {
			ma=c;
		}
		else {
			ma=d;
		}
		
		// Write code here to find the maximum of three.
		
		return ma;
	}

	@Test
	void test() {
		assertEquals(98, max(25, 32, 98, 44));
	}

}
