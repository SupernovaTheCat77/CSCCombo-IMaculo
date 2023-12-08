
public class Driver {

	public static void main(String[] args) {
		TimesTable table1 = new TimesTable();
		System.out.println(table1.toString());
		int[][] table2 = TimesTable.createTimesTable(100, 100);
		TimesTable.printTimesTable(table2);
		int[][] table3 = TimesTable.createTimesTable(5, 7);
		TimesTable.printTimesTable(table3);
	}
}
