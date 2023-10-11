
public class FirstRecursion {
	static long[] fibArray;
	
	public static void main(String[] args) {
		//factorial(5);
		//counting(5);
		//System.out.println(fibonacci(0));
		
		int term = 45;
		fibArray = new long[term];
		doLine(117);
		for (int i = 0; i < fibArray.length; i++) {
			centerAlign(12, fib(i));
			if (((i+1) % 9) == 0) {
				doLine(118);
			}
		}
		
	}
	
	private static long fib(int n) {
		if (n == 0|| n == 1) return n;
		if (fibArray[n] != 0) return fibArray[n];
		fibArray[n] = fib(n-1) + fib(n-2);
		return fibArray[n];
	}
	
	public static void centerAlign(int space, long n) {
		String value = Integer.toString((int) n);
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
	
	public static void doLine(int num) {
		System.out.println();
		for (int i = 0; i < num; i++) {
			System.out.print("-");
		}
		System.out.println();
	}
	
	private static int factorial(int n) {
		if (n == 0) return 1;
		int product = n * factorial (n-1);
		System.out.println(product);
		return product;
	}
	private static void counting(int n) {
		if (n == 0) {
			System.out.println(0);
		} else {
			//System.out.println(n);
			counting (n-1);
			System.out.println(n);
		}
	}
	private static int fibonacci(int n) {
		int value = (n == 0 || n == 1)? n: (fibonacci(n-1)) + (fibonacci(n-2));
		return value;
	}
}
