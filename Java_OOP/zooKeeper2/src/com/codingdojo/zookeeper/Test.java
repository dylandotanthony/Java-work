package com.codingdojo.zookeeper;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gorilla gorillas = new Gorilla();
		Bat bats = new Bat();
		
		
		gorillas.throwSomething(); // -5
		gorillas.displayEnergy(); // 95
		gorillas.eatBananas(); // +10
		gorillas.displayEnergy(); // 105
		gorillas.throwSomething(); // -5
		gorillas.displayEnergy(); // 100
		gorillas.eatBananas(); // +10
		gorillas.displayEnergy(); // 110
		gorillas.throwSomething(); // -5
		gorillas.displayEnergy(); // 105
		gorillas.climb(); // -10
		gorillas.displayEnergy(); // 95

		bats.attackTown(); // -100
		bats.displayEnergy(); // 200
		bats.eatHumans(); // +25
		bats.displayEnergy(); // 225
		bats.fly(); // -10
		bats.displayEnergy(); // 215
		bats.attackTown(); // -100
		bats.displayEnergy(); // 115
		bats.eatHumans(); // +25
		bats.displayEnergy(); // 140
		bats.attackTown(); // -100
		bats.displayEnergy(); // 40
		bats.fly(); // -10
		bats.displayEnergy(); // 30
		
		
		
		bats.fly();
		bats.displayEnergy();
	}

}
