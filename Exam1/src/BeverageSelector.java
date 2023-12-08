
/*******************************************************************
 *  This program is the answer to the second question of Exam 1.   *
 *  Written by: Izzy Maculo                                        *
 *  Date: 9/29/23                                                  *
 ******************************************************************/

import java.util.Scanner;

public class BeverageSelector {

	public static void main(String[] args) {
		int drink = 0;
		while (drink < 1 || drink > 3) {
			drink = getDrink();
			if (drink < 1 || drink > 3) {
				System.out.println("That was not one of the options provided, please choose again.");
			}
		}
		returnDrink(drink);
	}
	
	public static int getDrink() {
		Scanner input = new Scanner(System.in);
		System.out.print("What drink would you like? (Water = 1, Coke = 2, Coffee = 3): ");
		return input.nextInt();
	}
	public static void returnDrink(int drink) {
		if (drink == 1) {
			System.out.println("You chose to drink water.");
		}
		else if (drink == 2) {
			System.out.println("You chose to drink Coke.");
		}
		else {
			System.out.println("You chose to drink coffee.");
		}
	}
}
