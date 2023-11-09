
public class Course {
	String courseNum;
	int numStud;
	int maxStud;
	
	public Course() {
	}

	public Course(String courseNum, int numStud, int maxStud) {
		this.courseNum = courseNum;
		this.numStud = numStud;
		this.maxStud = maxStud;
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

	@Override
	public String toString() {
		return "Course: " + courseNum + "\nNumber of students: " + numStud + "\nMaximum number of students: " + maxStud;
	}
	
	
}
