package basics;

public class Strings {

	public static void main(String[] args) {
		String bookTitle;
		bookTitle = "The Lord of the Rings";
		String wordChoice = "Ring";
		if (bookTitle.contains(wordChoice)) {
			System.out.println("The book contains the word: " + wordChoice);
		}

	}

}
