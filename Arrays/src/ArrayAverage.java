
// ArrayAverage: Compute the average value of an array of integers except the largest and smallest values.

import java.util.Scanner;

public class ArrayAverage {

	public static void main(String[] args) {
		int[] nums = getArray();
		double average = getAverage(nums);
		System.out.println("The average value in the array (discounting the maximum and minimum values) is " + average + ".");
	}
	
	public static double getAverage(int[] nums) {
		double sum = 0;
		int min = 0;
		int max = 0;
		
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
			if (i == 0) {
				min = nums[i];
				max = nums[i];
			}
			if (nums[i] > max) max = nums[i];
			if (nums[i] < min) min = nums[i];
		}
		sum -= (max + min);
		double average = sum / (nums.length-2);
		return average;
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
