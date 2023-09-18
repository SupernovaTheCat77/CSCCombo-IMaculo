/**************************************************************************************************
 *  This is a couple programs originally written in pseudocode for the first test in this class.  *
 *  Written by: Izzy Maculo                                                                       *
 *  Date: 9/18/23                                                                                 *
 *************************************************************************************************/

import java.util.Scanner;

public class TestOnePseudocodeDebugging {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String another = "Y";
		int operation;
		double num1;
		double num2;
		double ans;

		while (another.equals("Y")) {
			System.out.print("What operator would you like to use? (1: +, 2: -, 3: *, 4: /): ");
			operation = input.nextInt();
			System.out.print("First number?: ");
			num1 = input.nextDouble();
			System.out.print("Second number?: ");
			num2 = input.nextDouble();
			
			if (operation == 1) {
				ans = (num1 + num2);
			}
			else if (operation == 2) {
				ans = (num1 - num2);
			}
			else if (operation == 3) {
				ans = (num1 * num2);
			}
			else {
				ans = (num1 / num2);
			}
			
			System.out.print("The answer is " + ans + ". Another operation (Y/N)?: ");
			another = input.next();
			another = another.toUpperCase();
		}
		
		System.out.println("Thank you for using this calculator program.");

		
		
		/*
		int changer;
		int current = 0;

		System.out.println("What number do you want to count to 100 with?: "); 
		changer = input.nextInt();

		while (current <= 100) {
			System.out.println(current);
			current = current + changer;
			
		}
		if (current < 100) {
			System.out.println("100");
		}
		*/


	}

}
