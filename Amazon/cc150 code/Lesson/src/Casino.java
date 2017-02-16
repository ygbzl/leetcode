
//Name: Jiaming He
//Email: jjjjjiaming@brandeis.edu
//Date: Dec 1 2016
//PA7- this is a card class
//Bugs: No
import java.util.*;

public class Casino {
	static Deck deck;
	static Card[] userCard;
	static Card[] computerCard;
	static int userScore;
	static int dealerScore;
	static int capital;
	public static void main(String[] args) {
		// introduce to the game and prompt the user to choose the game
		capital = 1000;
		Scanner console = new Scanner(System.in);
		int choice;
		do {
			System.out.println("Welcome to Antonella's Cyber Casino. You will start off with $" + capital
					+ "\n1:Simple War\n2:Black Jack\n3:quit\nYour Choice: ");
			choice = console.nextInt();
			if (choice == 1) {
				simpleWar(console);
			}
			if (choice == 2) {
				blackJack(console);
			}
			if (choice == 3) {
				break;
			}
		} while (choice != 3);

	}

	// this static method is for the war game
	public static void simpleWar(Scanner console) {
		Deck deck = new Deck();
		// begin the simple war game
		do {
			System.out.print("How much do you bet? ");
			int bet = console.nextInt();
			Card userCard = deck.drawNextCard();
			Card computerCard = deck.drawNextCard();
			System.out.println("Your card:" + userCard.toString());
			System.out.println("My card:" + computerCard.toString());
			if (userCard.getValue() > computerCard.getValue()) {
				capital += bet;
				System.out.println("Congratulation! You Won!\nYour new total is " + capital);
			}
			if (userCard.getValue() < computerCard.getValue()) {
				capital -= bet;
				System.out.println("Sorry! I Won!\nYour new total is " + capital);
			}
			if (userCard.getValue() == computerCard.getValue()) {
				System.out.println("It's a tie!\nYour new total is " + capital);
			}

			System.out.print("Do you want to play this game again?(y or n)");
			String term = console.next();
			if ("n".equals(term)) {
				break;
			}
			System.out.println();
		} while (capital > 0);

	}

	public static int getScore(int x) {
		if (x > 10)
			return 10;
		return x;
	}

	public static void display(String role) {
		System.out.println("Current hand:");
		System.out.print("[");
		for (int i = 0; i < 5; i++) {
			if (userCard[i] != null)
				System.out.print(userCard[i].toString());
			else
				System.out.print("null");

			if (i != 4)
				System.out.print(", ");
		}
		System.out.println("]");
		if (role.equals("user")) {
			if (userScore > 21) {
				System.out.println("This is over 21, sorry.");
				userScore = -1;
			} else {
				System.out.println("Value: " + userScore);
			}
		
		}
		else {
			if (dealerScore > 21) {
				System.out.println("This is over 21, sorry.");
				dealerScore = -1;
			} else {
				System.out.println("Value: " + dealerScore);
			}
		}
	}

	// this static method is for black jack game
	public static void blackJack(Scanner console) {
		deck = new Deck();
		userCard = new Card[5];
		computerCard = new Card[5];
		int temp = 0;
		// begin the black jack game
		do {
			System.out.print("How much do you bet?");
			userScore = 0;
			dealerScore = 0;
			int bet = console.nextInt();
			int index = 2;
			// the user's turn
			System.out.println("\n-----Your turn-----");
			userCard[0] = deck.drawNextCard();
			userCard[1] = deck.drawNextCard();

			userScore = getScore(userCard[0].getValue()) + getScore(userCard[1].getValue());
			display("user");
			while (index < 4) {

				// ask user's choice
				System.out.println("Enter 1 to hit, enter 2 to stand:");
				int feedBack = console.nextInt();
				if (feedBack == 1) {
					userCard[index] = deck.drawNextCard();
					userScore += getScore(userCard[index].getValue());
					display("user");
					if (userScore == -1) {
						index = 4;
						break;
					}
					index++;
				}
				if (feedBack == 2) {
					System.out.println("Your final score: " + userScore);
					break;
				}
			}
			if (index == 4)
				System.out.println("Your final score: " + userScore);
			// the dealer's turn
			System.out.println("\n-----My turn-----");
			userCard[0] = deck.drawNextCard();
			userCard[1] = deck.drawNextCard();
			userCard[2] = null;
			userCard[3] = null;
			userCard[4] = null;
			dealerScore = getScore(userCard[0].getValue()) + getScore(userCard[1].getValue());

			display("dealer");
			for (int i = 2; i < 5; i++) {

				if (dealerScore <= 16) {
					userCard[i] = deck.drawNextCard();
					dealerScore += getScore(userCard[i].getValue());
					System.out.println("I'm going to hit.");
					display("dealer");
				}
				if (dealerScore > 16) {
					System.out.println("I'm going to stand.\nMy final score: " + dealerScore);
					break;
				}
			}

			// count the result
			if (userScore > dealerScore) {
				capital += bet;
				System.out.println("Congratulation! You Win!\nYour new total is " + capital);
			}
			if (userScore < dealerScore) {
				capital -= bet;
				System.out.println("Whoops, You lost!\nYour new total is " + capital);
			}
			if (userScore == dealerScore) {
				System.out.println("It's a tie!\nYour new total is " + capital);
			}
			if (capital <= 0) {
				System.out.println("You have no money! Game ends!");
				break;
			}
			System.out.print("Do you want to play this game again?(y or n)");
			String term = console.next();
			if ("n".equals(term)) {
				temp = 1;
			}
			System.out.println();
		} while (temp == 0);
	}

}
