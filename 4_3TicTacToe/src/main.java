/*
 * Author: Connor Aksama
 * Project Name: 4_3TicTacToe
 * File Name: main.java
 * Purpose: Deal with arrays and checking
 * Pseudocode: Get input, add 2 2D array, check array by row, column, diagz.
 * Maintenance Log: 9/22 printing out board 9/25 Input and checking 9/27 Done
 */
import java.util.*;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] board = new int[3][3]; //1 = x 2 = o 0 = empty

		
		Scanner console = new Scanner(System.in);
		
		boolean turn = true;//True = x turn False = o turn
		boolean done = false;
		printBoard(board);
label:
		while (!done)
		{
			if (turn)
			{
				System.out.print("x ");
			}
			else
			{
				System.out.print("o ");
			}
			System.out.print("turn. Enter Grid Coordinate <Number, Letter> (no brackets)");
			String move = console.nextLine();
			move.toLowerCase();
			if (move.charAt(0) < 48 || move.charAt(0) > 50 || move.charAt(1) < 97 || move.charAt(1) > 99 || move.length() > 2)
			{
				System.out.println("Invalid.");
				continue label;
			}
			int horizontalPos = move.charAt(1) - 97; //0 Left most, 2 right most
			int verticalPos = move.charAt(0) - 48; //0 top most, 2 bottom most

			if (board[verticalPos][horizontalPos] == 0)
			{
				board[verticalPos][horizontalPos] = (turn) ? 1 : 2;
			}
			else
			{
				System.out.println("Invalid.");
				continue label;
			}
			printBoard(board);
				
			turn = !turn;
			done = checkIfWin(board);
			if (done)
			{
				System.out.println("Win");
			}
		}
		
	}

	public static void printBoard(int[][] board)
	{
		System.out.println("  a     b     c  ");
		int thirth = 0;
		for (int k = 0; k < 3; k++)
		{
			for (int i = 0; i < 3; i++)
			{				
				if (i == 0)//print top sub-border
				{
					System.out.println("      |     |     ");
				}
				if (i == 1)//print letters w/ spaces
				{
					System.out.print(k);
					for (int j = 0; j < 3; j++)
					{
						System.out.print("  ");
						if (board[k][j] == 1)
						{
							System.out.print("x  ");
						}
						else if (board[k][j] == 2)
						{
							System.out.print("o  ");
						}
						else
						{
							System.out.print("   ");
						}
						if (j != 2)
						{
							System.out.print("|");
						}
					}
					System.out.println();
				}
				if (i == 2)//print bottom sub divider
				{
					if (thirth != 2)
					{
						System.out.println(" _____|_____|_____");
					}
					else
					{
						System.out.println("      |     |     ");
					}
					thirth++;
				}
			}
		}
	}
	public static boolean checkIfWin(int[][]board)
	{	
		for(int i = 0; i < 3; i++)//check Rows
		{
			boolean win = true;
			int activeNum = board[i][0];
			win = true;
			for (int j = 0; j < 3; j++)
			{
				if (board[i][j] == 0 || board[i][j] != activeNum)
				{
					win = false;
					break;
				}
				if (win && j == 2)
				{
					return true;
				}
			}
		}

		for(int i = 0; i < 3; i++)//check columns
		{
			boolean win = true;
			int activeNum = board[0][i];
			for (int j = 0; j < 3; j++)
			{
				if (board[j][i] == 0 || board[j][i] != activeNum)
				{
					win = false;
					break;
				}
				if (win && j == 2)
				{
					return true;
				}
			}
		}
		
		boolean winner = true;
		for(int i = 0; i < 3; i++)//check y = -x line
		{
			int activeNum = board[0][0];
			if (board[i][i] == 0 || board[i][i] != activeNum)
			{
				winner = false;
			}
		}
		if (winner)
		{
			return true;
		}
		winner = true;
		for(int i = 2; i >= 0; i--)//check y = -x line
		{
			int activeNum = board[2][0];
			if (board[i][2 - i] == 0 || board[i][2 - i] != activeNum)
			{
				winner = false;
			}
		}	
		if (winner)
		{
			return true;
		}
		
		return false;
		
	}
}
