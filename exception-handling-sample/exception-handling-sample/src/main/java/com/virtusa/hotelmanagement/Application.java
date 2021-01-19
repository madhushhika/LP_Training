package com.virtusa.hotelmanagement;

import java.util.Scanner;

import com.virtusa.exception.*;

public class Application {
	
private static Scanner sc;

public static void main (String[] args) {
	
	try {
		sc = new Scanner(System.in);
		System.out.println("Please enter the room number ");
		int roomNo = sc.nextInt();
		System.out.println("Please enter the loyalty card number");
		int cardNumber = sc.nextInt();
		System.out.println("Please enter the staying days count");
		int stayDayCount = sc.nextInt();
		System.out.println("Please enter the count of rooms");
		int roomCount = sc.nextInt();
		
		Payment payment = new Payment();
	        double price = payment.calcualatePayment(roomCount,stayDayCount,cardNumber);
		System.out.print(price);
	        AvailableRoom availableRoom =new AvailableRoom();
	        availableRoom.calRoomCount(roomCount);
			

				
	    }
	
         catch(CustomPointNullException e) {
	        e.printStackTrace();
		System.err.println( " Payment cannot proceed  " + e );	
		
	}

	
   }
}
