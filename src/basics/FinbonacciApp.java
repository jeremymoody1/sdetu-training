package basics;

public class FinbonacciApp {

	public static void main(String[] args) {
		// Fibonacci sequence is defined by the sum of the two previous fibonacci numbers.
		System.out.print(fib(10));
	}
	
	public static int fib(int n) {
		if(n==0) {
			return 0;
		}
		else if (n==1) {
			return 1;
		}
		return(fib(n-1) + fib(n-2));
	}
}
