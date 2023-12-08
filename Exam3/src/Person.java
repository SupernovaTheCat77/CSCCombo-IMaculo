
public class Person {
	String name;
	String address;
	String pNumber;
	String email;
	
	public Person() {
	}
	
	public Person(String name, String address, String pNumber, String email) {
		this.name = name;
		this.address = address;
		this.pNumber = pNumber;
		this.email = email;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getpNumber() {
		return pNumber;
	}
	public void setpNumber(String pNumber) {
		this.pNumber = pNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Person\nName: " + name + "\nAddress: " + address + "\nPhone Number: " + pNumber + "\nEmail Address: " + email;
	}	
}
