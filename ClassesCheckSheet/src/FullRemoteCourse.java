
public class FullRemoteCourse extends OnlineCourse {
	String email;

	public FullRemoteCourse() {
	}

	public FullRemoteCourse(String courseNum, int numStud, int maxStud, String email) {
		super(courseNum, numStud, maxStud);
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
		return "Course: " + courseNum + "\nNumber of students: " + numStud + "\nMaximum number of students: " + maxStud + "\nInstructor email: " + email;
	}
}
