package com.madhushika.type;

public class Operators {

	// variable x = (expression) ? value if true : value if false
	public static void main(String args[]) {
		int a, b;
		a = 10;

		b = (a == 1) ? 20 : 30;
		System.out.println("Value of b is : " + b);

		b = (a == 10) ? 20 : 30;
		System.out.println("Value of b is : " + b);
		cal();
	}

	static void cal() {
		int x = 5;
		x &= 3;
		System.out.println(x);

	}

}
