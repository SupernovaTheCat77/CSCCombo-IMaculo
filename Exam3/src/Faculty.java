
public class Faculty extends Employee {
	String officeHours;
	String rank;
	
	public Faculty() {
	}
	
	public Faculty(String name, String address, String pNumber, String email, String office, float salary,
			String dateHired, String officeHours, String rank) {
		super(name, address, pNumber, email, office, salary, dateHired);
		this.officeHours = officeHours;
		this.rank = rank;
	}

	public String getOfficeHours() {
		return officeHours;
	}
	public void setOfficeHours(String officeHours) {
		this.officeHours = officeHours;
	}
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
	
	@Override
	public String toString() {
		return "Faculty\nName: " + name + "\nAddress: " + address + "\nPhone Number: " + pNumber + "\nEmail Address: " + email
				+ "\nOffice: " + office + "\nSalary: " + salary + "\nDate Hired: " + dateHired
				+ "\nOffice Hours: " + officeHours + "\nRank: " + rank;
	}
	
}
