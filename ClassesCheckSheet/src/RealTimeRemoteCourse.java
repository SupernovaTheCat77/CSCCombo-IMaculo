
public class RealTimeRemoteCourse extends OnlineCourse {
	String zoomLink;

	public RealTimeRemoteCourse() {
	}

	public RealTimeRemoteCourse(String courseNum, int numStud, int maxStud, String zoomLink, int credits) {
		super(courseNum, numStud, maxStud, credits);
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
		return "Course: " + courseNum + "\nCredits: " + credits + "\nMaximum number of students: " + maxStud + "\nNumber of students: " + numStud + "\nZoom link: " + zoomLink;
	}
}
