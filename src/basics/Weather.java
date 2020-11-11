package basics;

public class Weather {
	public static void main(String[] args) {
		
		int temperature;
		
		
		temperature = 20;
		if (temperature > 80) {
			System.out.println("It's pleasant. Wear shorts and t-shirt");
		}
		else if (temperature > 60) {
			System.out.println("It's a little cooler, perhaps wear a long sleeved shirt and jeans.");
		}
		else {
			System.out.println("It's very cold, bundle up!");		
			}
	}
}
