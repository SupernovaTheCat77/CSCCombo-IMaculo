
public class ExceptionHandling {

	public static void main(String[] args) {
		int[] nums = {1, 2, 3};
		
		try {
			//System.out.println(nums[4]);
			//int myNum = Integer.parseInt("s45");
			setIndexTen(nums);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			nums = new int[] {1, 2, 3, 4};
			System.out.println(nums[3]);
			//System.out.println("You called something that was out of bounds.\nDid you really think that was going to work?");
			//e.printStackTrace();
			//System.out.println(e.getMessage());
		}
		catch (NumberFormatException e) {
			System.out.println("Letters aren't numbers. It broke.");
		}
		finally {
			System.out.println("Carry on!");
		}
		System.out.println("Outside of the exception!");
	}
	
	public static void setIndexTen(int[] arr) {
		if (arr.length < 11) {
			throw new ArrayIndexOutOfBoundsException("That array is too small for ten locations.");
		}
		arr[10] = 5;
	}

}
