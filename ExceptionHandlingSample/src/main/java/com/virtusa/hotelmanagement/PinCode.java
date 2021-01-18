package com.virtusa.hotelmanagement;


import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class PinCode {
	
	public static void main(String[]args) {
	
	//checked Exception
		try {
			FileInputStream pincode = null;
			pincode= new FileInputStream("D:/pincode.txt");  
		} catch (FileNotFoundException e) {
			System.out.println("pin code is not found " + e);
		}
		 
		
	

	}


}
