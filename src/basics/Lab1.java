package basics;

public class Lab1 {

	public static void main(String[] args) {
		System.out.println(summation(10));

	}
	
	public static int summation(int n) {
		int sum = 0;
		for(int i = n; i > 0; i--) {
			sum = sum + i;
		}
		return sum;	
	}
}
