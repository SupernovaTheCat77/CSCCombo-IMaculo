
public class Deck {
	
	public static void shuffle(Deck deck) {
		Card[] cards = deck.getCards();
		for (int i = 0; i < cards.length; i++) {
			int index = rand.nextInt(cards.length);
			Card temp = cards[i];
			cards[i] = cards[index];
			cards[index] = temp;
		}
	}
	
	private void swap(int a, int b) {
		Card temp = cards[a];
		cards[a] = cards[b];
		cards[b] = temp;
	}
	
	public void bubbleSort(cards) {
		for (int i = 0; i < cards.length-1; i++) {
			for (int j = 1; j < cards.length-i; j++) {
				if (cards[j-1].compareTo(cards[j]) > 0) {
					swap(cards, j-1, j);
				}
			}
		}
	}
	
	
	
	@Override
	public String toString
}
