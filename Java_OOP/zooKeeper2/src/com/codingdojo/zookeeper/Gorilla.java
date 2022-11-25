package com.codingdojo.zookeeper;

public class Gorilla extends Mammal {

	public Gorilla() {}
	
	public void throwSomething() {
		System.out.println("Gorrilla has thrown somthing!");
		this.loseEnergy(5);
	}
	
	public void eatBananas() {
		System.out.println("Gorrilla is happy with nourishment!");
		this.addEnergy(10);
	}
	
	public void climb() {
		System.out.println("Gorrilla has climbed up the tree!");
		this.loseEnergy(10);
	}
	
	
	
	
	
	
}

