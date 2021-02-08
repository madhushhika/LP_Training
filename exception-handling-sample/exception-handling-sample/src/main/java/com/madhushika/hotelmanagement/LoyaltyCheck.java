package com.madhushika.hotelmanagement;
import com.madhushika.exception.*;

public class LoyaltyCheck extends Payment   {
	
	
	protected int loyaltyPoints;
	public int calculateLoyalPoints(int cardNumber)throws NullLoyaltyPointException{
		try{
			
            Room room = new Room();
			room.calPoints();
			if (cardNumber == 345) {
				loyaltyPoints = 1;
			}
	
			
		}
		catch(NullRoomCountException e) {
		    
			throw new NullLoyaltyPointException("Cause by Loyalty Customer Points" + e);
		}
		
		return loyaltyPoints;
		
         
	}
}