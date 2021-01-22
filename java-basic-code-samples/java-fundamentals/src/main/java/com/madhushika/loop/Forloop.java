package com.madhushika.loop;

public class Forloop {

	public static void main(String[] args) {
		int term = 8;
		for (int i = 1; i <= term; i++) {
			for (int j = term; j >= i; j--) {
				System.out.print("* ");
			}
			System.out.println();// new line
		}

		
		int arr[] = { 12, 23, 44, 56, 78 };
		// Printing array using for-each loop
		for (int i : arr) {
			System.out.println(i);
		}
		
		 for(;;){  
		//        System.out.println("infinitive loop");  
		    }  
	}
}
