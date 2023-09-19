
/******************************************************************************************************************************************************************************
 *  This is a program that was initially a team project to create a calculator program using methods. This version has been edited by Izzy for maximum coherence, function,   *
 *       and conciseness based on personal preference.                                                                                                                        *
 *  Written by: Izzy, Abian, Colin, and Kai                                                                                                                                   *
 *  Date: 9/19/23                                                                                                                                                             *
 *****************************************************************************************************************************************************************************/

import java.util.Scanner;

public class MethodTeamKaiEdited {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter two numbers:");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		
		int sum = doAddition(num1, num2);
		System.out.println(num1 + " and " + num2 + " added equals " + sum + ".");
		
		int difference = doSubtraction(num1, num2);
		System.out.println(num1 + " and " + num2 + " subtracted equals " + difference + ".");
		
		int multiple = doMultiplication(num1, num2);
		System.out.println(num1 + " and " + num2 + " multiplied equals " + multiple + ".");
		
		if (num2 != 0) {
			double dividend = doDivision(num1, num2);
			System.out.println(num1 + " and " + num2 + " divided equals " + dividend + ".");
		}
		else {
			System.out.println("Can't divide by zero.");
		}
		
//		System.out.println(Math.addExact(num1,num2));
//		System.out.println(Math.subtractExact(num1, num2));
//		System.out.println(Math.multiplyExact(num1, num2));
		
	}
	
	public static int doAddition(int num1, int num2) {
		int sum = num1 + num2;
		return sum;
	}
	public static int doSubtraction(int num1, int num2) {
		int difference = num1 - num2;
		return difference;
	}
	
	public static int doMultiplication(int num1, int num2) {
		int multiple = num1 * num2;
		return multiple;
	}

	public static double doDivision(int num1, int num2) {
		double dividend = num1 / (double) num2; //casting!
		return dividend;
	} 
	
}
