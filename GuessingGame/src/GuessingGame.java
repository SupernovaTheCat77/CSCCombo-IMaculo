/********************************************************************************
 *  This is a guessing game for numbers between 0 and 100. I programmed ahead.  *
 *  Written by: Izzy Maculo                                                     *
 *  Date: 9/11/23                                                               *
 *******************************************************************************/

import java.util.Scanner;
import java.util.Random;

public class GuessingGame {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		
		int upperbound = 101;
		int trueUpperbound = upperbound - 1;
		int randInt = rand.nextInt(upperbound);
		int guess;
		int count = 1;
		int outCount = 0;
		int trueCount = 1;
		
		//System.out.println("Random number (debugging): " + randInt + "\n");
		
		System.out.print("Guess a random number between 0 and " + trueUpperbound + ": ");
		guess = input.nextInt();
		
		while (guess != randInt) {
			if (guess < 0 || guess > 100) {
				System.out.println("Please guess within the bounds of 0 and " + trueUpperbound + ".");
				count --;
				outCount ++;
			}
			else if (guess > randInt) {
				System.out.println("The number has a lower value.");
			}
			else if (guess < randInt) {
				System.out.println("The number has a higher value.");
			}
			System.out.print("\nGuess again: ");
			guess = input.nextInt();
			
			count ++;
		}
		
		trueCount = count + outCount;
		
		if (count == 1 && outCount == 0) {
			System.out.println("Good job, you got it on the first try! The number was " + randInt + ".");
		}
		else if (count == 1 && outCount > 0) {
			System.out.println("Huh, you got it first try after guessing out of bounds " + outCount + " time(s). Good job! The number was " + randInt + ".");
		}
		else {
			System.out.println("Correct! The number was " + randInt + " and " + trueCount + " guesses were made, " + count + " of which were in-bounds.");
		}
		
		//System.out.println("\nRandom number (debugging): " + randInt);
		
	}
}
