import java.util.Queue;
import java.util.Scanner;
import java.util.LinkedList;
 
/**
 * The driver program which creates a queue to model objects leaving and entering the "line".
 * @author Dylan Decker
 *
 */
public class Driver {
	
	public static void main(String[] args) {
		Queue<Order> line = new LinkedList<>();
		Scanner scan = new Scanner(System.in);
		int timeRemaining = 0;
		System.out.println("Welcome to Kalani Restaurant!");
			String name;
			System.out.println("Hello, first customer of the day! What would you like to order?");
			System.out.println("----------------------");
			System.out.println("MENU");
			System.out.println("----------------------");
			System.out.println("ITEM        TIME TO PREPARE");
			System.out.println("------      ----------------");
			System.out.println("CURRY       15 minutes");
			System.out.println("RAMEN       20 minutes");
			System.out.println("GYOZA       10 minutes");
			System.out.println();
			System.out.println("How many curry would you like to order?");
			Curry curryRice = new Curry(scan.nextInt());
			System.out.println("How many ramen would you like to order?");
			Ramen ramenOrder = new Ramen(scan.nextInt());
			System.out.println("How many gyoza would you like to order?");
			Gyoza gyozaOrder = new Gyoza(scan.nextInt());
			System.out.println("Thank you! May I please have your name?");
			name = scan.next();
			Order newOrder = new Order(name, curryRice, gyozaOrder, ramenOrder);
			System.out.println("Thank you, " + name + "! Your order will be ready in " + newOrder.getTotalWaitTime() + " minutes.");
			newOrder.setTime(newOrder.getTotalWaitTime() - 5);
			line.add(newOrder);
		
		// checks whether the queue is not empty
		while (line.peek() != null) {
			// removes any orders that have been completed
			if (line.peek().getTotalWaitTime() == 0) {
					Order obj = line.remove();
					System.out.println(obj.getInfo() + " has been removed from the queue.");
				}
			// provides information about iterms currently in the queue
			System.out.println("");
			System.out.println("Current number of orders in queue: " + line.size());
			System.out.println("Orders currently being processed: ");
			System.out.println("----------------------------------");
			for (Order item: line) {
				System.out.println(item.getInfo() + ". Current wait time: " + item.getTotalWaitTime() + " minutes.");
			}
			System.out.println("----------------------------------");
			// checks whether the user is interested in ordering from Kalani Restaurant
			String option;
			System.out.println("Hello! Would you like order from Kalani Restaurant today?");
			System.out.println("Options: Yes, No, or Quit (WARNING: Will terminate the system)");
			option = scan.next();
			// provides menu to user
			if (option.equalsIgnoreCase("yes")) {
			String name2;
			System.out.println("----------------------");
			System.out.println("MENU");
			System.out.println("----------------------");
			System.out.println("ITEM        TIME TO PREPARE");
			System.out.println("------      ----------------");
			System.out.println("CURRY       15 minutes");
			System.out.println("RAMEN       20 minutes");
			System.out.println("GYOZA       10 minutes");
			System.out.println();
			System.out.println("How many curry would you like to order?");
			Curry curryRice2 = new Curry(scan.nextInt());
			System.out.println("How many ramen would you like to order?");
			Ramen ramenOrder2 = new Ramen(scan.nextInt());
			System.out.println("How many gyoza would you like to order?");
			Gyoza gyozaOrder2 = new Gyoza(scan.nextInt());
			System.out.println("Thank you! May I please have your name?");
			name = scan.next();
			Order newOrder2 = new Order(name, curryRice2, gyozaOrder2, ramenOrder2);
			line.add(newOrder2);
			line.peek().setTime(line.peek().getTotalWaitTime() - 5);
			} else if (option.equalsIgnoreCase("no")){
				System.out.println("Thank you. Please let us know if you have any questions.");
				if (line.peek() == null) {
					System.out.println("Due to no orders in the queue, the system has been terminated. Please run the system again to place an order. Thank you.");
					break;
				}
				line.peek().setTime(line.peek().getTotalWaitTime() - 5);
			} else {
				System.out.println("The system has been terminated.");
				break;
			}
		}
	}
}
