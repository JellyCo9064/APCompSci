/*
 * Author: Connor Aksama
 * Project Name: 2_1_2Fibonacci
 * File Name: main.java
 * Purpose: make Miyoshi happy
 * Pseudocode: Use loop, print second num, switch variable values.
 * Maintenance Log: 9/14 Done
 */

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console = new Scanner(System.in);
		System.out.println("Enter desired length: ");
		int desiredLength = console.nextInt();
		
		int a = 0, b = 1;
		for(int i = 0; i < desiredLength; i++)
		{
			System.out.println(b);
			int c = b;
			b = a + b;
			a = c;
		}
		
		console.close();
	}

}
