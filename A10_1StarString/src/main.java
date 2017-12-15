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
		for(int i = 0; i < Math.pow(2, n - 1); i++)//First difference of exponential graph
		{
			System.out.print("*");	
		}
		if(n > 0)
		{
			starString(n - 1);//Recursion
		}
		//"base case"
	}
}
