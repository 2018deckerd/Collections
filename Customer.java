/**
 * Class to represent a Customer object in a queue.
 * @author Dylan Decker
 */
public class Customer {

	private String firstName;
	private String lastName;
	private String gender;
	
	public Customer(String first, String last, String gend) {
		firstName = first;
		lastName = last;
		gender = gend;
	}
	
	// getter methods for convenience
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getGender() {
		return gender;
	}
	
	

}
