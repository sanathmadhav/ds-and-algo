package com.recursion.example;

/**
 * 
 * @author Sanath Madhav
 *
 *         0,1,1,2,3,5,8,13,21,34
 * 
 *         F(n) = F(n-1) + F(n-2)
 * 
 */
public class Fibonacii {

	public static void main(String[] args) {
		int input = 6;
		int output = fibonacii(input);
		System.out.println(String.format("Factorial %d is %d", input, output));
	}

	private static int fibonacii(int n) {
		// base condition
		if (n <= 1)
			return n;
		// recursive condition with operation
		return fibonacii(n - 1) + fibonacii(n - 2);
	}

	// Fn = {[(√5 + 1)/2] ^ n} / √5

	static int fib(int n) {
		double phi = (1 + Math.sqrt(5)) / 2;
		return (int) Math.round(Math.pow(phi, n) / Math.sqrt(5));
	}

	private static int febonacii2(int i) {
		int result = 0;
		int lastResult = 1;
		for (int j = 0; j < i; j++) {
			int temp = result;
			result += lastResult;
			lastResult = temp;
		}
		return result;
	}
}
