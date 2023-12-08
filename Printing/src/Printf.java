
public class Printf {
	
	public static void main(String[] args) {
		System.out.printf("Four thirds = %10s", 4.0 / 3.0, " is the answer");
		String formattedStr = String.format("\nGrand Total: %,.2f", 1000000.00);
		System.out.println(formattedStr);
		
		int count = 0;
		
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.printf("%4s", count+1);
				count++;
			}
			System.out.println();
		}
		
//		System.out.println("\n\n\n");
		
//		int spacing = 5;
//		int length = (spacing*10)+11;
//		
//		for (int k = 0; k < 10; k++) {
//			doLine(length);
//			System.out.print("|");
//			for (int l = 0; l < 10; l++) {
//				centerAlign(spacing, k, l);
//			}
//			System.out.println();
//		}
//		doLine(length);
	}
	
	public static void centerAlign(int space, int k, int l) {
		String value = Integer.toString((k+1)*(l+1));
		space = space - value.length();
		
		for (int i = 0; i < (space/2+(space%2)); i++) {
			System.out.print(" ");
		}
		System.out.print((k+1)*(l+1));
		for (int i = 0; i < ((space/2)); i++) {
			System.out.print(" ");
		}
		System.out.print("|");
			
		}
	
	public static void doLine(int num) {
		for (int i = 0; i < num; i++) {
			System.out.print("-");
		}
		System.out.println();
	}
}
