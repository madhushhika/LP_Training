package com.virtusa.exception;

public class RoomCountRuntimeException extends RuntimeException{
	
	private static final long serialVersionUID = 1L;

	public RoomCountRuntimeException(String message){
		super(message);
	 }
    public RoomCountRuntimeException(String message, Throwable cause) {
        super();
    }

}
