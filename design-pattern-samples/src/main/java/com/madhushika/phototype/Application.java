package com.madhushika.phototype;

public class Application {

	public static void main(String[] args) {
		
	Registry registry = new Registry();
	Car car = (Car)registry.getVehicle(VehicleType.CAR);
	System.out.print(car);
	car.setType("lux");
	System.out.print(car);
	Car car2 = (Car )registry.getVehicle(VehicleType.CAR);
	System.out.print(car2);
		
	}
}
