package com.madhushika.singleton;

public class Pin {

	private static volatile Pin genaratedPin;
	
	public Pin() {
		if (genaratedPin != null) {
			throw new RuntimeException("Use the getter");
// when someone use reflection  this is stopped it and ask to use get
		
		}
		
	}
	public static Pin getGenaratePin() {
		if (genaratedPin == null) {  //double checking singleton
			
			synchronized (Pin.class) { //lock
				if (genaratedPin== null) {
					genaratedPin = new Pin();
				}
			}
		}
		return genaratedPin;
	}
	
	
	
	

}
