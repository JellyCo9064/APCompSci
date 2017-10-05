/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		String[] ranks = {"Moo", "Moo"};
		String[] suits = {"Mee", "Mee"};
		int[] values = {1, 2};
		Deck deck1 = new Deck(ranks, suits, values);
		System.out.println(deck1.size() + " " + deck1.deal() + " " + deck1.isEmpty());
		
		String[] ranks2 = {"Maa", "Mef"};
		String[] suits2 = {"11", "aa"};
		int[] values2 = {3, 5};
		Deck deck2 = new Deck(ranks2, suits2, values2);
		System.out.println(deck2.size() + " " + deck2.deal() + " " + deck2.isEmpty());
		
		String[] ranks3 = {"Vivek", "Voivek"};
		String[] suits3 = {"Patel", "Patoitel"};
		int[] values3 = {64, 90};
		Deck deck3 = new Deck(ranks3, suits3, values3);
		System.out.println(deck3.size() + " " + deck3.deal() + " " + deck3.isEmpty());
	}
}
