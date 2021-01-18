package com.virtusa.exception;

public class NullLoyaltyPointException extends CustomPointNullException{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public NullLoyaltyPointException(){		
		super();
		
	}
	public NullLoyaltyPointException(String message){
		super(message);
	 }
    public NullLoyaltyPointException(String message, Throwable cause) {
        super(message, cause);
    }

}
