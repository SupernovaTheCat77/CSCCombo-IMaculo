
public class InPersonCourse extends Course {
	int roomNum;

	public InPersonCourse() {
	}

	public InPersonCourse(String courseNum, int credits, int numStud, int maxStud, int roomNum) {
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
	public String dbString() {
		return "In-Person" + "," + courseNum + "," + credits + "," + maxStud + "," + numStud + "," + roomNum + "\n";
	}
	
	@Override
	public String toString() {
		return "In-Person Course: " + courseNum + "\nCredits: " + credits + "\nMaximum number of students: " + maxStud + "\nNumber of students: " + numStud + "\nRoom number: " + roomNum;
	}
}
