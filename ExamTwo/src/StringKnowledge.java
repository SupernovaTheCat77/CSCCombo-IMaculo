
public class StringKnowledge {

	public static void main(String[] args) {
		System.out.println(howManyCat("abc cat"));
		System.out.println(howManyCat("abc cat abc"));
		System.out.println(howManyCat("cat abc"));
		System.out.println(howManyCat("cacat"));
		System.out.println(howManyCat("noc@tshere"));
		System.out.println(howManyCat("ca"));
		System.out.println(howManyCat(""));
		
		String first = "Ooooo";
		String second = "Helloooooooo";
		System.out.println(endOther(first, second));
	}
	
	public static int howManyCat(String str) {
		int count = 0;
		for (int i = 0; i < str.length()-2; i++) {
			if (str.substring(i, i+3).equals("cat")) count++;
		}
		return count;
	}
	
	public static boolean endOther(String a, String b) {
		a = a.toLowerCase();
		b = b.toLowerCase();
		if (b.endsWith(a) || a.endsWith(b)) return true;
		return false;
	}

}
