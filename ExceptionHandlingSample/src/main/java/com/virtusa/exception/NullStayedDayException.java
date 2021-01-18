package com.virtusa.exception;

public class NullStayedDayException extends CustomPointNullException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public NullStayedDayException(){		
		super();
		
	}
	public NullStayedDayException(String message){
		super(message);
	 }
    public NullStayedDayException(String message, Throwable cause) {
        super(message, cause);
    }
}
