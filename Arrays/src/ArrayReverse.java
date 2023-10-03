
// ArrayReverse: Call a method to which you will pass an array. The method will reverse the elements and return it.
//3. FindCommon: Call a method that takes two arrays as arguments and finds the common elements between them and returns them in a third array. Print the array to the screen using Arrays.toString()
//4. FindEvenOdd: Find the number of even and odd integers in an array of integers.
//5. ArrayAverage: Compute the average value of an array of integers except the largest and smallest values.

import java.util.Scanner;

public class ArrayReverse {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("How many numbers in the array?: ");
		int numsLength = input.nextInt();
		int[]nums = new int[numsLength];
		
		for (int i = 0; i < numsLength; i++) {
			System.out.print("What is number #" + (i+1) + "?: ");
			nums[i] = input.nextInt();
		}
		
		int[]numsReversed = reverseArray(nums);
		
		System.out.print("The array reversed is ");
		
		for (int i = 0; i < nums.length; i++) {
			System.out.print(" " + numsReversed[i]);
		}
	}
	
	public static int[] reverseArray(int[] nums) {
		int[]numsReversed = new int[nums.length];
		int count = 0;
		for (int i = nums.length-1; i >= 0; i--) {
			numsReversed[count] = nums[i];
			count++;
		}
		return numsReversed;
	}
}
