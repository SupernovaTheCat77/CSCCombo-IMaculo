
/********************************************************************************
 *  This program checks whether a given word can be made with the given tiles.  *
 *  Written by: Izzy Maculo                                                     *
 *  Date: 9/25/23                                                               *
 *******************************************************************************/

import java.util.Scanner;

public class TileProject {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Input tiles and then a word: ");
		String tiles = input.next();
		String word = input.next();
		
		if (canMake(tiles, word)) {
			System.out.println("The tiles can be used to make the word.");
		}
		else {
			System.out.println("The tiles cannot be used to make the word.");
		}

	}
	
	public static boolean canMake(String tiles, String word) {
		for (int i = 0; i < word.length(); i++) {
			int count = 0;
			for (int j = 0; j < word.length(); j++) {
				if (word.charAt(i) == word.charAt(j)) {
					count++;
				}
			}
			for (int k = 0; k < tiles.length(); k++) {
				if (word.charAt(i) == tiles.charAt(k)) {
					count--;
				}
			}
			if (count > 0) {
				return false;
			}
		}
		return true;
	}
}
