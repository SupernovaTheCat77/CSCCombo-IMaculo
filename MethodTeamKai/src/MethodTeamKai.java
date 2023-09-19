
public class MethodTeamKai {
	
	
//	Abian, Colin, Izzy, Kai

	public static void main(String[] args) {
		int num1 = 5;
		int num2 = 3;
		
		int sum = doAddition(num1, num2);
		System.out.println("The sum is " + sum + ".");
		int output = doSubtraction(num1, num2);
		System.out.println("The output is " + output + ".");
		int multiple = doMultiplication(num1, num2);
		System.out.println(num1 + " and " + num2 + " multiplied equals " + multiple + ".");
		
		double dividend = doDivision(num1, num2);
		System.out.println(dividend);
		
		System.out.println(Math.addExact(num1,num2));
		System.out.println(Math.subtractExact(num1, num2));
		System.out.println(Math.multiplyExact(num1, num2));
		
	}
	
	public static int doAddition(int num1, int num2) {
		int sum = num1 + num2;
		return sum;
	}
	public static int doSubtraction(int num3, int num4) {
		int result = num3 - num4;
		return result;
	}
	
	public static int doMultiplication(int number1, int number2) {
		int mult = number1 * number2;
		return mult;
	} // end method

	public static double doDivision(int divide1, int divide2) {
		double d1 = new Double(divide1);
		double d2 = new Double(divide2);
		double div = d1/d2;
		return div;
	} 
	
	
	// end method
}
