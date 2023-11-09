import java.util.ArrayList;
import java.util.List;

public class CSclasses {

	public static void main(String[] args) {
		List<Course> courseList = new ArrayList<>();
		courseList.add(new InPersonCourse("PSY101", 12, 20, 214));
		courseList.add(new FullRemoteCourse("CSC101", 32, 54, "instructor@frontrange.cccs.edu"));
		courseList.add(new RealTimeRemoteCourse("ENG101", 24, 30, "https://zoom.123456789.com"));
		
		printCourses(courseList);
		printCourse(courseList.get(0));
		printCourse(courseList.get(1));
		printCourse(courseList.get(2));
		
	}
	
	public static void printCourses(List<Course> courseList) {
		for (int i = 0; i < courseList.size(); i++) {
			System.out.println(courseList.get(i).toString() + "\n");
		}
	}
	
	public static void printCourse(Course course) {
		System.out.println("Course: " + course.getCourseNum()
		+ "\nNumber of students: " + course.getNumStud()
		+ "\nMaximum number of students: " + course.getMaxStud());
		if (course instanceof InPersonCourse == true) System.out.println("Room number: " + ((InPersonCourse)course).getRoomNum() + "\n");
		if (course instanceof FullRemoteCourse == true) System.out.println("Instructor email: " + ((FullRemoteCourse)course).getEmail() + "\n");
		if (course instanceof RealTimeRemoteCourse == true) System.out.println("Zoom link: " + ((RealTimeRemoteCourse)course).getZoomLink() + "\n");
	}
}
