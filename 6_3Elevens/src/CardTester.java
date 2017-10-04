/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card card1 = new Card("Nine", "Hearts", 9);
		Card card2 = new Card("Ten", "Clubs", 10);
		Card card3 = new Card("Eight", "Diamonds", 8);
		
		System.out.println(card1.toString() + "\n" + card2.toString() + "\n" + card3.toString());
	}
}

