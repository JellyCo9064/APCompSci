/*
 * Author: Connor Aksama
 * Project Name: 4_1Mastermind
 * File Name: main.java
 * Purpose: Deal with arrays and checking
 * Pseudocode: Init random int array, get in guess as charray (tm), check for MAX correct, check again for less correct.
 * Maintenance Log: 9/15 Began base 9/16 finished checking
 */
import java.util.*;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console = new Scanner(System.in);
		
		ArrayList<Character> lettersGuessed = new ArrayList<Character>();
		char[][] words = {"awkward".toCharArray(), "bagpipes".toCharArray(), "banjo".toCharArray(),
					"bungler".toCharArray(), "croquet".toCharArray(), "crypt".toCharArray(),
					"dwarves".toCharArray(), "fervid".toCharArray(), "fishhook".toCharArray()};
		Random r = new Random();
		char[] selectedWord = words[r.nextInt(8)];
		char[] outputGuessing = new char[selectedWord.length];
		for (int i = 0; i < outputGuessing.length; i++)
		{
			outputGuessing[i] = '_';
		}
		
		boolean wordFound = false;
		
		System.out.println(selectedWord);
		System.out.println(outputGuessing);
		
		while (!wordFound)
		{
			System.out.println("Enter a letter guess: ");
			String guess = console.next();
			guess.toLowerCase();
			if (guess.length() == 1)
			{
				char guessChar = guess.charAt(0);
				boolean retyped = false;
				for(char c : lettersGuessed)
				{
					if (c == guessChar)
					{
						System.out.println("Letter already guessed.");
						retyped = true;
						break;
					}
				}
				if (!retyped)
				{
					lettersGuessed.add(guessChar);
					
					for(int i = 0; i < selectedWord.length; i++)
					{
						if (selectedWord[i] == guessChar)
						{
							outputGuessing[i] = guessChar;
						}
					}
				}
			}
			System.out.println("try: " + outputGuessing.toString());
			System.out.print("\nLetters Guessed: {" + lettersGuessed.get(0));
			for(int i = 1; i < lettersGuessed.size() - 1; i++)
			{
				System.out.print(", ");
				System.out.print(lettersGuessed.get(i));
			}
			System.out.print("}\n");
		}
		
	}

}
