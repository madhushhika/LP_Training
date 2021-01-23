package com.virtusa.factory;

public class ElegantPackage extends Package {

	@Override
	protected void createPackage() {

		photographs.add(new EngagementPhoto());
		photographs.add(new WeddingPhoto());
		photographs.add(new PreshootPhoto());

	}

}
