/*
 * Author: Connor Aksama
 * Project Name: A10_1StarString
 * File Name: main.java
 * Purpose: Recurz
 * Pseudocode: Use recursion, print out stars equal to one power less
 * Maintenance Log: 12/15 Done
 */
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		starString(5);
		
	}
	public static void starString(int n)
	{
		if(n > 0)//2^n = 2^(n-1) * 2
		{
			starString(n - 1);
			starString(n - 1);
		}
		else
		{
			System.out.print("*");//Base Case
		}
	}
}
