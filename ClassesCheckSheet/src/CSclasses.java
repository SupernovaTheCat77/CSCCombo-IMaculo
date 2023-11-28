import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CSclasses {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner input = new Scanner(System.in);
		List<Course> courseList = new ArrayList<>();
		
//		String another = "y";
//		int courseType = 1;
//		String courseNum = "";
//		int credits = 0;
//		int maxStud = 0;
//		int numStud = 0;
//		int roomNum = 0;
//		String email = "";
//		String zoomLink = "";
//		
//		while (another.equals("y")) {
//			System.out.print("Course type (1 = In Person, 2 = Full Remote, 3 = Real-Time Remote)?: ");
//			courseType = input.nextInt();
//			while (courseType < 1 || courseType > 3) {
//				System.out.print("Please enter a valid course type (1 = In Person, 2 = Full Remote, 3 = Real-Time Remote): ");
//				courseType = input.nextInt();
//			}
//			
//			System.out.print("Course number?: ");
//			courseNum = input.next();
//			System.out.print("Credits?: ");
//			credits = input.nextInt();
//			System.out.print("Maximum number of students?: ");
//			maxStud = input.nextInt();
//			System.out.print("Number of students?: ");
//			numStud = input.nextInt();
//			
//			if (courseType == 1) {
//				System.out.print("Room number?: ");
//				roomNum = input.nextInt();
//				courseList.add(new InPersonCourse(courseNum, numStud, maxStud, roomNum, credits));
//					// Class input order: InPersonCourse(String courseNum, int numStud, int maxStud, int roomNum, int credits)
//			}
//			else if (courseType == 2) {
//				System.out.print("Instructor email?: ");
//				email = input.next();
//				courseList.add(new FullRemoteCourse(courseNum, numStud, maxStud, email, credits));
//					// Class input order: FullRemoteCourse(String courseNum, int numStud, int maxStud, String email, int credits)
//			}
//			else {
//				System.out.print("Zoom link?: ");
//				zoomLink = input.next();
//				courseList.add(new RealTimeRemoteCourse(courseNum, numStud, maxStud, zoomLink, credits));
//					// Class input order: RealTimeRemoteCourse(String courseNum, int numStud, int maxStud, String zoomLink, int credits)
//			}
//			
//			System.out.print("Another course? (Y/N): ");
//			another = input.next();
//			another = another.toLowerCase();
//			System.out.println();
//		}
//		System.out.println();
//		printCourses(courseList);
		
		courseList.add(new InPersonCourse("PSY101", 12, 20, 214, 3));
		courseList.add(new FullRemoteCourse("CSC101", 32, 54, "instructor@frontrange.cccs.edu", 5));
		courseList.add(new RealTimeRemoteCourse("ENG101", 24, 30, "https://zoom.123456789.com", 4));
		
		printCourses(courseList);
		
		FileWriter fileWriter = new FileWriter();
		for (Course course : courseList) fileWriter.writeToFile(course);
		fileWriter.close();
		
//		printCourse(courseList.get(0));
//		printCourse(courseList.get(1));
//		printCourse(courseList.get(2));
		
	}
	
	public static void printCourses(List<Course> courseList) {
		for (int i = 0; i < courseList.size(); i++) {
			System.out.println(courseList.get(i).toString() + "\n");
		}
	}
	
	public static void printCourse(Course course) {
			System.out.println("Course: " + course.getCourseNum()
			+ "\nCredits: " + course.getCredits()
			+ "\nMaximum number of students: " + course.getMaxStud()
			+ "\nNumber of students: " + course.getNumStud());
		if (course instanceof InPersonCourse == true) System.out.println("Room number: " + ((InPersonCourse)course).getRoomNum() + "\n");
		if (course instanceof FullRemoteCourse == true) System.out.println("Instructor email: " + ((FullRemoteCourse)course).getEmail() + "\n");
		if (course instanceof RealTimeRemoteCourse == true) System.out.println("Zoom link: " + ((RealTimeRemoteCourse)course).getZoomLink() + "\n");
	}
}
