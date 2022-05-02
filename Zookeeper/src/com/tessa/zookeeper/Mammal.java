package com.tessa.zookeeper;

public class Mammal {
	
	//member variable
	public int energyLevel;
	
	//constructor
	public Mammal() {
		this.setEnergyLevel(100);
	}
	//methods 
		public void displayEnergy() {
			System.out.println(energyLevel);
		}
	
	//getters
	public int getEnergyLevel() {
		return energyLevel;
	}
	

	//setters
	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}
	
}





