
import java.util.Scanner;

public class ArraysPractice {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("How many words to put in the array?: ");
		int numStrings = input.nextInt();
		
		String[]strings = new String[numStrings];
		
		for (int i = 0; i < numStrings; i++) {
			System.out.print("What is word #" + (i+1) + "?: ");
			strings[i] = input.next();
		}
		
		for (int j = 0; j < numStrings; j++) {
			System.out.print(strings[j] + " ");
		}
		
		int[]strLengths = new int[numStrings];
		
		for (int k = 0; k < numStrings; k++) {
			strLengths[k] = strings[k].length();
		}
		
		System.out.println();
		
		for (int l = 0; l < numStrings; l++) {
			System.out.print(strLengths[l] + " ");
		}
		
	}

	public static boolean binarySearch(int[] commonFull, int i) {
		// TODO Auto-generated method stub
		return false;
	}

}
