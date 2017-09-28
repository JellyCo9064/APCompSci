/*
 * Author: Connor Aksama
 * Project Name: 3_2IntRange
 * File Name: main.java
 * Purpose: Use ifs and loops.
 * Pseudocode: Get numbs, check, loop, print.
 * Maintenance Log: 9/13 Done.
 */
import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console = new Scanner(System.in);
		System.out.println("Enter first range number: ");
		int a = console.nextInt();
		System.out.println("Enter second range number: ");
		int b = console.nextInt();
		
		printRange(a, b);
		
		console.close();
		
	}
	
	public static void printRange(int a, int b)
	{
		if (a < b)
		{
			System.out.print("[");
			for (int i = a; i <= b; i++)
			{
				System.out.print(i);
				if (i != b)
				{
					System.out.print(", ");
				}
			}
			System.out.print("]");
		}
		else if (a > b)
		{
			System.out.print("[");
			for (int i = a; i >= b; i--)
			{
				System.out.print(i);
				if (i != b)
				{
					System.out.print(", ");
				}
			}
			System.out.print("]\n");
		}
		else
		{
			System.out.println("[" + a + "]");
		}
	}

}
