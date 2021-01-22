package com.madhushika.loop;

public class IfElse {

	public static void main(String[] a) {

		int number = 13;
		// Check if the number is divisible by 2 or not
		if (number % 2 == 0) {
			System.out.println("even number");
		} else {
			System.out.println("odd number");
		}

		// leap or common year
		int year = 2020;
		if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
			System.out.println("LEAP YEAR");
		} else {
			System.out.println("COMMON YEAR");
		}

		int numberTrenary = 13;
		// Using ternary operator
		String output = (numberTrenary % 2 == 0) ? "even number" : "odd number";  // true:false
		System.out.println(output);
		
		
		
		//nested if 
		  int age=20;  
		    int weight=80;    
		 
		    if(age>=18){    
		        if(weight>50){  
		            System.out.println("");  
		        }  
	}

  }
}
