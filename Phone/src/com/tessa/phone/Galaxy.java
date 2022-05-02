package com.tessa.phone;

public class Galaxy extends Phone implements Ringable {

	public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
		super(versionNumber, batteryPercentage, carrier, ringTone);
	}

	@Override
	public void displayInfo() {
		System.out.println("Galaxy " + getVersionNumber() + " from " + getCarrier());
		
	}

	@Override
	public String ring() {
		return("Galaxy " + getVersionNumber() + " says " + getRingTone());
	}

	@Override
	public String unlock() {
		return "Unlocking via finger print";
	}
	
}
