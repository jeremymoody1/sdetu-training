package DataStructures;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import java.util.List;

public class ReadCSV {

	public static void main(String[] args) {
		// This method will read data from a CSV file.
		List<String[]> data = new ArrayList<>();
		String filename = "C:\\Users\\jerem\\Desktop\\Java Software Developer Course\\accounts.csv";
		String dataRow;

		try {
			// Open the file
			BufferedReader br = new BufferedReader(new FileReader(filename));
		
		
		// Read the data as long as it's not empty
		while((dataRow = br.readLine()) != null){
			// Parse the data with comma as the delimiter.
			String[] line = dataRow.split(",");
			// Add the data to the collection.
			data.add(line);
		}
		br.close();
		
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		// Iterate over String Array ArrayList to get each String Array
		for(String[] account : data) {
			System.out.print("[ ");
			
			// Iterate over each String Array to get Strings
			for(String field : account) {
				System.out.print(field + " ");
			}
			System.out.println(" ]");
		}

	}

}
