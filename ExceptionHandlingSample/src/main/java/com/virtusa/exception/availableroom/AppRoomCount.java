package com.virtusa.exception.availableroom;
import com.virtusa.exception.*;
import com.virtusa.hotelManagement.*;



public class AppRoomCount {
	
	//Unchecked Exception
	public static void main(String[] args) {
		try {	  	 
		  	
		  	 AvailableRoom availableRoom =new AvailableRoom();
			 availableRoom.calRoomCount(9);
		  	  }
		catch (RoomCountRuntimeException e) {
			  
	          System.err.println( "No available rooms " + e );
		
	    }
	     
	}

}

  

	    

		
	

