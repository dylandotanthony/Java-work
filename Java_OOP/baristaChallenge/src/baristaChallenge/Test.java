package baristaChallenge;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Menu Items
		
		Item item1 = new Item("mocha",5.75);
		Item item2 = new Item("latte",4.95);
		Item item3 = new Item("drip coffee",3.25);
		Item item4 = new Item("cappuccino",5.25);


//		Create 2 orders for unspecified guests (without specifying a name);
		Order order1 = new Order();
		Order order2 = new Order();

//		Create 3 orders using the overloaded constructor to give each a name for the order.
		
		Order order3 = new Order("Zankou");
		Order order4 = new Order("Alexis");
		Order order5 = new Order("Chessie");
		
		
//		Add at least 2 items to each of the orders using the addItem method you wrote, 
//		for example, to add item1 to order3 you would need to 
//		call the addItem method from the order3 instance like so: order3.addItem(item1);

		// 1
		order1.addItem(item2);
		order1.addItem(item4);
		//2
		order2.addItem(item1);
		order2.addItem(item3);
		//3
		order3.addItem(item1);
		order3.addItem(item2);
		//4
		order4.addItem(item3);
		order4.addItem(item4);
		//5
		order5.addItem(item1);
		order5.addItem(item2);
		order5.addItem(item3);
		order5.addItem(item4);
		
//		Test the results and the display method by calling the display method on all of your orders, like so: order3.display();
		
		order1.display();
		order2.display();
		order3.display();
		order4.display();
		order5.display();
		
//		Test your getStatusMessage functionality by setting some orders to ready and printing the messages for each order. For example: order2.setReady(true); System.out.println(order2.getStatusMessage());

		order1.setOrderStatus(true); System.out.println(order1.getStatusMessage());
		System.out.println(order2.getStatusMessage());
		order3.setOrderStatus(true); System.out.println(order3.getStatusMessage());
		System.out.println(order4.getStatusMessage());
		order5.setOrderStatus(true); System.out.println(order5.getStatusMessage());

		
//		Implement the getOrderTotal method within the Order class
//		Test the total by printing the return value like so: System.out.println(order1.getOrderTotal());
		
		System.out.println(order1.getOrderTotal());
		System.out.println(order5.getOrderTotal());
		
//		Implement the display method within the Order class

//		Finally, call the display method on all of your orders, like so: order3.display();
		
		
	}

}
