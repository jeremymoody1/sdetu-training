package basics;

public class factorials1 {

	public static void main(String[] args) {
		
		System.out.println(giveFactorial(8));
	}
	
	public static int giveFactorial(int n){
		
		if(n == 0) {
			return 1;
		}
		return(n * giveFactorial(n-1));
		
	}

}
