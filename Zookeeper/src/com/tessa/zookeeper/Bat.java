package com.tessa.zookeeper;

public class Bat extends Mammal {
	
	
	public Bat(int energyLevel) {
		setEnergyLevel(300);
	}
	
	public int fly() {
		System.out.println("swoosh");
		return energyLevel-=50;
	}
	
	public int eatHumans() {
		return energyLevel+=25;
	}
	
	public int attackTown() {
		System.out.println("ahhhhhh!");
		return energyLevel-=100;
	}

}
