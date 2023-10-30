import java.util.Scanner;

public class FirstTwo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Input string for firstTwo: ");
		String str = input.next();
		System.out.println(firstTwo(str));
		
		System.out.print("Input string for bobThere: ");
		str = input.next();
		System.out.println(bobThere(str));
		
		int[] nums = new int[3];
		for (int i = 0; i < nums.length; i++) {
			System.out.print("Input value #" + i+1 + " for maxEnd3: ");
			nums[i] = input.nextInt();
		}
		int[] newNums = maxEnd3(nums);
		for (int i = 0; i < newNums.length; i++) {
			System.out.print(newNums[i] + " ");
		}
		
	}
	
	public static String firstTwo(String str) {
		  return str.length() > 1? str.substring(0, 2): str;
		}
	
	public static boolean bobThere(String str) {
		  for (int i = 0; i < str.length()-2; i++) {
		    if (str.substring(i, i+1).equals("b") && str.substring(i+2, i+3).equals("b")) return true;
		  }
		  return false;
		}
	
	public static int[] maxEnd3(int[] nums) {
		  return (nums[0] > nums[2])? new int[] {nums[0], nums[0], nums[0]}: new int[] {nums[2], nums[2], nums[2]};
		}

}
