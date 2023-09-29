
/*******************************************************************
 *  This program is the answer to the fourth question of Exam 1.   *
 *  Written by: Izzy Maculo                                        *
 *  Date: 9/29/23                                                  *
 ******************************************************************/

public class PrintNumber {

	public static void main(String[] args) {
		doLine();
		System.out.print("|");
		for (int i = 5; i <= 19; i++) {
			centerAlign(i);
			if ((i-4) % 5 == 0) {
				System.out.println();
				doLine();
				if (i != 19) System.out.print("|");
			}
		}
	}
	public static void centerAlign(int num) {
		int space = 4;
		String value = Integer.toString(num);
		space = space - value.length();
		
		for (int i = 0; i < (space/2+(space%2)); i++) {
			System.out.print(" ");
		}
		
		System.out.print(value);
		
		for (int i = 0; i < ((space/2)); i++) {
			System.out.print(" ");
		}
		
		System.out.print("|");
	}
	
	public static void doLine() {
		int num = ((4*5) + 6);
		for (int i = 0; i < num; i++) {
			System.out.print("-");
		}
		System.out.println();
	}
}
