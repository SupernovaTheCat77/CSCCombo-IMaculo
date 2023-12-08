
import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("What decimal number to be converted to binary (inclusive range = 0-255)?: ");
		int n = input.nextInt();
		while (n > 255 || n < 0) {
			System.out.print("Please ensure the number is within the inclusive range of 0-255: ");
			n = input.nextInt();
		}
		int[] binary = new int[8];
		convertDecimal(n);
	}
	
	private static void convertDecimal(int n) {
		if (n == 0) return;
		convertDecimal(n/2);
		System.out.print(n%2);
	}

}
