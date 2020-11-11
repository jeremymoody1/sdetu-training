package basics;

public class recursion1 {

	public static void main(String[] args) {
		
		System.out.println(recursive(10));
	}
	public static int recursive(int n) {
		
		if(n == 0) {
			return 0;
		}
		else if(n == 1) {
			return 1;
		}
		return(recursive(n-2) + recursive(n-1));
	}

}
