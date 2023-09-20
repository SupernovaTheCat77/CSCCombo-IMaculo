
public class Printf {
	
	public static void main(String[] args) {
//		System.out.printf("Four thirds = %10.2f%10s", 4.0 / 3.0, " is the answer");
//		String formattedStr = String.format("\nGrand Total: %,.2f", 1000000.00);
//		System.out.println(formattedStr);
		
		int count = 0;
		
//		for (int i = 0; i < 10; i++) {
//			for (int j = 0; j < 10; j++) {
//				System.out.printf("%4s", count+1);
//				count++;
//			}
//			System.out.println();
//		}
		
//		System.out.println("\n\n\n");
		
		for (int k = 0; k < 10; k++) {
			for (int l = 0; l < 10; l++) {
				System.out.printf("%5s", (k+1)*(l+1));
			}
			System.out.println("\n");
		}
	}
}
