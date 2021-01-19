package com.virtusa.hotelmanagement;
import com.virtusa.exception.*;

public class Room  {
	
	int pointsPerDecember = 6;
	public int calculatedPoints ;
	public int roomCount;
	public int  calPoints() throws NullRoomCountException {
		
	        calculatedPoints =  pointsPerDecember + 1;
			if(roomCount ==0)
			throw new NullRoomCountException("Caused by room count" );
		    return calculatedPoints;		
      }
}