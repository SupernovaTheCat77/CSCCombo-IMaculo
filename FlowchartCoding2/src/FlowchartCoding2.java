
/************************************************************************************************************
 *  This is a practice program, it runs through Flowcharts 3 + 4 done in this class, but with real code.    *
 *  Written by: Izzy Maculo                                                                                 *
 *  Date: 9/8/23                                                                                            *
 ***********************************************************************************************************/

import java.util.Scanner;

public class FlowchartCoding2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int carCode;
		int days;
		int miles;
		double milePrice;
		int dayPrice;
		double cost = 0;
		double totalCost = 0;
		String customer = "Y";
		
		while (customer.equals("Y")) {
			cost = 0;
			System.out.print("Which car is rented? (1 = Sports Car, 2 = Mid-Size, 3 = Economy): ");
			carCode = input.nextInt();
			System.out.print("How many days?: ");
			days = input.nextInt();
			System.out.print("How many miles?: ");
			miles = input.nextInt();
			
			if (carCode == 1) {
				dayPrice = 75;
				milePrice = 1.5;
			}
			else if (carCode == 2) {
				dayPrice = 45;
				milePrice = 0.85;
			}
			else {
				dayPrice =  35;
				milePrice = 0.45;
			}
			
			cost = (days * dayPrice) + (miles * milePrice);
			System.out.printf("Total cost is $%.2f", cost);
			
			System.out.print("\nAnother customer? (Y/N): ");
			customer = input.next();
			customer = customer.toUpperCase();
			totalCost = totalCost + cost;
		}
		System.out.printf("Total daily cost is $%.2f", totalCost);
	}
}
