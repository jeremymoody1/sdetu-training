package basics;

public class Days {
	
	public static void main(String[] args) {
		String dayOfWeek = "T";
		switch (dayOfWeek) {
			case "Monday" :
				System.out.println("Today is Monday");
				break;
			case "Tuesday" :
				System.out.println("Today is Tuesay");
				break;
			case "Wednesday" :
				System.out.println("Today is Wednesday");
				break;
			case "Thursday" :
				System.out.println("Today is Thursday");
				break;
			case "Friday" :
				System.out.println("Today is Friday");
				break;
			case "Satday" :
				System.out.println("Today is Saturday");
				break;
			case "Sunday" :
				System.out.println("Today is Sunday");
				break;
			default : 
				System.out.println("Error, no match");
				break;
		}
	}

}
