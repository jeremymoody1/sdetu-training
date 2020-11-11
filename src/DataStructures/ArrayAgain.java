package DataStructures;

public class ArrayAgain {

	public static void main(String[] args) {
		/*String[] alphabet = {"a", "b", "c", "d", "e", "f"};
		for (int i = 0; i < 6; i++) {
			System.out.print(alphabet[i] + " ");
		}
		
		for (int i = 0; i < alphabet.length; i++) {
			System.out.print(alphabet[i] + " ");
		}
		System.out.println("\n");
		
		
		// for-each style: 
		for (String letter : alphabet) {
			System.out.print(letter + " ");
		}*/
		
		String[][] users = {
					{"Johnny", "Williams", "jw@testemail.com", "252438798"},
					{"Jeremy", "Moody",    "jm@testemail.com", "987890889"},
					{"Sarah",  "Carroll",  "sc@testemail.com", "419927831"}
				};
		
		// Get size of 2D array.
		int numOfUsers = users.length;
		int numOfFields = users[0].length;
		
		
		
		// Traversing 2D array.
		// Really Old Way: 
		for (int i = 0; i < numOfUsers; i++) {				
				String firstName = users[i][0];
				String lastName = users[i][1];
				String email = users[i][2];
				String phone = users[i][3];
				
				System.out.println(firstName + " " + lastName  + " " + email + " " + phone);	
		}
		
		// Old way: 
		for (int i = 0; i < numOfUsers; i++) {
			for (int j = 0; j < numOfFields; j++) {
				System.out.println(users[i][j]);
			}
			
		}
		
		// Traversing with nested for-each loops: 
		System.out.println("\nUsing FOR EACH");
		
		
		for (String[] user : users) {
			System.out.print("[ ");
			for (String field : user) {
				System.out.print(field + " ");
			}	
			System.out.println(" ]");
		}
	}

}
