
public class RealTimeRemoteCourse extends OnlineCourse {
	String zoomLink;

	public RealTimeRemoteCourse() {
	}

	public RealTimeRemoteCourse(String courseNum, int numStud, int maxStud, String zoomLink) {
		super(courseNum, numStud, maxStud);
		this.zoomLink = zoomLink;
	}

	public String getZoomLink() {
		return zoomLink;
	}
	public void setZoomLink(String zoomLink) {
		this.zoomLink = zoomLink;
	}
	
	@Override
	public String toString() {
		return "Course: " + courseNum + "\nNumber of students: " + numStud + "\nMaximum number of students: " + maxStud + "\nZoom link: " + zoomLink;
	}
}
