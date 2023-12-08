

import java.util.Scanner;

public class MethodsExercises {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
//		System.out.println("Input three numbers:");
//		int num1 = input.nextInt();
//		int num2 = input.nextInt();
//		int num3 = input.nextInt();
//		System.out.println("The smallest number given is: " + findSmallest(num1, num2, num3));
//		System.out.println("The average of the numbers given is: " + findAverage(num1, num2, num3));
//		System.out.println("Input a string:");
//		String str = input.next();
//		System.out.println("The middle character(s) of the given string is/are: " + findMiddle(str));
//		System.out.println("The number of vowels in the given string is/are: " + findVowelNum(str));
//		System.out.println("Input a sentence-long string:");
//		String strLong = input.nextLine();
//		System.out.println("The number of words in the given string is/are: " + findWordNum(strLong));
//		System.out.println("Input a number:");
//		String strNum = input.next();
//		System.out.println("The sum of the digits in the number is: " + findDigitSum(strNum));
		doPentagonal();
	}
	
	public static int findSmallest(int num1, int num2, int num3) {
		if ((num1 < num2) && (num1 < num3)) {
			return num1;
		}
		else if (num2 < num3) {
			return num2;
		}
		else {
			return num3;
		}
		
	}
	
	public static double findAverage(int num1, int num2, int num3) {
		return ((num1 + num2 + num3) / 3);
	}
	
	public static String findMiddle(String str) {
		if (str.length() % 2 == 0) {
			return str.substring(str.length()/2-1, str.length()/2+1);
		}
		else {
			return str.substring(str.length()/2, str.length()/2+1);
		}
	}
	
	public static int findVowelNum(String str) {
		str = str.toLowerCase();
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.substring(i, i+1).equals("a") || str.substring(i, i+1).equals("e") || str.substring(i, i+1).equals("i") || str.substring(i, i+1).equals("o") || str.substring(i, i+1).equals("u")) {
				count++;
			}
		}
		return count;
	}
	
	public static int findWordNum(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.substring(i, i+1).equals(" ") && !str.substring(i-1, i).equals(" ")) {
				count++;
			}
		}
		return count+1;
	}

	public static int findDigitSum(String strNum) {
		String[] digits = strNum.split("");
		int sum = 0;
		for (int i = 0; i < digits.length; i++) {
			sum = sum + Integer.parseInt(digits[i]);
			}
		return sum;
		}

	public static void doPentagonal() {
		for (int i = 0; i < 50; i++) {
			System.out.printf("%6s", ((i-1)*i+i*(i+1)/2));
			if ((i+1) % 10 == 0) {
				System.out.println();
			}
		}
	}
}