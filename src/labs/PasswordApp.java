package labs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PasswordApp {

	public static void main(String[] args) {

		// 1. Define the file path.
		String filename = "c:\\files\\PasswordFile.txt";
		String password = null;
		String[] passwords = new String[13];
		boolean hasNumber = false;
		boolean hasLetter = false;
		boolean hasSpecial = false;
		
		// 2. Create the file in Java.
		File file = new File(filename);
		
		
		try {
		// 3. Open the file.
		BufferedReader br = new BufferedReader(new FileReader(file));
		
		// 4. Read the file.
			for (int i = 0; i < passwords.length; i++) {
				passwords[i] = br.readLine();

			}
		// 5. Close resources.
			br.close();
		}
			
		catch (FileNotFoundException e) {
			System.out.println("ERROR: File not found: " + filename);
			e.printStackTrace();
		}
		catch (IOException e) {
			System.out.println("ERROR: IOEXCEPTION: " + filename);
			e.printStackTrace();
		}
		
		for(int i = 0; i < passwords.length; i++) {
			password = passwords[i];
			char[] passChar = password.toCharArray();
			
				for(int j = 0; j < password.length(); j++) {
					
					char charUpper = Character.toUpperCase(passChar[j]);
					
					if( (int) charUpper >= 48 && (int) charUpper <= 57) {
						hasNumber = true;
					}
					
					else if( (int) charUpper >= 65 && (int) charUpper <= 90) {
						hasLetter = true;
					}
					
					else {
						hasSpecial = true;
					}
				}
			try {
				
			if (!hasNumber) {
				throw new NumberException(password);
				
				}
			else if (!hasLetter) {
				throw new LetterException(password);
				
				}
			else if (!hasSpecial) {
				throw new SpecialException(password);
			
				}
			if (hasNumber && hasLetter && hasSpecial) {
				hasNumber = false;
				hasLetter = false;
				hasSpecial = false;
				}
				}
			catch (NumberException e){
				System.out.println("ERROR: Password did not include a number!");
				System.out.println(e.toString());
			}
			catch (LetterException e){
				System.out.println("ERROR: Password did not include a letter!");
				System.out.println(e.toString());
			}
			catch (SpecialException e){
				System.out.println("ERROR: Password did not include a special char!");
				System.out.println(e.toString());
			}
				
		}
		
	}

}

@SuppressWarnings("serial")
class NumberException extends Exception{
	String pw;
	NumberException(String pw){
		this.pw = pw;
	}	
	public String toString() {
		return ("NumberException: " + pw);
	}
}


@SuppressWarnings("serial")
class LetterException extends Exception{
	String pw;
	LetterException(String pw){
		this.pw = pw;
	}
	public String toString() {
		return ("LetterException: " + pw);
	}

}


@SuppressWarnings("serial")
class SpecialException extends Exception{
	String pw;
	SpecialException(String pw){
		this.pw = pw;
	}
	public String toString() {
		return ("SpecialException: " + pw);
	}
}











