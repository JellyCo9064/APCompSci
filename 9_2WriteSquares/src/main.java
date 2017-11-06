/*
 * Author: Connor Aksama
 * Project Name: 9_2WriteSquares
 * File Name: main.java
 * Purpose: Recursion w/ helpers
 * Pseudocode: Pass n to initial method, pass nearest even value to helper method (keeps track of iterative number, and initial n value) Repass n - 2 if even, n +2 if odd. End Recursion if less than or equal to ni
 * Maintenance Log: 11/6 Done
 */
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		writeSquares(30);
	}
	public static void writeSquares(int n)
	{
		if (n <= 0)
		{
			System.out.println("Invalid");
			return;
		}
		if(n % 2 == 0)
		{
			writeSquares(n, n);
			return;
		}
		else
		{
			writeSquares(n - 1, n);
			return;
		}
	}
	private static void writeSquares(int nf, int ni)
	{
		if (nf < 1)
		{
			writeSquares(1, ni);
		}						
		else if(nf % 2 == 0)
		{
			writeSquares(nf - 2, ni);
			System.out.print(nf * nf);
			if (nf != ni && nf + 1 != ni)
			{
				System.out.print(", ");
			}
			else
			{
				return;
			}
		}
		else if(nf % 2 == 1)
		{
			if(nf <= ni)
			{
				writeSquares(nf + 2, ni);
				if (ni != 1)
				{
					System.out.print(nf * nf + ", ");
				}
				else
				{
					System.out.print(1);
				}
			}
			else
			{
				return;
			}
		}
	}
}
