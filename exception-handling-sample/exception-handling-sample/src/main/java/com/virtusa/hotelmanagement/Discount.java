package com.virtusa.hotelmanagement;
import com.virtusa.exception.*;
public class Discount {
	
	
	private double discount;

	

	public double calculatedDiscount(int cardNumber) throws NullDiscountException {
	      try { 
			LoyaltyCheck loyaltyCheck =  new LoyaltyCheck();
			loyaltyCheck.calculateLoyalPoints((int) discount);
		
              }
	      
	      catch(NullLoyaltyPointException e) {
	    	  
	    	  throw new NullDiscountException( "Caused by Discount ");
	      
	      }
	      return discount;
	      }
}


