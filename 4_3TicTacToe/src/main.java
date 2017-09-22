/*
 * Author: Connor Aksama
 * Project Name: 4_3TicTacToe
 * File Name: main.java
 * Purpose: Deal with arrays and checking
 * Pseudocode: 
 * Maintenance Log: 9/22 printing out board
 */
import java.util.*;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[][] board = new boolean[3][3]; //True = x false = o
		printBoard(board);
	}
	
	public static void printBoard(boolean[][] board)
	{
		int thirth = 0;
		for (int i = 0; i < 3; i++)
		{				
			if (i % 3 == 0)//print top sub-border
			{
				System.out.println("   |   |   ");
			}
			if (i % 3 == 1)//print letters w/ spaces
			{
				for (int j = 0; j < 3; j++)
				{
					System.out.print(" ");
					if (board[i][j])
					{
						System.out.print("x ");
					}
					else
					{
						System.out.print("o ");
					}
					if (j != 2)
					{
						System.out.print("|");
					}
				}
			}
			if (i % 3 == 2)//print bottom sub divider
			{
				if (thirth != 2)
				{
					System.out.println("___|___|___");
			
				}
			}
			thirth++;	
			
		}
		
		
		
		
		
		
		
		
		System.out.println("   |   |   ");
		System.out.println(" ");
		if (board[0][0])
			System.out.print("x |");
		System.out.println("___|___|___");
		System.out.println("   |   |   ");
		System.out.println("   |   |   ");
		System.out.println("___|___|___");
		System.out.println("   |   |   ");
		System.out.println("   |   |   ");
		System.out.println("   |   |   ");
	}

}
