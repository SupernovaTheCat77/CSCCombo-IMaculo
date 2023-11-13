
public class Driver {

	public static void main(String[] args) {
		TimesTable table = new TimesTable();
		System.out.println(table.toString());
		int[][] table2 = TimesTable.createTimesTable(15, 15);
		System.out.println(table2.toString());
	}
}
