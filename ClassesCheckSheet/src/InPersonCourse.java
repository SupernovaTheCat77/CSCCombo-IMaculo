
public class InPersonCourse extends Course {
	int roomNum;

	public InPersonCourse() {
	}

	public InPersonCourse(String courseNum, int numStud, int maxStud, int roomNum) {
		super(courseNum, numStud, maxStud);
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
		return "Course: " + courseNum + "\nNumber of students: " + numStud + "\nMaximum number of students: " + maxStud + "\nRoom number: " + roomNum;
	}
}
