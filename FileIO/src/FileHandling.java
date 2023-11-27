import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class FileHandling {

	public static void main(String[] args) throws IOException {
		File myFile = new File("test.txt");
		
		if (!myFile.exists()) {
			if (myFile.createNewFile()) {
				System.out.println("File created successfully");
			}
		}
		else {
			System.out.println("File already exists in directory");
		}
		
		PrintWriter printer = new PrintWriter(new FileOutputStream(myFile.getName(), true));
		
		printer.println("First test with PrintWriter!");
		printer.println("Another line");
		printer.println("Another line except using\na different method!");
		printer.flush();
		printer.println("Just did a flush! :)");
		printer.flush();
	}
}
