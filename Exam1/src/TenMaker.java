
/******************************************************************
 *  This program is the answer to the third question of Exam 1.   *
 *  Written by: Izzy Maculo                                       *
 *  Date: 9/29/23                                                 *
 *****************************************************************/

import java.util.Scanner;

public class TenMaker {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter two numbers and this program will tell you if they add to make ten:");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		
		if (makes10(num1, num2) == true) {
			System.out.println("The two numbers given, " + num1 + " and " + num2 + ", add up to make ten.");
		}
		else {
			System.out.println("The two numbers given, " + num1 + " and " + num2 + ", do not add up to make ten.");
		}
		
	}
	
	public static boolean makes10(int num1, int num2) {
		return (num1 + num2 == 10)? true: false;
	}
	
}
