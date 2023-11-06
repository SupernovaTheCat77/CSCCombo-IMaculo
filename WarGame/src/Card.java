
public class Card {
	private int rank;
	private int suit;
	private String[] SUITS = {"Hearts", "Clubs", "Diamonds", "Spades"};
	private String[] RANKS = {null, "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
	
	public Card(int rank, int suit) {
		this.rank = rank;
		this.suit = suit;
	}
	
	//private final
	
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public int getSuit() {
		return suit;
	}
	public void setSuit(int suit) {
		this.suit = suit;
	}

	public String toString() {
		return RANKS[rank] + " of " + SUITS[suit];
	}
	
	public int compareTo(Card oCard) {
//		if (suit > oCard.suit) return 1;
//		else if (suit < oCard.suit) return -1;
		if (rank == oCard.rank) return 0; 
		if (rank > oCard.rank || rank == 1) return 1;
		else if (rank < oCard.rank || oCard.rank == 1) return -1;
		return 0;
	}
}
