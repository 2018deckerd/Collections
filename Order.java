/**
 * Models an order that a customer can make in the restaurant.
 * Water is free of charge and can be served virtually instantly, so it is not considered part of an order.
 * @author Dylan Decker
 *
 */
public class Order {
	
	private String name;
	private int curryOrders, gyozaOrders, ramenOrders, curryWaitTime, gyozaWaitTime, ramenWaitTime, totalWaitTime;

	public Order(String customerName, Curry curryObj, Gyoza gyozaObj, Ramen ramenObj) {
		name = customerName;
		curryOrders = curryObj.getNumOrders();
		gyozaOrders = gyozaObj.getNumOrders();
		ramenOrders = ramenObj.getNumOrders();
		// the wait times are already computed accordingly to the number of orders (i.e. if there are two orders of curry which 
		// takes 15 minutes each to prepare, then the waitTime would return 30)
		curryWaitTime = curryObj.getWaitTime(); 
		gyozaWaitTime = gyozaObj.getWaitTime();
		ramenWaitTime = ramenObj.getWaitTime();
		totalWaitTime = curryWaitTime + gyozaWaitTime + ramenWaitTime;
		
	}
	
	// sets a new wait time (used for updating the clock for every iteration of the loop)
	public void setTime(int newTime) {
		totalWaitTime = newTime;
		
	}
	
	public int getTotalWaitTime() {
		return totalWaitTime;
	}
	
	
	// Information about order
	public String getInfo() {
		return name + "'s order: " + curryOrders + " curry(s), " + gyozaOrders + " gyoza(s), and " + ramenOrders + " ramen(s)";
	}

}
