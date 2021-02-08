package com.madhushika.exception;

public class NullDiscountException extends CustomPointNullException{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public NullDiscountException(){		
		super();
		
	}
	public NullDiscountException(String message){
		super(message);
	 }
    public NullDiscountException(String message, Throwable cause) {
        super(message, cause);
    }

}
