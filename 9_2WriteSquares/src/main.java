/*
 * Author: Connor Aksama
 * Project Name: 9_2WriteSquares
 * File Name: main.java
 * Purpose: Recursion w/ helpers
 * Pseudocode: Pass n - 1 to subsequent methods, print out before calling function if even, print out after calling function if odd
 * Maintenance Log: 11/6 Done? 11/8 DONE!!!
 */
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		writeSquares(30);
	}
	public static void writeSquares(int n)//Method with Singular parameter for user ease.
	{
		if (n == 1)//base case
		{
			System.out.print("1, ");
			return;
		}
		if (n % 2 == 0)
		{
			System.out.print(n * n + ", ");//Prints out even squares before recursing. Allows for intermittent printing while functions are stacking up
			writeSquares(n - 1);
		}
		else
		{
			writeSquares(n - 1);//Printing has to wait until base case is reached
			System.out.print(n * n + ", ");
		}
		
	}
}
