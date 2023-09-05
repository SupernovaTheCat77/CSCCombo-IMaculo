
/********************************************************************************************************
 *  This is a practice program, it plays around with the function of Strings and other things in Java.  *
 *  Written by: Izzy Maculo                                                                             *
 *  Date: 9/5/23                                                                                        *
 *******************************************************************************************************/

import java.util.Scanner;

public class StringFun {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String answer;
		
		String day = "Tuesday";
		String month = "September";
		int date = 5;
		int year = 2023;
		
		System.out.println(day + ", " + month + " " + date + ", " + year);
		
		/*
		Different way of Line 16: 
		
		System.out.print(day + ", ");
		System.out.print(month + " ");
		System.out.print(date + ", ");
		System.out.print(year);
		*/
		
		System.out.println("\"Friends\"");   //How to print quotation marks
		
		System.out.print(day + " ");
		System.out.print(date + ", ");
		System.out.print(month + " ");
		System.out.println(year);
		
		System.out.println("The day of the week is " + day + ", the numerical date of the day is " + date + ", the month is " + month + ", and the year is " + year + ".");
		
		System.out.println("Do you know how to get input?");
		answer = input.nextLine();
		
		System.out.println(answer + "!");
		
	}

}
