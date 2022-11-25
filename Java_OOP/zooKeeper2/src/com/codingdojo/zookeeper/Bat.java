package com.codingdojo.zookeeper;

public class Bat extends Mammal {
	
//	private int energyLevel = 300;
	
	Bat() {
		this.setEnergyLevel(300);
	}
	
	public void fly() {
		System.out.println(" flap-flap-flap ");
		this.loseEnergy(50);
	}

	public void eatHumans() {
		System.out.println(" CHOMP-CHOMP >SCREAMS< ");
		this.addEnergy(25);
	}
	public void attackTown() {
		System.out.println(" crackling-fire  >SCREAMS< ");
		this.loseEnergy(100);
	}
	
	
}
