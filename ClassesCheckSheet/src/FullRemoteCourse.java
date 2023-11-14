
public class FullRemoteCourse extends OnlineCourse {
	String email;

	public FullRemoteCourse() {
	}

	public FullRemoteCourse(String courseNum, int numStud, int maxStud, String email, int credits) {
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
	public String toString() {
		return "Course: " + courseNum + "\nCredits: " + credits + "\nMaximum number of students: " + maxStud + "\nNumber of students: " + numStud + "\nInstructor email: " + email;
	}
}
