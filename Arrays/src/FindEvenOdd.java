
// FindEvenOdd: Find the number of even and odd integers in an array of integers.

import java.util.Scanner;

public class FindEvenOdd {

	public static void main(String[] args) {
		int[] nums = getArray();
		int oddSum = countOdd(nums);
		int evenSum = countEven(nums);
		
		System.out.println("In the array given, " + evenSum + " of the numbers were even and " + oddSum + " of the numbers were odd.");
	}
	
	public static int countOdd(int[] nums) {
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 == 1) count++;
		}
		return count;
	}
	
	public static int countEven(int[] nums) {
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 == 0) count++;
		}
		return count;
	}
	
	public static int[] getArray() {
		Scanner input = new Scanner(System.in);
		
		System.out.print("How many numbers in the array?: ");
		int numsLength = input.nextInt();
		int[]nums = new int[numsLength];
		
		for (int i = 0; i < numsLength; i++) {
			System.out.print("What is number #" + (i+1) + "?: ");
			nums[i] = input.nextInt();
		}
		return nums;
	}
}
