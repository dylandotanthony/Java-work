package baristaChallenge;
import java.util.ArrayList;

public class Order {
	
	// MEMBER VARIABLES
    private String name; // default value of null
    private boolean ready; // default value false
    private ArrayList<Item> items = new ArrayList<Item>(); // defaults to null
    
    // CONSTRUCTOR
    // No arguments, sets name to "Guest", initializes items as an empty list.
    
    public Order() {
    	this.name = "guest";
    	this.ready = false;
    	ArrayList<Item> items = new ArrayList<Item>();
    }
    
    public Order(String name) {
    	this.name = name;
    	this.ready = false;
    	
    }
    
    // OVERLOADED CONSTRUCTOR
    // Takes a name as an argument, sets name to this custom name.
    // Initializes items as an empty list.
    
    // ORDER METHODS
    
    	// Most of your code will go here, 
    	// so implement the getters and setters first!
    
//    Create a method called addItem  that takes an Item object as an argument 
//    and adds the item to the order's items array. No need to return anything.
    public void addItem(Item item) {
    	this.items.add(item);
    	
    }
    
//    Create a method called getStatusMessage that returns a String message. 
//    If the order is ready, return "Your order is ready.", if not, 
//    return "Thank you for waiting. Your order will be ready soon."
    public String getStatusMessage() {
    	if(this.ready == true) {
    		return "Your order is ready!";
    	}else{
    		return "Thank you for waiting. Your order will be ready soon.";
    	}
    }
    
//    Similar to the getOrderTotal method from the Cafe Business Logic assignment, 
//    create a method called getOrderTotal that sums together each of the item's prices, 
//    and returns the total amount.
//    Note: This time, you do not need to pass in a list of prices, 
//    because each item object in this order's items array has its own price, 
//    that you can access using a getter!
    
    public double getOrderTotal() {
    	double total =0;
    	for(Item i : this.items) {
    		total += i.getItemPrice();
    	}
    	return total;
    }
    
//    Similar to the displayMenu function from the Cafe Business Logic assignment, 
//    create a method called display that prints out the order information like so:
    
    public void display() {
    	System.out.printf("Customer Name: %s\n", this.name);
    	for (Item i : this.items) {
    		System.out.println(i.getItemName() + " - $" + i.getItemPrice());
    	}
    	System.out.println("Total: $" + this.getOrderTotal());
    }
    
    
    // GETTERS & SETTERS
    
    // Getters
    public String getOrderName() {
    	return this.name;
	}
	
	public boolean getOrderStatus() {
		return this.ready;
	}
	
	public ArrayList<Item> getItems(){
		return items;
	}
	
	// Setters
	
	public void setOrderName(String name) {
		this.name = name;
	}
	
	public void setOrderStatus(boolean ready) {
		this.ready = ready;
	}
    
	public void setItems(ArrayList<Item> items) {
		this.items = items;
	}
    
}
