/*
 * Author: Connor Aksama
 * Project Name: 4_1Mastermind
 * File Name: main.java
 * Purpose: Deal with arrays and checking
 * Pseudocode: Init random int array, get in guess as charray (tm), check for MAX correct, check again for less correct.
 * Maintenance Log: 9/15 Began base 9/16 finished checking
 */
import java.util.Scanner;
import java.util.Random;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console = new Scanner(System.in);
		
		char[] lettersGuessed = {};
		char[][] words = {"awkward".toCharArray(), "bagpipes".toCharArray(), "banjo".toCharArray(),
					"bungler".toCharArray(), "croquet".toCharArray(), "crypt".toCharArray(),
					"dwarves".toCharArray(), "fervid".toCharArray(), "fishhook".toCharArray()};
		Random r = new Random();
		char[] selectedWord = words[r.nextInt(8)];
		
		boolean wordFound = false;
		while (!wordFound)
		{
			System.out.println("Enter a letter guess: ");
			String guess = console.next();
			if (guess.length() == 1)
			{
				boolean retyped = false;
				for(char c : lettersGuessed)
				{
					if (c == guess.charAt(0))
					{
						System.out.println("Letter already guessed.");
						retyped = true;
					}
				}
				if (!retyped)
				{
					lettersGuessed[lettersGuessed.length] = guess.charAt(0);
				}
				else
				{
					
				}
			}
		}
		
	}

}
