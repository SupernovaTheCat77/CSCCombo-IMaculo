
/******************************************************************
 *  This program is the answer to the fifth question of Exam 1.   *
 *  Written by: Izzy Maculo                                       *
 *  Date: 9/29/23                                                 *
 *****************************************************************/

import java.util.Scanner;

public class Accumulator {

	public static void main(String[] args) {
		int num = 1;
		int sum = 0;
		int count = 0;
		
		while (num != 0) {
			num = getNum();
			sum += num;
			if (num != 0) count++;
		}
		System.out.println("The total sum of all " + count + " numbers added is " + sum + ".");
	}
	
	public static int getNum() {
		Scanner input = new Scanner(System.in);
		System.out.print("What number is to be added?: ");
		return input.nextInt();
	}
}
