
public class Student extends Person {
	String status;

	public Student() {
		super();
	}

	public Student(String name, String address, String pNumber, String email, String status) {
		super(name, address, pNumber, email);
		this.status = status;
	}
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Student\nName: " + name + "\nAddress: " + address + "\nPhone Number: " + pNumber + "\nEmail Address: " + email
				+ "\nStatus: " + status;
	}
	
}
