
public class Student {
	
	private String fName;
	private String lName;
	private String sNum;
	private double grade;
	
	public Student() {
		fName = "Jane";
		lName = "Doe";
		sNum = "12345678";
		grade = 4.0;
	}
	
	public Student(String fName, String lName, String sNum, double grade) {
		this.fName = fName;
		this.lName = lName;
		this.sNum = sNum;
		this.grade = grade;
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
	public String getsNum() {
		return sNum;
	}
	public void setsNum(String sNum) {
		this.sNum = sNum;
	}
	public double getGrade() {
		return grade;
	}
	public void setGrade(double grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Hello, " + fName + " " + lName + ". Your S number is S" + sNum + " and your grade is " + grade + ".";
	}
	
	
}