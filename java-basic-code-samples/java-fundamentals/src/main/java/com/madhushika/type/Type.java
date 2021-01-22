package com.madhushika.type;

public class Type

{
//declaring PI as constant   
	public static final double PI = 3.14;

	public static void main(String[] args) {
		System.out.print("The value of PI cannot be changed to " + PI);
		
		
		float number = 9.9f;
		short myInt = (short) number; // casting
		// double>float>long>int>short>byte = narrowing
		System.out.println(number);
		System.out.println(myInt);
		
	//	Integer myInt1 =null;
		
		/*	if(myInt1.intValue()>50) {
			System.out.println("ok");
			
		}
		if(myInt1 >50) {
			
			System.out.println("oook");
		}*/

	}

}
