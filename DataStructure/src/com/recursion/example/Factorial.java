package com.recursion.example;

/**
 * 
 * @author Sanath Madhav
 *
 */
public class Factorial {
	public static void main(String[] args) {
		int input = 5;
		int output = factorial(input);
		System.out.println(String.format("Factorial %d is %d", input, output));
	}

	private static int factorial(int i) {
		// base condition
		if (i == 0) {
			return 1;
		}
		//recursive condition with operation
		return i * factorial(i - 1);
	}
}
