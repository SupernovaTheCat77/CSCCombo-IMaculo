import java.util.Scanner;

/** 
 * Tic-Tac-Toe Game
 * 
 * An implimentation of the classic game of Tic-Tac-Toe
 * 
 * @author Izzy Maculo
 * @date 11/15/2023
 */

public class TTT {
	public static void main(String[] args) {
		char[][] boxes = {{'1', '2', '3'}, {'4', '5', '6'}, {'7', '8', '9'}};
		int player = 1;  // player = player%2 + 1
		int box = 0;
		int turnCount = 0;
		Scanner input = new Scanner(System.in);
		
		while (checkWin(boxes) == false && turnCount < 9) {
			drawBoard(boxes);
			System.out.print("\nPlayer " + player + ", which box will you take?: ");
			box = input.nextInt();
			while (checkValidity(boxes, box) == false) {
				System.out.print("Sorry, that spot isn't possible to be taken. Player " + player + ", which box will you take?: ");
				box = input.nextInt();
			}
			inputTurn(boxes, box, player);
			turnCount++;
			if (checkWin(boxes) == false) player = player%2 + 1;
		}
		
		drawBoard(boxes);
		if (checkWin(boxes) == true) System.out.println("\nCongratulations to Player " + player + ", you win!");
		else System.out.println("\nIt was a tie!");

	}
	public static void drawBoard(char[][] boxes) {
		System.out.println("\n " + boxes[0][0] + " | " + boxes[0][1] + " | " + boxes[0][2] + " \n-----------\n "
				+ boxes[1][0] + " | " + boxes[1][1] + " | " + boxes[1][2] + " \n-----------\n "
				+ boxes[2][0] + " | " + boxes[2][1] + " | " + boxes[2][2] + " ");
	}
	
	public static boolean checkWin(char[][] boxes) {
		if ((boxes[0][0] == boxes[0][1] && boxes[0][1] == boxes[0][2])
				|| (boxes[1][0] == boxes[1][1] && boxes[1][1] == boxes[1][2])
				|| (boxes[2][0] == boxes[2][1] && boxes[2][1] == boxes[2][2])
				|| (boxes[0][0] == boxes[1][0] && boxes[1][0] == boxes[2][0])
				|| (boxes[0][1] == boxes[1][1] && boxes[1][1] == boxes[2][1])
				|| (boxes[0][2] == boxes[1][2] && boxes[1][2] == boxes[2][2])
				|| (boxes[0][0] == boxes[1][1] && boxes[1][1] == boxes[2][2])
				|| (boxes[0][2] == boxes[1][1] && boxes[1][1] == boxes[2][0]))
				return true;
		return false;
	}
	
	public static boolean checkValidity(char[][] boxes, int box) {
		if (box == 1) {
			return (boxes[0][0] == '1')? true: false;
		}
		else if (box == 2) {
			return (boxes[0][1] == '2')? true: false;
		}
		else if (box == 3) {
			return (boxes[0][2] == '3')? true: false;
		}
		else if (box == 4) {
			return (boxes[1][0] == '4')? true: false;
		}
		else if (box == 5) {
			return (boxes[1][1] == '5')? true: false;
		}
		else if (box == 6) {
			return (boxes[1][2] == '6')? true: false;
		}
		else if (box == 7) {
			return (boxes[2][0] == '7')? true: false;
		}
		else if (box == 8) {
			return (boxes[2][1] == '8')? true: false;
		}
		else if (box == 9) {
			return (boxes[2][2] == '9')? true: false;
		}
		else return false;
	}
	
	public static char[][] inputTurn(char[][] boxes, int box, int player) {
		char letter = '0';
		if (player == 1) letter = 'X';
		else letter = 'O';
		
		if (box == 1) {
			boxes[0][0] = letter;
		}
		else if (box == 2) {
			boxes[0][1] = letter;
		}
		else if (box == 3) {
			boxes[0][2] = letter;
		}
		else if (box == 4) {
			boxes[1][0] = letter;
		}
		else if (box == 5) {
			boxes[1][1] = letter;
		}
		else if (box == 6) {
			boxes[1][2] = letter;
		}
		else if (box == 7) {
			boxes[2][0] = letter;
		}
		else if (box == 8) {
			boxes[2][1] = letter;
		}
		else if (box == 9) {
			boxes[2][2] = letter;
		}
		return boxes;
	}
}
