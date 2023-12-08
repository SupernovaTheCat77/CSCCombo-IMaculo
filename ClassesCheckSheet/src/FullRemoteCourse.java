
public class FullRemoteCourse extends OnlineCourse {
	String email;

	public FullRemoteCourse() {
	}

	public FullRemoteCourse(String courseNum, int credits, int numStud, int maxStud, String email) {
		super(courseNum, numStud, maxStud, credits);
		this.email = email;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String dbString() {
		return "Full Remote" + "," + courseNum + "," + credits + "," + maxStud + "," + numStud + "," + email + "\n";
	}
	
	@Override
	public String toString() {
		return "Full Remote Course: " + courseNum + "\nCredits: " + credits + "\nMaximum number of students: " + maxStud + "\nNumber of students: " + numStud + "\nInstructor email: " + email;
	}
}
