/*
 * Author: Connor Aksama
 * Project Name: 3_1Repl
 * File Name: main.java
 * Purpose: Do strings
 * Pseudocode: Use loop to add to string.
 * Maintenance Log: 9/13 Done.
 */

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console = new Scanner(System.in);
		System.out.println("Enter String to be repeated: ");
		String template = console.nextLine();
		System.out.println("Enter number of repetitions: ");
		int reps = console.nextInt();
		System.out.println(repl(template, reps));
	}
	public static String repl(String template, int reps)
	{
		if (reps <= 0)
		{
			return "";
		}
		String lengthy = "";
		for (int i = 0; i < reps; i++)
		{
			lengthy += template;
		}
		return lengthy;
	}

}
