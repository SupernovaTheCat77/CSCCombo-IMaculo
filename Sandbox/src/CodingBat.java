
public class CodingBat {

	public static void main(String[] args) {
		int[] nums = {0,5,0,3};
		nums = zeroMax(nums);
		for (int num : nums) {
			System.out.println(num);
		}
		
		
		
	}
	
	public static int[] zeroMax(int[] nums) {
		  int biggest = 0;
		  for (int i = 0; i < nums.length; i++) {
		    if (nums[i] == 0) {
		      for (int j = i; j < nums.length; j++) {
		        if (((nums[j]%2) == 1) && (nums[j] > biggest)) {
		          biggest = nums[j];
		        }
		        nums[i] = biggest;
		      }
		    }
		  }
		  return nums;
		}

}
