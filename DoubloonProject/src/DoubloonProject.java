
/******************************************************************************************************************************
 *  This program checks whether or not an inputed word is a doubloon (when every letter in the word appears exactly twice).   *
 *  Written by: Izzy Maculo                                                                                                   *
 *  Date: 9/25/23                                                                                                             *
 *****************************************************************************************************************************/

import java.util.Scanner;

public class DoubloonProject {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a word: ");
		String trueWord = input.next();
		String word = trueWord.toLowerCase();
		
		boolean doubloon = isDoubloon(word);
		
		if (doubloon == true) {
			System.out.println("The word \"" + trueWord + "\" is a doubloon (every letter in the word appears exactly twice).");
		}
		else {
			System.out.println("The word \"" + trueWord + "\" is not a doubloon (when every letter in the word appears exactly twice).");
		}

	}
	
	public static boolean isDoubloon(String word) {
		for (int i = 0; i < word.length(); i++) {
			int count = 0;
			for (int j = 0; j < word.length(); j++) {
				if (word.charAt(i) == word.charAt(j)) {	
					count++;
				}
			}
			if (count != 2) {
				return false;
			}
		}
		return true;
	}
}
