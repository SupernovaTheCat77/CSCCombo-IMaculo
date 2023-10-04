
// ArrayReverse: Call a method to which you will pass an array. The method will reverse the elements and return it.

import java.util.Scanner;

public class ArrayReverse {

	public static void main(String[] args) {
		int[]nums = getArray();
		int[]numsReversed = reverseArray(nums);
		outputArray(numsReversed);
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
	
	public static void outputArray(int[] array) {
		System.out.print("The array reversed is ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(" " + array[i]);
		}
	}
}
