/*
 * Author: Connor Aksama
 * Project Name: A10_4SumTo
 * File Name: main.java
 * Purpose: Recurs
 * Pseudocode: Pass index - 1, return sum of inverse index plus return of recursion
 * Maintenance Log: 1/11 Done
 */
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sumTo(50));
	}
	public static float sumTo(int n)
	{
		if (n == 0)
		{
			return 0.0f;
		}
		if (n < 0)
		{
			throw new IllegalArgumentException("Number Less Than Zero");
		}	
		if(n == 1)
		{
			return 1.0f;
		}
		else
		{
			return (1 / (float)n) + sumTo(n - 1);//return inverse, plus one less inverse
		}
	}

}
