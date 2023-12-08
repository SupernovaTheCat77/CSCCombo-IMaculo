
public class Practice {

	public static void main(String[] args) {
		int[][] arrMan = {
				{0, 1, 2, 3},
				{4, 5, 6, 7},
				{8, 9, 10, 11}
		};
		
		char[][] arr = new char[3][4];
		char letter = 'a';
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				arr[row][col] = letter;
				letter++;
			}
		}
		
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				System.out.printf("%-3s", (char)arr[row][col]);
			}
			System.out.println();
		}
	}
}
