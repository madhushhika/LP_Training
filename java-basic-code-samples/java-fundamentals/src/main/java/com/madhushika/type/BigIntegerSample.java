package com.madhushika.type;
import java.math.BigInteger;

public class BigIntegerSample {

	// Returns Factorial of N
	static BigInteger factorial(int N) {
		// Initialize result
		BigInteger biginteger = new BigInteger("1"); // Or BigInteger.ONE

		// Multiply f with 2, 3, ...N
		for (int i = 2; i <= N; i++)
			biginteger = biginteger.multiply(BigInteger.valueOf(i));

		return biginteger;
	}

	// Driver method
	public static void main(String args[]) throws Exception {
		int N = 20;
		System.out.println(factorial(N));
	}

}
