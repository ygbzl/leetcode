import java.util.Random;

public class Deck {

	private Card[] deck;
	private Card[] discardPile;
	private int deckIndex;
	private int discardIndex;
	private Random rand;
	public Deck() {
		deckIndex = 0;
		discardIndex = 0;
		deck = new Card[52];
		discardPile = new Card[52];
		int count = 0;
		for (int i=1;i<=13;i++) {
			deck[count++] = new Card(i, "Hearts");
			deck[count++] = new Card(i, "Diamonds");
			deck[count++] = new Card(i, "Spades");
			deck[count++] = new Card(i, "Clubs");
		}
		rand = new Random();
		shuffle();
	}
	
	public void shuffle() {
		for (int i=51;i>=1;i--) {
			int j = rand.nextInt(i+1);
			Card t = deck[i];
			deck[i] = deck[j];
			deck[j] = t;
		}
			
	}
	
	public Card drawNextCard() {
		if (deckIndex > 51) {
			int count = 0;
			for (int i=1;i<=13;i++) {
				deck[count++] = new Card(i, "Hearts");
				deck[count++] = new Card(i, "Diamonds");
				deck[count++] = new Card(i, "Spades");
				deck[count++] = new Card(i, "Clubs");
			}
			shuffle();
			deckIndex = 0;
			discardIndex = 0;
			discardPile = new Card[52];
		}
		return deck[deckIndex++];
	}
	
	public void discard(Card c){
		discardPile[discardIndex++] = c;
	}
}
