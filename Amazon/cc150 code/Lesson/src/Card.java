public class Card {
	private int value;
	private String suit;
	public Card(int value, String suit) {
		this.value = value;
		this.suit = suit;
	}
	public int getValue() {
		return this.value;
	}
	public String getColor() {
		if (this.suit == "Hearts" || this.suit == "Diamonds")
			return "red";
		if (this.suit == "Spades" || this.suit == "Clubs")
			return "black";
		return "error";
	}
	
	public void changeSuit(String suit) {
		if (suit == "Hearts" || suit == "Diamonds" || suit == "Spades" || suit == "Clubs")
			this.suit = suit;
	}
	
	public String getSuit() {
		return this.suit;
	}
	public String toString() {
		if (this.value == 1)
			return "Ace of " + this.suit;
		if (this.value == 11)
			return "Jack of " + this.suit;
		if (this.value == 12)
			return "Queen of " + this.suit;
		if (this.value == 13)
			return "King of " + this.suit;
		return this.value + " of " + this.suit;
	}
}