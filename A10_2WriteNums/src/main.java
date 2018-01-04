/*
 * Author: Connor Aksama
 * Project Name: A10_2WriteNums
 * File Name: main.java
 * Purpose: Recurs
 * Pseudocode: Pass number, call self with n - 1 then print num with comma before.
 * Maintenance Log:1/4 All Done
 */
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		writeNums(7);
		System.out.println();
	}
	public static void writeNums(int n)
	{
		if(n < 1)
		{
			throw new IllegalArgumentException("Value Less Than 1");
		}
		if(n == 1)
		{
			System.out.print(1);
		}
		else
		{
			writeNums(n - 1);
			System.out.print(", " + n);
		}
	}

}
