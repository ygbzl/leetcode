


public class Solution {
	
	public static void main(String[] args) {
		Deck deck = new Deck();
		for (int i=0;i<52;i++) {
			Card c = deck.drawNextCard();
			System.out.println(c.toString());
		}
		
	}

}
