/**
 * Models a Ramen object available for ordering from a Customer object.
 * @author Dylan Decker
 *
 */
public class Ramen  {
	
	private int waitTime;
	private int numOrders;
	
	public Ramen(int orders) {
		waitTime = 20 * orders;
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
		System.out.println("order for " + getNumOrders() + " ramen(s) will be ready in " + getWaitTime() + " minutes. Thank you.");
	}

}