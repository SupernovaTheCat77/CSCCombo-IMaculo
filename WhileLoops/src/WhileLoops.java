
/*************************************************
 *  This is a practice program for While Loops.  *
 *  Written by: Izzy Maculo                      *
 *  Date: 9/12/23                                *
 ************************************************/

import java.util.Scanner;

public class WhileLoops {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		//Example 1:
		/*
		int i = 5;
		int num1 = 4;
		int num2 = 1;
		
		while (i > 0) {
			num2 = num2 * num1;
			System.out.println("i = " + i + ", next number = " + num2);
			i --;
		}
		System.out.println("The loop has completed.");
		*/
		
		//Example 3:
		/*
		int currPower = 2;
		String userChar = "Y";
		
		while (userChar.equals("Y")) {
			System.out.println("Current power of 2: " + currPower);
			currPower = currPower * 2;
			if (currPower <= 0) {
				System.out.println("Number is now too high to be calculated within 32 bits, thank you for your interest.");
				userChar = "N";
			}
			else {
				System.out.print("Next power? (Y/N): ");
				userChar = input.nextLine();
				userChar = userChar.toUpperCase();
			}
		}
		
		System.out.println("The loop has completed.");
		*/
		
		//Practice 1: (Ask for a name and age and ask again if age is negative)
		/*
		int age = -1;
		String name = "null";
		
		while (age < 0) {
			System.out.print("Input name: ");
			name = input.next();
			
			System.out.print("Input age: ");
			age = input.nextInt();
		}
		
		System.out.println("Hello there, " + name + ", you have told me that you are " + age + " years old.");
		*/
		
		//Practice 2: (3, 2, 1, blast off)
		/*
		int count = 3;
		while (count >= 0) {
			if (count != 0) {
				System.out.println(count);
			}
			else {
				System.out.println("Blast off!");
			}
			count --;
		}
		*/
		
		//Practice 3: (count to 100 by fives)
		/*
		int num = 0;
		
		while (num <= 100) {
			System.out.println(num);
			num+=5;
		}
		*/
	}
}
