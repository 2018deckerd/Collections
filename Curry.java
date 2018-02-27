/**
 * Models a curry object available for ordering from a Customer object.
 * @author Dylan Decker
 *
 */
public class Curry {
	
	private int waitTime;
	private int numOrders;
	
	public Curry(int orders) {
		waitTime = 15 * orders;
		numOrders = orders;
	}
	
	// getter methods for convenience
	public int getWaitTime() {
		return waitTime;
	}
	
	public int getNumOrders() {
		return numOrders;
	}
	
	// general information about order
	public void printInfo() {
		System.out.println("order for " + getNumOrders() + " curry(s) will be ready in " + getWaitTime() + " minutes. Thank you.");
	}

}
