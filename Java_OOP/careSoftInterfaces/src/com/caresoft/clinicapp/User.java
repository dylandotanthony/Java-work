package com.caresoft.clinicapp;

public class User {
	protected Integer id;
    protected int pin;
    
    public User(Integer id) {
    	this.id = id;
    }
    
    // TO DO: Getters and setters
    // Implement a constructor that takes an ID
    
    public Integer getId() {
    	return id;
    }
    
    public int getPin() {
    	return pin;
    }
    
    public void setId(Integer sid) {
    	id = sid;
    }
    
    public void setPin(int spin) {
    	pin = spin;
    }
}
