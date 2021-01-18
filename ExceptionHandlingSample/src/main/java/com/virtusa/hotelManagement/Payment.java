package com.virtusa.hotelManagement;


import com.virtusa.exception.*;

public class Payment {
	

	protected double roomPrice;
	
	
	public double calcualatePayment(int roomCount, int stayDayCount, int cardNumber) throws CustomPointNullException  {
		try {
		        Discount discount = new Discount();
		    	double calculatedDiscount = discount.calculatedDiscount(cardNumber);
		    	roomPrice = calculatedDiscount+1000;
			   
		       		
		
          	}
		catch(NullDiscountException e) {
			 
			 throw new CustomPointNullException("Cause by Payment");
		}
		 return roomPrice;
		}
}
