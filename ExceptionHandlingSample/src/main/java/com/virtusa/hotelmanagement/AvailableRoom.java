package com.virtusa.hotelmanagement;
import com.virtusa.exception.RoomCountRuntimeException;

public class AvailableRoom {
	
	
	 //Unchecked Exception
	public  void calRoomCount( int availableRoomCount) throws RoomCountRuntimeException {
	  
          if (availableRoomCount>5) {
        	  
        	  throw new  RoomCountRuntimeException("Rooms are not available");
           }

	}
}
