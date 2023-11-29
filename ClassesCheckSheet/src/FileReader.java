import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileReader {
	private Scanner input;
	public FileReader() throws FileNotFoundException {
		File courseFile = new File("dbFile");
		input = new Scanner(courseFile);
		
		while (input.hasNextLine()) {
			String line = input.nextLine();
			System.out.println(line);
		}
	}

	public Course readFromFile() throws FileNotFoundException {
		if (input.hasNextLine()) {
			String line = input.nextLine();
			String[] tokens = line.split(",");
			
			if (tokens[0].equals("Course")) {
				Course course = new Course(tokens[1], Integer.parseInt(tokens[2]), Integer.parseInt(tokens[3]), Integer.parseInt(tokens[4]));
			}
			if (tokens[0].equals("Full Remote")) {
				Course course = new FullRemoteCourse(tokens[1], Integer.parseInt(tokens[2]), Integer.parseInt(tokens[3]), Integer.parseInt(tokens[4]), tokens[5]);
			}
			if (tokens[0].equals("In-Person")) {
				Course course = new InPersonCourse(tokens[1], Integer.parseInt(tokens[2]), Integer.parseInt(tokens[3]), Integer.parseInt(tokens[4]), Integer.parseInt(tokens[5]));
			}
			if (tokens[0].equals("Real-Time Remote")) {
				Course course = new InPersonCourse(tokens[1], Integer.parseInt(tokens[2]), Integer.parseInt(tokens[3]), Integer.parseInt(tokens[4]), Integer.parseInt(tokens[5]));
			}
		}
		else {
			return null;
		}
		return null;
	}
	
	public List<Course> readCoursesFromFile() throws FileNotFoundException {
		List<Course> courseList = new ArrayList<>();
		while (input.hasNextLine()) {
			courseList.add(readFromFile());
		}
		return courseList;
	}
}
