package basics;

import java.util.Arrays;

public class arraytest1 {

	public static void main(String[] args) {
		int[] testArray = { 7, 11, 14, 2, 3, 19, 121};
		
		System.out.println(min(testArray));
		System.out.println(max(testArray));
		System.out.println(avg(testArray));
		
	}
	
	public static int min(int[] nums) {
		Arrays.sort(nums);
		return (nums[0]);
	}
	
	public static int max(int[] nums) {
		Arrays.sort(nums);
		return(nums[nums.length - 1]);
	}

	public static int avg(int[] nums) {
		int total = 0;
		for(int i = 0; i < nums.length; i++) {
			total = total + nums[i];
		}
		
		return total / nums.length;
	
	}

}
