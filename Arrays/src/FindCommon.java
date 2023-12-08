
//FindCommon: Call a method that takes two arrays as arguments and finds the common elements between them and returns them in a third array. Print the array to the screen using Arrays.toString()

import java.util.Arrays;
import java.util.Scanner;

public class FindCommon {

	public static void main(String[] args) {
		int[] nums1 = getArray();
		int[] nums2 = getArray();
		
		int[] common = findCommon(nums1, nums2);
		outputArray(common);
	}
	
	public static int[] findCommon(int[] nums1, int[] nums2) {
		int[] smaller = Arrays.copyOf(nums1, nums1.length);
		int[] bigger = Arrays.copyOf(nums2, nums2.length);
		
		if (nums1.length > nums2.length) {
			bigger = Arrays.copyOf(nums1, nums1.length);
			smaller = Arrays.copyOf(nums2, nums2.length);
		}
		
		int[] commonFull = new int[smaller.length];
		int count = 0;
		for (int i = 0; i < nums1.length; i++) {
			for (int j = 0; j < nums2.length; j++) {
				if (nums1[i] == nums2[j] && Arrays.binarySearch(commonFull, nums1[i]) < -1) {
					commonFull[count] = nums1[i];
					count++;
					break;
				}
			}
		}
		int[] common = new int[count];
		for (int i = 0; i < count; i++) {
			common[i] = commonFull[i];
		}
		return common;
	}
	
	public static void outputArray(int[] array) {
		System.out.print("The common number(s) in the two arrays are/is: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
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
