package files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Write {

	public static void main(String[] args) throws IOException {

		// 1. Define file path we want to write.
		
		String filename = "C:\\files\\FileToWrite.txt";
		String message = "I'm writing data to be placed in a file111!";
		
		// 2. Create file in Java.
		
		File file = new File(filename);
		
		
		try {
			// 3. Open the file.
			
			FileWriter fw = new FileWriter(file);
			
			// 4. Write to the file.
			
			fw.write(message);
				
			// 5. Close resources.
			fw.close();
		} catch (IOException e) {
			System.out.println("ERROR: Could not write file: " + filename);
			e.printStackTrace();
		} finally {
			System.out.println("Closing the FileWriter");
		}
	}

}
