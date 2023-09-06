
/******************************************************************************************************
 *  This is a practice program, it plays around with the function of Input and other things in Java.  *
 *  Written by: Izzy Maculo                                                                           *
 *  Date: 9/6/23                                                                                      *
 *****************************************************************************************************/

import java.util.Scanner;

public class InputCheckSheet {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String word;
		int intNum;
		float realNum;
		double biggerRealNum;
		char letter;
		
		//String:
		System.out.print("Enter one word: ");
		word = input.nextLine();
		
		//Integer:
		System.out.print("Enter an integer number: ");
		intNum = input.nextInt();
		
		//Float:
		System.out.print("Enter a real number: ");
		realNum = input.nextFloat();
		
		//Float using printf:
		//realNum = 987654321.987654321f;
		//realNum = realNum + realNum;
		//System.out.printf("$%.2f", realNum);
		//System.out.printf("\n$%.9f", realNum + "\n");
		
		//Double:
		System.out.print("Enter a larger real number: ");
		biggerRealNum = input.nextDouble();
		
		//Double using printf:
		//System.out.printf("$%.2f", biggerRealNum);
		//biggerRealNum = 987654321.987654321f;
		//biggerRealNum = biggerRealNum + biggerRealNum;
		//System.out.printf("\n$%.2f", biggerRealNum);
		//System.out.printf("\n$%.9f", biggerRealNum + "\n");
		
		//Character:
		System.out.print("Enter a single character: ");
		letter = input.next().charAt(0);
		
		//Summary:
		System.out.println("\nWord: " + word.toUpperCase() + "\nInteger: " + intNum + "\nReal Number: " + realNum + "\nBigger Real Number (Double): " + biggerRealNum + "\nCharacter: " + letter);
		
	}

}
