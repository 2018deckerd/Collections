/**
 * Models a Gyoza object available for ordering from a Customer object.
 * @author Dylan Decker
 *
 */
public class Gyoza {
	
	private int waitTime;
	private int numOrders;
	
	public Gyoza(int orders) {
		waitTime = 10 * orders;
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
		System.out.println("order for " + getNumOrders() + " gyoza(s) will be ready in " + getWaitTime() + " minutes. Thank you.");
	}

}