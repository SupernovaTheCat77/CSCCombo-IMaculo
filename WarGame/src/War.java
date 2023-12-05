
public class War {

	public static void main(String[] args) {	
	///// Setup
		Deck deck = new Deck();
		deck.shuffle();
		
		Pile p1 = new Pile();
		Deck subDeck = deck.subDeck(0, 25);
		p1.addDeck(subDeck);
		
		Pile p2 = new Pile();
		subDeck = deck.subDeck(26, 51);
		p2.addDeck(subDeck);
		
		Pile midPile = new Pile();
		Pile p1Win = new Pile();
		Pile p2Win = new Pile();
		
		
	///// Logic
		while(!p1.isEmpty() && !p2.isEmpty()) {
			Card c1 = p1.popCard();
			Card c2 = p2.popCard();
			
			midPile.addCard(c1);
			midPile.addCard(c2);
			
			System.out.println(c1 + " vs. " + c2);
			int cmpResult = c1.compareTo(c2);
			
			if (cmpResult > 0) {
				System.out.println("Player 1 wins.\nCurrent score: " + p1Win.size() + " | " + p2Win.size() + "\n");
				p1Win.addPile(midPile);
			}
			else if (cmpResult < 0) {
				System.out.println("Player 2 wins.\nCurrent score: " + p1Win.size() + " | " + p2Win.size() + "\n");
				p2Win.addPile(midPile);
			}
			else System.out.println("Tie!\n");
		}
		
		
	///// Cards spent
		if (p1Win.size() > p2Win.size()) System.out.println("\nPlayer 1 wins!");
		else if (p1Win.size() < p2Win.size()) System.out.println("\nPlayer 2 wins!");
		else System.out.println("\nPlayer 1 and Player 2 have tied!");
		
	
	}
}
