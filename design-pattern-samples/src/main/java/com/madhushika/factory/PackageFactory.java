package com.madhushika.factory;

public class PackageFactory {

	public static Package createPackage(PackageCode packageCode) {
		switch (packageCode) {
		case ELEGANT:
			return new ElegantPackage();
		case DELUXE:
			return new DeluxePackage();
		case ROYAL:
			return new RoyalPackage();
		default:
			return null;
		}

	}

}
