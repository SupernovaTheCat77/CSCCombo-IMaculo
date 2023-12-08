
public class Employee extends Person {
	String office;
	float salary;
	String dateHired;
	
	public Employee() {
	}
	
	public Employee(String name, String address, String pNumber, String email, String office, float salary, String dateHired) {
		super(name, address, pNumber, email);
		this.office = office;
		this.salary = salary;
		this.dateHired = dateHired;
	}
	
	public String getOffice() {
		return office;
	}
	public void setOffice(String office) {
		this.office = office;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public String getDateHired() {
		return dateHired;
	}
	public void setDateHired(String dateHired) {
		this.dateHired = dateHired;
	}

	@Override
	public String toString() {
		return "Employee\nName: " + name + "\nAddress: " + address + "\nPhone Number: " + pNumber + "\nEmail Address: " + email
				+ "\nOffice: " + office + "\nSalary: " + salary + "\nDate Hired: " + dateHired;
	}
}
