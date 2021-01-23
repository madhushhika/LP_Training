package com.virtusa.phototype;


public abstract class Vehicle implements Cloneable {
	
	public String fuelType;
	public  int engineCapacity;
	
	
	public String getFuelType() {
		return fuelType;
	}
	public int getEngineCapacity() {
		return engineCapacity;
	}
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	public void setEngineCapacity(int engineCapacity) {
		this.engineCapacity = engineCapacity;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}
	
}
