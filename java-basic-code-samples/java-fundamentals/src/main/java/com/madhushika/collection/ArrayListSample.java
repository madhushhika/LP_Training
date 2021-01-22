package com.madhushika.collection;

import java.util.ArrayList;

public class ArrayListSample {
	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");
		for (int i = 0; i < cars.size(); i++) {
			System.out.println(cars.get(i));
		}
	}
}
