package com.virtusa.phototype;

import java.util.HashMap;
import java.util.Map;

public class Registry {
	private Map<VehicleType,Vehicle> vehicles =new HashMap<>();

	public Registry() {
		this.initialize();
	}
	
	public Vehicle getVehicle(VehicleType vehicleType) {
		Vehicle vehicle=null;
		try {
			vehicle=(Vehicle)vehicles.get(vehicleType).clone();
		}
		catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
		System.out.print(vehicle);
		return vehicle;
	}
	
	private void initialize() {
		
		Car car=new Car();
		car.setEngineCapacity(2000);
		car.setType("Mini");
		car.setFuelType("Gasoline");
		
		Bus bus=new Bus();
		bus.setEngineCapacity(3000);
		bus.setNumberOfSeats(32);
		bus.setFuelType("Diesel");
		
		vehicles.put(VehicleType.CAR,car);
	//	vehicles.put(VehicleType.BUS,bus);
		
	}

}