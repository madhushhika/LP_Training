package com.madhushika.factory;

public class DeluxePackage  extends Package{
	
	@Override
	protected void createPackage() {
	
	photographs.add(new WeddingPhoto());
	photographs.add(new PreshootPhoto());
}

}