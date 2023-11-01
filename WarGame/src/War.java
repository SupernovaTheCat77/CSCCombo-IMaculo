
public class War {

	public static void main(String[] args) {
//		Card card = new Card(1, 3);
//		System.out.println(card + "\n\n");
		
		Deck deck1 = new Deck();
		
		System.out.println(deck1 + "\n\n");
		deck1.shuffle();
		System.out.println(deck1 + "\n\n");
		deck1.bubbleSort(deck1);
		System.out.println(deck1 + "\n\n");
	}

}
