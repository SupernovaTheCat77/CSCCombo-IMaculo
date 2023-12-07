import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class DiceGame {

	public static void main(String[] args) throws FileNotFoundException{
		Scanner input = new Scanner(System.in);
		File results = new File("DiceGameOutput.txt");
		PrintWriter printer = new PrintWriter(new FileOutputStream(results.getName()));
		
		System.out.print("How many sides will the dice in this game have?: ");
		int numSides = input.nextInt();
		System.out.print("How many players?: ");
		int playersNum = input.nextInt();
		
		Player[]players = new Player[playersNum];
		
		for (int i = 0; i < players.length; i++) {
			System.out.print("Player " + (i+1) + ", what is your name?: ");
			players[i] = new Player(input.next(), new Die(numSides));
		}
		
		for (int i = 0; i < players.length; i++) {
			players[i].getDie().roll();
			System.out.println("Player " + players[i].getName() + " rolled a " + players[i].getDie().getValue() + " on a " + numSides + "-sided dice.");
		}
		
		if (decideWinner(players) == -1) {
			System.out.println("There was a tie. Results stored in " + results.getName() + ".");
			printer.println("There was a tie.");
		}
		else {
			System.out.println("Player " + players[decideWinner(players)].getName() + " won the game. Results stored in " + results.getName() + ".");
			printer.println("Player " + players[decideWinner(players)].getName() + " won the game.");
		}
		printer.close();
	}
	
	public static int decideWinner (Player[] players) {
		int winner = 0;
		for (int i = 0; i < players.length; i++) {
			if (players[i].getDie().getValue() > players[winner].getDie().getValue()) winner = i;
		}
		
		for (int i = 0; i < players.length; i++) {
			if (i != winner && players[i].getDie().getValue() == players[winner].getDie().getValue()) return -1;;
		}
		return winner;
	}

}
