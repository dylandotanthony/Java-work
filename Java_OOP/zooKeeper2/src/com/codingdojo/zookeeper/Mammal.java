package com.codingdojo.zookeeper;

public class Mammal {

	
	private int energyLevel = 100;
	
	
	
	public int displayEnergy() {
		System.out.println("Energy Level : " + this.energyLevel);
		return this.energyLevel;
		
	}
	
	public int getEnergy() {
		return this.energyLevel;
	}
	
	public void addEnergy(int change) {
		this.energyLevel += change;
	}
	
	public void loseEnergy(int change) {
		this.energyLevel -= change;
	}
	
	public void setEnergyLevel(int energy) {
		this.energyLevel = energy;
	}
	
}
