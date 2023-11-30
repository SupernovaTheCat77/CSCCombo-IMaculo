import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileReader {
	private Scanner input;
	private String dbFile = "CoursesDatabase.csv";
	public FileReader() throws FileNotFoundException {
		File courseFile = new File(dbFile);
		input = new Scanner(courseFile);
		
//		while (input.hasNextLine()) {
//			String line = input.nextLine();
//			System.out.println(line);
//		}
	}

	public Course readFromFile() throws FileNotFoundException {
		if (input.hasNextLine()) {
			String line = input.nextLine();
			String[] tokens = line.split(",");
			Course course = new Course("", 0, 0, 0);
			
			if (tokens[0].equals("Course")) {
				course = new Course(tokens[1], Integer.parseInt(tokens[2]), Integer.parseInt(tokens[3]), Integer.parseInt(tokens[4]));
			}
			if (tokens[0].equals("Full Remote")) {
				course = new FullRemoteCourse(tokens[1], Integer.parseInt(tokens[2]), Integer.parseInt(tokens[3]), Integer.parseInt(tokens[4]), tokens[5]);
			}
			if (tokens[0].equals("In-Person")) {
				course = new InPersonCourse(tokens[1], Integer.parseInt(tokens[2]), Integer.parseInt(tokens[3]), Integer.parseInt(tokens[4]), Integer.parseInt(tokens[5]));
			}
			if (tokens[0].equals("Real-Time Remote")) {
				course = new RealTimeRemoteCourse(tokens[1], Integer.parseInt(tokens[2]), Integer.parseInt(tokens[3]), Integer.parseInt(tokens[4]), tokens[5]);
			}
			return course;
		}
		else {
			return null;
		}
	}
	
	public List<Course> readCoursesFromFile() throws FileNotFoundException {
		List<Course> courses = new ArrayList<>();
		while (input.hasNextLine()) {
			courses.add(readFromFile());
		}
		courses = FileReader.sortCourses(courses);
		return courses;
	}
	
	private static List<Course> sortCourses(List<Course> courses) {
		List<Course> sortedCourses = new ArrayList<>();
		for (int i = 0; i < courses.size(); i++) {
			if (((courses.get(i)).getCredits()) > 0) sortedCourses.add(courses.get(i));
		}
		return sortedCourses;
	}
}
