
/********************************************************************************************************
 *  This is a practice program, it plays around with the function of Strings and other things in Java.  *
 *  Written by: Izzy Maculo                                                                             *
 *  Date: 9/5/23                                                                                        *
 *******************************************************************************************************/

import java.util.Scanner;

public class StringFun {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String word = "Hello";
		String around = "<<>>";
		
		System.out.println(around.substring(0, around.length()/2) + word + around.substring((around.length()/2), around.length()));
		System.out.println(around.charAt(4));
		
	

		
//		String answer;
//		
//		String day = "Tuesday";
//		String month = "September";
//		int date = 5;
//		int year = 2023;
//		
//		System.around.println(day + ", " + month + " " + date + ", " + year);
//		
//		/*
//		Different way of Line 16: 
//		
//		System.around.print(day + ", ");
//		System.around.print(month + " ");
//		System.around.print(date + ", ");
//		System.around.print(year);
//		*/
//		
//		System.around.println("\"Friends\"");   //How to print quotation marks
//		
//		System.around.print(day + " ");
//		System.around.print(date + ", ");
//		System.around.print(month + " ");
//		System.around.println(year);
//		
//		System.around.println("The day of the week is " + day + ", the numerical date of the day is " + date + ", the month is " + month + ", and the year is " + year + ".");
//		
//		System.around.println("Do you know how to get input?");
//		answer = input.nextLine();
//		
//		System.around.println(answer + "!");
		
	}

}
