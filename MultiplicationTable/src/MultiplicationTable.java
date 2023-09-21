
import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("This is a multiplication table program. Enter two maximum numbers to be ultimately multiplied together, within the range of 1 and 20: ");
		int num1  = input.nextInt();
		int num2 = input.nextInt();
		while (num1 < 1 || num1 > 20 || num2 < 1 || num2 > 20) {
			System.out.println("Please reenter two maximum numbers between the range of 1 and 20: ");
			num1  = input.nextInt();
			num2 = input.nextInt();
		}
		
		String numLength = Integer.toString(num1*num2);
		System.out.println("Enter the requested spacing between numbers (" + (numLength.length()+2) + " is recommended, and " + (numLength.length()) + " is the minimum): ");
		int spacing = input.nextInt();
		
		while ((numLength.length() > spacing) || (spacing > 10)) {
			if (numLength.length() > spacing) {
				System.out.println("Please enter a greater value for spacing:");
			}
			else {
				System.out.println("Don't be ridiculous, enter a smaller value for spacing:");
			}
			spacing = input.nextInt();
		}
		
		System.out.println();
		int length = (spacing*num2)+(num2 + 1);
		
		for (int k = 0; k < num1; k++) {
			doLine(length);
			System.out.print("|");
			
			for (int l = 0; l < num2; l++) {
				centerAlign(spacing, k, l);
			}
			
			System.out.println();
		}
		
		doLine(length);
		System.out.println("\nThank you for using this program by Izzy Maculo.");
	}
	
	public static void centerAlign(int space, int k, int l) {
		String value = Integer.toString((k+1)*(l+1));
		space = space - value.length();
		
		for (int i = 0; i < (space/2+(space%2)); i++) {
			System.out.print(" ");
		}
		
		System.out.print(value);
		
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
