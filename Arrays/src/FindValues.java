// FindValue: Call a method to which you will pass an array and an integer value. The method will return true if the value exists in the array, false otherwise.

import java.util.Scanner;

public class FindValues {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("How many numbers in the array?: ");
		int numsLength = input.nextInt();
		int[]nums = new int[numsLength];
		
		for (int i = 0; i < numsLength; i++) {
			System.out.print("What is number #" + (i+1) + "?: ");
			nums[i] = input.nextInt();
		}
		System.out.print("What number are you wondering is in the array?: ");
		int num = input.nextInt();
		
		if (findValue(nums, num) == true) System.out.println("The given number can be found within the given array.");
		else System.out.println("The given number cannot be found within the given array.");
		
	}
	
	public static boolean findValue(int[] nums, int num) {
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == num) return true;
		}
		return false;
	}
}
