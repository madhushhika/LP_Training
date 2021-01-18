package com.virtusa.exception;

public class NullRoomCountException extends CustomPointNullException{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public NullRoomCountException(){		
		super();
		
	}
	public NullRoomCountException(String message){
		super(message);
	 }
    public NullRoomCountException(String message, Throwable cause) {
        super(message, cause);
    }

}
