package com.madhushika.phototype;

public class Bus extends Vehicle{

	public int numberOfSeats;

	public int getNumberOfSeats() {
		return numberOfSeats;
	}

	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}

	@Override
	public String toString() {
		return "Bus [numberOfSeats=" + numberOfSeats + "]";
	}
	
	
}
