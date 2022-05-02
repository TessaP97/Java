package com.tessa.zookeeper;

public class BatTest {

	public static void main(String[] args) {
		Bat giantBat = new Bat(300);
		
		giantBat.attackTown();
		giantBat.attackTown();
		giantBat.attackTown();
		giantBat.eatHumans();
		giantBat.eatHumans();
		giantBat.fly();
		giantBat.fly();
		
		giantBat.displayEnergy();

	}

}
