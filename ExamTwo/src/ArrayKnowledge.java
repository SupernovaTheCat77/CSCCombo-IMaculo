
public class ArrayKnowledge {

	public static void main(String[] args) {
		char[] characters = {'x', 'x'};
		System.out.println(hasxx(characters));
		
		int start = -3;
		int end = 3;
		int[] nums = fromToArray(start, end);
		for (int i = 0; i < nums.length; i++) System.out.println(nums[i]);
	}
	
	public static boolean hasxx(char[] characters) {
		for (int i = 0; i < characters.length-1; i++) {
			if (characters[i] == 'x' && characters[i+1] == 'x') return true;
		}
		return false;
	}
	
	public static int[] fromToArray(int start, int end) {
		int[] nums = new int[end-start];
		for (int i = 0; i < end-start; i++) nums[i] = i+start;
		return nums;
	}
}
