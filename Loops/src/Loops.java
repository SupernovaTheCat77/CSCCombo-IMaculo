/*************************************************************************************************************************
 *  This is a practice program for loops. A while loop and a for loop do the same thing in a different yet similar way.  *
 *  Written by: Izzy Maculo                                                                                              *
 *  Date: 9/14/23                                                                                                        *
 ************************************************************************************************************************/

public class Loops {

	public static void main(String[] args) {
		int sum = 0;
		int i = 0;
		
		//While loop:
		while (i < 10) {
			sum += i+1;
			i ++;
			//System.out.println("Current number = " + (i+1) + "\nCurrent sum: " + sum);
		}
		System.out.println("(Using a while loop) The sum of numbers 1-10 = " + sum);
		
		sum = 0;
		
		//For loop:
		for(i = 0; i < 10; i++) {
			sum += i+1;
			//System.out.println("Current number = " + (i+1) + "\nCurrent sum: " + sum);
		}
		System.out.println("(Using a for loop) The sum of numbers 1-10 = " + sum);
	}
}
