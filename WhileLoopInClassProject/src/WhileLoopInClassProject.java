
/**************************************************************************************************************************************************
 *  This is a practice program for While Loops. I finished early, so I started adding as much other little interesting bits as I could think of.  *
 *  Written by: Izzy Maculo                                                                                                                       *
 *  Date: 9/13/23                                                                                                                                 *
 *************************************************************************************************************************************************/

import java.util.Scanner;

public class WhileLoopInClassProject {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int evenOdd;
		int setCount = 0;
		double average;
		String another = "Y";
		
		while (another.equals("Y")) {
			int num = 1;
			int evenCount = 0;
			int oddCount = 0;
			double total = 0;
			
			while (num != 0) {
				System.out.print("Input number, or 0 to exit this set: ");
				num = input.nextInt();
				evenOdd = num % 2;
				total = total + num;
				
				if (num != 0) {
					if (evenOdd == 0) {
						System.out.println("The number " + num + " is even.");
						evenCount ++;
					}
					else {
						System.out.println("The number " + num + " is odd.");
						oddCount ++;
					}
				}
			}
			setCount ++;
			average = total / (oddCount + evenCount);
			System.out.printf((oddCount + evenCount) + " numbers were checked. " + evenCount + " were even and " + oddCount + " were odd. The sum of all numbers is " + total + " and the rough average of numbers entered is %.4f", average);
			System.out.print(".\nAnother set of numbers? (Y/N): ");
			another = input.next();
			another = another.toUpperCase();
		}
		System.out.println("Thank you for using this program. You inputted " + setCount + " sets of numbers.");
	}
}
