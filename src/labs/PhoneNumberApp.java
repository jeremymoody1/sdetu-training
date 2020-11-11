package labs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PhoneNumberApp {

	public static void main(String[] args) {
		// This will read a text file and will retrieve a phone number.
		
		// 1. Define the file path.
		String filename = "C:\\files\\PhoneNumber.txt";
		
		// 2. Create the file in Java.
		File file = new File(filename);
		String phoneNum = null;
		String[] phoneNums = new String[9];
		
		try {
			// 3. Open the file.
			BufferedReader br = new BufferedReader(new FileReader(file));
			
			for (int i = 0; i < phoneNums.length; i++) {
				
					// 4. Read the file.
					phoneNums[i] = br.readLine();
				}

					// 5. Close the resources.
					br.close();
				} catch (FileNotFoundException e) {
					System.out.println("ERROR: File not found: " + filename);
					e.printStackTrace();
				} 
				  catch (IOException e) {
					System.out.println("ERROR: Could not read the data in: " + filename);
				} 
			
		for(int i = 0; i < phoneNums.length; i++) {
			phoneNum = phoneNums[i];
		
			try {
				
				//PhoneNum must be 10 digits long.
				if(phoneNum.length() != 10) {
					throw new TenDigitsException(phoneNum);
				}
				
				//Area code cannot start with 0 or 9.
				if(phoneNum.startsWith("0") || phoneNum.startsWith("9")) {
					throw new AreaCodeException(phoneNum);
				}
				
				//There can be no "911" in the number.
				if(phoneNum.contains("911")) {
					throw new EmergencyException(phoneNum);
				}
				
				System.out.println(phoneNum);
				}
			
			catch (TenDigitsException e) {
				System.out.println("ERROR: Phone number is not ten digits!");
				System.out.println(e.toString());
				}
			catch (AreaCodeException e) {
					System.out.println("ERROR: Area code cannot begin with '0' or '9'!");
					System.out.println(e.toString());
				}
			catch (EmergencyException e) {
				System.out.println("ERROR: Number cannot contain '911'!");
				System.out.println(e.toString());
			}
			catch(NullPointerException e) {
				System.out.println("ERROR: Phone number is 'null'!");
				System.out.println(e.toString());
			}
		}
	}
}

@SuppressWarnings("serial")
class TenDigitsException extends Exception {
	String num;
	TenDigitsException(String num){
		this.num = num;
	}
	public String toString() {
		return ("TenDigitsException: " + num);
	}
	
}

@SuppressWarnings("serial")
class AreaCodeException extends Exception {
	String num;
	AreaCodeException(String num){
		this.num = num;
	}
	public String toString() {
		return ("AreaCodeException: " + num);
	}
	
}

@SuppressWarnings("serial")
class EmergencyException extends Exception {
	String num;
	EmergencyException(String num){
		this.num = num;
	}
	public String toString() {
		return ("EmergencyException: " + num);
	}
	
}