/*
 * Author: Connor Aksama
 * Project Name: 4_2Hangman
 * File Name: main.java
 * Purpose: Deal with arrays and checking
 * Pseudocode: get word from 2d charray (tm) Get in char from string. Check through guessed letters and selected word. Modify output charray.
 * Maintenance Log: 9/22 done
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
		char[] selectedWord = words[r.nextInt(8)]; //Choose 0 - 7
		char[] outputGuessing = new char[selectedWord.length]; //for outputting correct letters
		int guesses = 0;
		for (int i = 0; i < outputGuessing.length; i++)
		{
			outputGuessing[i] = '_';
		}
		
		boolean wordFound = false;
		
		System.out.println(outputGuessing);
		
		while (!wordFound)
		{
			System.out.println("Enter a letter guess: ");
			String guess = console.next();
			guess.toLowerCase();
			if (guess.length() == 1 && guess.charAt(0) >= 65 && guess.charAt(0) <= 122)
			{
				guesses++;
				char guessChar = guess.charAt(0);
				boolean retyped = false;
				for(char c : lettersGuessed) //get and check first char of string
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
					
					for(int i = 0; i < selectedWord.length; i++)//print correctly guesed letters
					{
						if (selectedWord[i] == guessChar)
						{
							outputGuessing[i] = guessChar;
						}
					}
				}
				boolean notWin = true;
				for(char c : outputGuessing)
				{
					if (c == '_')
					{
						notWin = false;
						break;
					}
				}
				wordFound = notWin;
				
				if (!wordFound)//output guessed letters
				{
					System.out.print(outputGuessing);
					System.out.print("\nLetters Guessed: {" + lettersGuessed.get(0));
					for(int i = 1; i <= lettersGuessed.size() - 1; i++)
					{
						System.out.print(", ");
						System.out.print(lettersGuessed.get(i));
					}
					System.out.print("}\n");
				}
			}
			else
			{
				System.out.println("Not Valid");
			}
			
		}
		System.out.println("\nWin");
		console.close();
	}

}
