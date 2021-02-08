package com.madhushika.factory;

public class Application {

	public static void main(String[] args) {
		Package packageObj = PackageFactory.createPackage(PackageCode.ELEGANT);
		System.out.println(packageObj);
		Package packageObj1 = PackageFactory.createPackage(PackageCode.DELUXE);
		System.out.println(packageObj1);
		Package packageObj2 = PackageFactory.createPackage(PackageCode.ROYAL);
		System.out.println(packageObj2);
	}
}
