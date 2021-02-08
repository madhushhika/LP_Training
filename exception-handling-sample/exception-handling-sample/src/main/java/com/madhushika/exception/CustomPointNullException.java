package com.madhushika.exception;

public class CustomPointNullException extends Exception {
	
	
		/**
	 * Checked Exception
	 */
	private static final long serialVersionUID = 1L;
		public CustomPointNullException(){		
			super();
			
		}
		public CustomPointNullException(String message){
			super(message);
		 }
	    public CustomPointNullException(String message, Throwable string) {
	        super(message, string);
	    }
		
		

}
