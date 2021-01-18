package com.virtusa.exception;

public  class CustomRuntimeException extends RuntimeException{
    

	/**
	 * unchecked Exception
	 */
	private static final long serialVersionUID = 1L;

	public CustomRuntimeException(String message){
		super(message);
	 }
    public CustomRuntimeException(String message, Throwable cause) {
        super();
    }
}
