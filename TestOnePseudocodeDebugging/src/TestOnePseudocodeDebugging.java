/**************************************************************************************************
 *  This is a practice program, it reads Fahrenheit temperatures and outputs Celsius and Kelvin.  *
 *  Written by: Izzy Maculo                                                                       *
 *  Date: 9/8/23                                                                                  *
 *************************************************************************************************/

import java.util.Scanner;

public class TestOnePseudocodeDebugging {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String another = "y";
		int operation;
		double num1;
		double num2;
		double ans;

		while (another == "y" || another == "Y") {
			System.out.println("What operator would you like to use? (1: +, 2: -, 3: *, 4: /): ");
			operation = input.nextInt();
			System.out.println("First number?: ");
			num1 = input.nextDouble();
			System.out.println("Second number?: ");
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
			
			System.out.println("The answer is " + ans + ". Another operation (Y/N)?: ");
			another = input.next();
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
