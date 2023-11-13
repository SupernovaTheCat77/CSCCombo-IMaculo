import java.util.Arrays;

public class TimesTable {
	private int[][] table = new int[10][10];
	
	public TimesTable() {
		for(int row = 0; row < table.length; row++) {
			for(int col = 0; col < table[row].length; col++) {
				table[row][col] = (row+1)*(col+1);
			}
		}
		this.table = table;
	}
	
	public static int[][] createTimesTable(int rowNum, int colNum) {
		int[][] table = new int[rowNum][colNum];
		for(int row = 0; row < table.length; row++) {
			for(int col = 0; col < table[row].length; col++) {
				table[row][col] = (row+1)*(col+1);
			}
		}
		return table;
	}

	@Override
	public String toString() {
		String str = "";
		for(int row = 0; row < table.length; row++) {
			for(int col = 0; col < table[row].length; col++) {
				str += str.format("%-4s", table[row][col]);
			}
			str += "\n";
		}
		return str;
	}
	
	
	
	}
