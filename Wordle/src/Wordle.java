import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Random;

public class Wordle {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		List<String> words = loadWords();
		for (int i = 0; i < words.size(); i++) System.out.println(words.get(i) + " ");
		System.out.println("\n\n" + pickWord(words));
	}
	
	public static List<String> loadWords() {
		List<String> words = new ArrayList<>();
		words.add("juice");
		words.add("alpha");
		words.add("spend");
		words.add("whole");
		words.add("clock");
		words.add("quiet");
		words.add("green");
		words.add("mayor");
		words.add("drama");
		words.add("style");
		return words;
	}
	
	public static String pickWord(List<String> words) {
		Random rand = new Random();
		int randIndex = rand.nextInt(words.size());
		return words.get(randIndex);
	}
	
	public static boolean isValid(String guess, String word) {
		guess = guess.toLowerCase();
		word = word.toLowerCase();
		return (guess.equals(word))? true: false;
	}
	
	public static List<String> checkLetters(String guess, String word) {
		List<String> fullWord = new ArrayList<>();
		List<String> fullGuess = new ArrayList<>();
		List<String> letters = new ArrayList<>();
		int lettersCount = 0;
		for (int i = 0; i < word.length(); i++) fullWord.add(word.substring(i));
		for (int i = 0; i < guess.length(); i++) fullGuess.add(guess.substring(i));
		for (int i = 0; i < word.length(); i++) {
			if (fullWord.get(i) == fullGuess.get(i)) {
				letters.add(guess);
				fullWord.remove(i);
				fullGuess.remove(i);
				lettersCount++;
			}
		}
	}
}
