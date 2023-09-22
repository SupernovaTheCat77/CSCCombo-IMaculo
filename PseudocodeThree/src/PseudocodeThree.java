import java.util.Scanner;

public class PseudocodeThree {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int count = 0;
		int paidCount = 0;
		int trueCount = 0;
		int paidTotal = 0;
		int total = 0;
		int paidData;
		int data;
		
		while (paidCount < 3) {
			System.out.print("Paid precipitation data #" + (paidCount+1) + "?: ");
			paidData = input.nextInt();
			paidTotal = paidTotal + paidData;
			paidCount++;
		}
		double paidAverage = paidTotal / paidCount;
		double bottomLimit = paidAverage * 0.75;
		double topLimit = paidAverage * 1.25;
		System.out.println("Average paid precipitation data is " + paidAverage);
		while (count < 197) {
			System.out.println("Volunteer precipitation data #:" + (count+1) + "?: ");
			data = input.nextInt();
			
			if (data >= bottomLimit && data <= topLimit) {
				total = total + data;
				trueCount++;
			}
			count++;
		}
		double average = (total + paidTotal) / (trueCount + paidCount);
		System.out.println("Average precipitation for the city is " + average + ", using " + trueCount + " of " + count + " volunteer reports and all " + paidCount + " paid reports.");
	}
}
