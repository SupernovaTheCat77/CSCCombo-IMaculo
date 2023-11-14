
public class InPersonCourse extends Course {
	int roomNum;

	public InPersonCourse() {
	}

	public InPersonCourse(String courseNum, int numStud, int maxStud, int roomNum, int credits) {
		super(courseNum, numStud, maxStud, credits);
		this.roomNum = roomNum;
	}

	public int getRoomNum() {
		return roomNum;
	}
	public void setRoomNum(int roomNum) {
		this.roomNum = roomNum;
	}
	
	@Override
	public String toString() {
		return "Course: " + courseNum + "\nCredits: " + credits + "\nMaximum number of students: " + maxStud + "\nNumber of students: " + numStud + "\nRoom number: " + roomNum;
	}
}
