package ApiTest.ApiTest;

public class User {
	int id;
	String email;
	String firstName;
	String lastName;
	
	public User() {
		
	}
	
	public User(int id, String email, String firstName, String lastName) {
		this.id = id;
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public int getId() {
		return id;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getlastName() {
		return lastName;
	}

}
