
public class LogicKnowledge {

	public static void main(String[] args) {
		System.out.println(pickNumber(1, 2, 3) + " " + 6);
		System.out.println(pickNumber(1, 1, 1) + " " + 1);
		System.out.println(pickNumber(1, 1, 2) + " " + 2);
		System.out.println(pickNumber(1, 2, 1) + " " + 2);
		System.out.println(pickNumber(2, 1, 1) + " " + 2);
		
		System.out.println(equiDistance(1, 2, 3));
		System.out.println(equiDistance(3, 2, 1));
		System.out.println(equiDistance(3, 1, 2));
		System.out.println(equiDistance(1, 3, 2));
		System.out.println(equiDistance(2, 3, 1));
		System.out.println(equiDistance(2, 1, 3));
		System.out.println(equiDistance(3, 2, 3));
		System.out.println(equiDistance(0, 0, 0));
	}
	
	public static int pickNumber(int a, int b, int c) {
		if (a == b && b == c) return a;
		if (a != b && b != c && a != c) return a+b+c;
		if (a == b) return c;
		return (b == c)? a: b;
	}
	
	public static boolean equiDistance(int a, int b, int c) {
		return (a + b == c || b + c == a || a + c == b)? true: false;
	}

}
