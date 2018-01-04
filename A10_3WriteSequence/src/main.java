/*
 * Author: Connor Aksama
 * Project Name: A10_3WriteSequence
 * File Name: main.java
 * Purpose: Recurs
 * Pseudocode: Print num /2 or (/2 +1) before and after call
 * Maintenance Log:1/4 All Done
 */
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1; i <= 10; i++)
		{
			writeSequence(i);
			System.out.println();
		}
	}
	public static void writeSequence(int n)
	{
		if(n < 1)
		{
			throw new IllegalArgumentException("Value Less Than 1");
		}
		if(n == 1)
		{
			System.out.print(1 + " ");
		}
		else if (n != 0)
		{
			if (n % 2 == 1)
			{
				System.out.print(n / 2 + 1 + " ");
				writeSequence(n - 2);
				System.out.print(n / 2 + 1 + " ");
			}
			else
			{
				System.out.print(n / 2 + " ");
				writeSequence(n - 2);
				System.out.print(n / 2 + " ");
			}
			
		}
	}
}
