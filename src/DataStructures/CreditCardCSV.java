package DataStructures;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CreditCardCSV {

	public static void main(String[] args) {
		// Read a credit card CSV statement
		String fileName = "C:\\Users\\jerem\\Desktop\\Java Software Developer Course/data.csv";
		List <String[]> data = new ArrayList<>();
		String dataRow;
		double currentBalance = 0;
		
		try {
			FileReader fileReader = new FileReader(fileName);
			BufferedReader br = new BufferedReader(fileReader);
			
			while ((dataRow = br.readLine()) != null) {
				String[] line = dataRow.split(",");
				data.add(line);
			}
			br.close();
			
			
			
			
		} catch(IOException e) {
			e.printStackTrace();
		}

		
		
		for(String[] record : data) {
			
			
			for(String field : record) {
				
				if(field.compareToIgnoreCase("CREDIT") == 0) {
				
					currentBalance = currentBalance + Double.parseDouble(record[3]);
				}
				else if(field.compareToIgnoreCase("DEBIT") == 0) {
				
					currentBalance = currentBalance - Double.parseDouble(record[3]);
				}
			}
		}
		String formattedString = String.format("%.2f", currentBalance);
		currentBalance = Double.parseDouble(formattedString);
		
		if (currentBalance > 0) {
			
			System.out.printf("WARNING: You have received a ten (10) percent fee to your balance of: $ %.2f. Your new balance is: $%.2f", currentBalance, (currentBalance * 1.1));
			
			currentBalance = currentBalance * 1.1;
		}
		
		else if (currentBalance == 0) {
			System.out.println("Your balance is $0.00. Thank you for your payment.");
		}
		
		else if (currentBalance < 0) {
			System.out.printf("Your account is overpaid, thank you. Your current overpayment balance is $%.2f.", Math.abs(currentBalance));
		}
		
	}

}
