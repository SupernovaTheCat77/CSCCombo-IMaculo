
public class RealTimeRemoteCourse extends OnlineCourse {
	String zoomLink;

	public RealTimeRemoteCourse() {
	}

	public RealTimeRemoteCourse(String courseNum, int credits, int numStud, int maxStud, String zoomLink) {
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
	public String dbString() {
		return "Real-Time Remote" + "," + courseNum + "," + credits + "," + maxStud + "," + numStud + "," + zoomLink + "\n";
	}
	
	@Override
	public String toString() {
		return "Real Time Remote Course: " + courseNum + "\nCredits: " + credits + "\nMaximum number of students: " + maxStud + "\nNumber of students: " + numStud + "\nZoom link: " + zoomLink;
	}
}
