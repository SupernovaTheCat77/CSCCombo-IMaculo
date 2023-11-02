
public class War {

	public static void main(String[] args) {
//		Card card = new Card(1, 3);
//		System.out.println(card + "\n\n");
		
		Deck deck = new Deck();
		
		System.out.println(deck + "\n\n");
		deck.shuffle();
		System.out.println(deck + "\n\n");
//		deck.bubbleSort(deck);
//		System.out.println(deck + "\n\n");
		
		Pile pile = new Pile();
		pile.addCard(deck.getCards()[0]);
		System.out.println(pile);
	}

}
