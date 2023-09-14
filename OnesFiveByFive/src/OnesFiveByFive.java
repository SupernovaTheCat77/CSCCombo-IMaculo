
public class OnesFiveByFive {

	public static void main(String[] args) {
		int i = 0;
		int j = 0;
		int k = 0;
		
		for(i = 0; i < 5; i++) {
			for(j = 0; j < 5; j++) {
				System.out.print("1");
			}
			System.out.println();
		}
		
		System.out.println("\n");
		
		for(i = 0; i < 5; i++) {
			if (i % 2 == 0) {
				for(j = 0; j < 5; j++) {
					System.out.print("*");
				}
			}
			else {
				for(k = 0; k < 5; k+=2) {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}
}
