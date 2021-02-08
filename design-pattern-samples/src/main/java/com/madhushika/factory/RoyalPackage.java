package com.virtusa.factory;

public class RoyalPackage  extends Package{
	
	protected  void createPackage() {
		
		photographs.add( new WeddingPhoto());
		photographs.add(new PreshootPhoto());
		
	}

}
