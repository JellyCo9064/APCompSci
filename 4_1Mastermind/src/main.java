/*
 * Author: Connor Aksama
 * Project Name: 4_1Mastermind
 * File Name: main.java
 * Purpose: Deal with arrays and checking
 * Pseudocode: Init random int array, get in guess as charray (tm), check for MAX correct, check again for less correct.
 * Maintenance Log: 9/15 Began base 9/16 finished checking 10/2 bbboi
 */
import java.util.Random;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		Scanner console = new Scanner(System.in);
		
		int[] password = {6, 6, 1, 4};
		
		int correctPlace = 0;
		int appearance = 0;
		/*
		for (int i = 0; i < 4; i++)
		{
			password[i] = (int)r.nextInt(9);
			System.out.print(password[i]);
		}*/
		System.out.print("\n");
label:			
		while (correctPlace != 4)
		{
		
			correctPlace = 0;
			appearance = 0;
			System.out.println("Enter your guess (no spaces)");
			char[] guess = console.nextLine().toCharArray();
			boolean[] guessTested = {false, false, false, false};
			boolean[] passTested = {false, false, false, false};//if true, password index already matched
			if (guess.length < 4 || guess.length > 4)
			{
				System.out.println("Invalid");
				continue label;
			}
			for (int i = 0; i < 4; i++)//Check for validity
			{
				if (guess[i] < 48 || guess[i] > 57)
				{
					System.out.println("Invalid");
					continue label;
				}
			}
			for (int i = 0; i < 4; i++)//Check only for correct place
			{
				if (guess[i] - 48 == password[i])
				{
					guessTested[i] = true;
					passTested[i] = true;
					correctPlace++;
				}
			}
			//Take each password number, and check against each guess number
			for (int i = 0; i < 4; i++)//i == input index being checked
			{
				for (int j = 0; j < 4; j++)//j == password index being checked
				{	/*if (tested[j])//if password index already matched
					{
						break;
					}*/
					if (guess[j] - 48 == password[i] && !passTested[j] && !guessTested[i])
					{

						passTested[j] = true;
						guessTested[i] = true;
						appearance++;
						break;
					}
				}
			}
			
							
			if (correctPlace != 4)
			{
				System.out.println("Correct Numbers in Correct Position: " + correctPlace);
				System.out.println("Correct Numbers in Incorrect Position: " + appearance);
			}
		}
		System.out.println("you win");
	}

}
