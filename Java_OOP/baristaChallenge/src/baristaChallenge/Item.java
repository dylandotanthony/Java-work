package baristaChallenge;

public class Item {

	// Member Variables
	private String name;
	private double price;
	
	// CONSTRUCTOR
    //   Takes a name and price as arguments 
    //   and sets them accordingly
	public Item() {}
	
    public Item(String name, double price) {
    	this.name = name;
    	this.price = price;
    }
	
	
	
	
	
    // GETTERS & SETTERS  - for name and price
    
    
    
    // Getters
    
	public String getItemName() {
		return this.name;
	}
	
	public double getItemPrice() {
		return this.price;
	}
	
	// Setters
	
	public void setItemName(String name) {
		this.name = name;
	}
	
	public void setItemPrice(double price) {
		this.price = price;
	}
	
	
}
