
public class Person {
	private String fName;
	private String lName;
	private int age;
	private int inches;
	
	public Person() {
		fName = "Jane";
		lName = "Doe";
		age = 35;
		inches = 72;
	}
	
	public Person(String fName, String lName, int age, int inches) {
		this.fName = fName;
		this.lName = lName;
		this.age = age;
		this.inches = inches;
	}


	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getInches() {
		return inches;
	}
	public void setInches(int inches) {
		this.inches = inches;
	}

	@Override
	public String toString() {
		return fName + " " + lName + "\nAge: " + age + "\nHeight: " + inches/12 + " feet, " + inches%12 + " inches\n\n";
	}
	
	
	
	
}
