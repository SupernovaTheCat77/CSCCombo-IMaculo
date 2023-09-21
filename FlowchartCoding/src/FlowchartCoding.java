//Testing GitHub and Eclipse, test again

/************************************************************************************************************
 *  This is a practice program, it runs through Flowcharts 1 + 2 done in this class, but with real code.    *
 *  Written by: Izzy Maculo                                                                                 *
 *  Date: 9/8/23                                                                                            *
 ***********************************************************************************************************/

import java.util.Scanner;

public class FlowchartCoding {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
	
		int creds;
		float cost = 0;
		String activityFee;
		
		System.out.print("How many credits are you taking this semester?: ");
		creds = input.nextInt();
		
		if (creds > 12) {
			cost = cost + 250;
		}
		else {
			System.out.print("Do you want to purchase the activity fee for the recreation center? (Y/N): ");
			activityFee = input.next();
			activityFee = activityFee.toUpperCase();
			
			if (activityFee.equals("Y")) {
				cost = cost + 250;
			}
		}
		
		cost = cost + (creds * 580) + 650;
		System.out.printf("The total cost of this semester is " + "$%.2f", cost);
		
	}
}
