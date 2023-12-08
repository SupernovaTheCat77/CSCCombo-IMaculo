import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FileWriter {
	private String dbFile = "CoursesDatabase.csv";
	PrintWriter printer;
	
	public FileWriter() throws FileNotFoundException {
		File courseFile = new File(dbFile);
		printer = new PrintWriter(courseFile);
	}
	
	public void writeToFile(Course course) {
		printer.print("Course type" + "," + "Course" + "," + "Credits" + "," + "Max students" + "," + "Number of students");
		if (course instanceof FullRemoteCourse == true) printer.println("," + "Email");
		else if (course instanceof InPersonCourse == true) printer.println("," + "Room number");
		else if (course instanceof RealTimeRemoteCourse == true) printer.println("," + "Zoom link");
		printer.println(course.dbString());
	}
	
	public void close() {
		printer.close();
	}

}
