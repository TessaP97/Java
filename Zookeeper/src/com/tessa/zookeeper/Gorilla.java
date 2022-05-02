package com.tessa.zookeeper;

public class Gorilla extends Mammal {
	
	//methods
	public int throwSomething() {
		System.out.println("gorilla throws banana");
		return energyLevel-=5;
	}
	
	public int eatBananas() {
		System.out.println("nom nom");
		return energyLevel+=10;
	}
	
	public int climb() {
		System.out.println("climbing up tree");
		return energyLevel-=10;
	}

}
