
import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter two maximum numbers to be multiplied together between 1 and 20: ");
		int num1  = input.nextInt();
		int num2 = input.nextInt();
		while (num1 < 1 || num1 > 20 || num2 < 1 || num2 > 20) {
			System.out.println("Please enter numbers between the range of 1 and 20: ");
			num1  = input.nextInt();
			num2 = input.nextInt();
		}
		System.out.println("Enter the requested spacing between numbers:");
		int spacing = input.nextInt();
		
		int length = (spacing*10)+11;
		
		for (int k = 0; k < 10; k++) {
			doLine(length);
			System.out.print("|");
			for (int l = 0; l < 10; l++) {
				centerAlign(spacing, k, l);
			}
			System.out.println();
		}
		doLine(length);
	}
	
	public static void centerAlign(int space, int k, int l) {
		String value = Integer.toString((k+1)*(l+1));
		space = space - value.length();
		
		for (int i = 0; i < (space/2+(space%2)); i++) {
			System.out.print(" ");
		}
		System.out.print((k+1)*(l+1));
		for (int i = 0; i < ((space/2)); i++) {
			System.out.print(" ");
		}
		System.out.print("|");
			
		}
	
	public static void doLine(int num) {
		for (int i = 0; i < num; i++) {
			System.out.print("-");
		}
		System.out.println();
	}

}
