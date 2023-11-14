
public class Course {
	String courseNum;
	int numStud;
	int maxStud;
	int credits;
	
	public Course() {
	}

	public Course(String courseNum, int numStud, int maxStud, int credits) {
		this.courseNum = courseNum;
		this.numStud = numStud;
		this.maxStud = maxStud;
		this.credits = credits;
	}

	public String getCourseNum() {
		return courseNum;
	}
	public void setCourseNum(String courseNum) {
		this.courseNum = courseNum;
	}
	public int getNumStud() {
		return numStud;
	}
	public void setNumStud(int numStud) {
		this.numStud = numStud;
	}
	public int getMaxStud() {
		return maxStud;
	}
	public void setMaxStud(int maxStud) {
		this.maxStud = maxStud;
	}
	public int getCredits() {
		return credits;
	}
	public void setCredits(int credits) {
		this.credits = credits;
	}

	@Override
	public String toString() {
		return "Course: " + courseNum + "\nCredits: " + credits + "\nMaximum number of students: " + maxStud + "\nNumber of students: " + numStud;
	}
	
	
}
