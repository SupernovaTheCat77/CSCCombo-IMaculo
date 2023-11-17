
public class Staff extends Employee {
	String title;

	public Staff() {
	}

	public Staff(String name, String address, String pNumber, String email, String office, float salary,
			String dateHired, String title) {
		super(name, address, pNumber, email, office, salary, dateHired);
		this.title = title;
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	@Override
	public String toString() {
		return "Staff\nName: " + name + "\nAddress: " + address + "\nPhone Number: " + pNumber + "\nEmail Address: " + email
				+ "\nOffice: " + office + "\nSalary: " + salary + "\nDate Hired: " + dateHired
				+ "\nTitle: " + title;
	}
}
