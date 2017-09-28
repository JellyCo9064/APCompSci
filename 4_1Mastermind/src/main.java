/*
 * Author: Connor Aksama
 * Project Name: 4_1Mastermind
 * File Name: main.java
 * Purpose: Deal with arrays and checking
 * Pseudocode: Init random int array, get in guess as charray (tm), check for MAX correct, check again for less correct.
 * Maintenance Log: 9/15 Began base 9/16 finished checking
 */
import java.util.Random;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		Scanner console = new Scanner(System.in);
		
		int[] password = new int[4];
		
		int correctPlace = 0;
		int appearance = 0;
		
		for (int i = 0; i < 4; i++)
		{
			password[i] = (int)r.nextInt(9);
		}
label:			
		while (correctPlace != 4)
		{
		
			correctPlace = 0;
			appearance = 0;
			System.out.println("Enter your guess (no spaces)");
			char[] guess = console.nextLine().toCharArray();
			boolean[] tested = {false, false, false, false};//used to test password activity. Set true if index has match in guess.
			if (guess.length < 4 || guess.length > 4)
			{
				System.out.println("Invalid");
				continue label;
			}
			for (int i = 0; i < 4; i++)
			{
				if (guess[i] < 48 || guess[i] > 57)
				{
					System.out.println("Invalid");
					continue label;
				}
			}
			for (int i = 0; i < 4; i++)
			{
				if (guess[i] - 48 == password[i])
				{
					tested[i] = true;
					correctPlace++;
				}
			}
			for (int i = 0; i < 4; i++)
			{
				for (int j = 0; j < 4; j++)
				{	
					if (guess[i] - 48 == password[j] && !tested[j])
					{
						tested[j] = true;
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
