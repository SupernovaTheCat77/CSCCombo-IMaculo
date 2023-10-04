
//FindCommon: Call a method that takes two arrays as arguments and finds the common elements between them and returns them in a third array. Print the array to the screen using Arrays.toString()
//4. FindEvenOdd: Find the number of even and odd integers in an array of integers.
//5. ArrayAverage: Compute the average value of an array of integers except the largest and smallest values.

import java.util.Arrays;

public class FindCommon {

	public static void main(String[] args) {
		int[] nums1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int[] nums2 = {9, 8, 5, 6, 7, 83, 54, 104, 53424, 9};
		
		int[] common = findCommon(nums1, nums2);
		outputArray(common);
	}
	
	public static int[] findCommon(int[] nums1, int[] nums2) {
		int[] commonFull = new int[nums1.length + nums2.length];
		int count = 0;
		for (int i = 0; i < nums1.length; i++) {
			for (int j = 0; j < nums2.length; j++) {
				System.out.println(Arrays.binarySearch(commonFull, nums1[i]));
				if (nums1[i] == nums2[j] && Arrays.binarySearch(commonFull, nums1[i]) > 0) {
					commonFull[count] = nums1[i];
					count++;
				}
			}
		}
//		int[] common = new int[count];
//		for (int i = 0; i < common.length; i++) {
//			common[i] = commonFull[i];
//		}
		return commonFull;
	}
	
	public static void outputArray(int[] array) {
		System.out.print("The common number(s) in the two arrays are/is:  ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(" " + array[i]);
		}
	}
}
