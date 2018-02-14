/*
 * Author: Connor Aksama
 * Project Name: A10_5FibonacciPlus
 * File Name: main.java
 * Purpose: Recursz
 * Pseudocode: Call helper recursion method, iterate value from 1 to n recursively, finding fibonacci numbers
 * Maintenance Log: 2/5 Done. (lol)
 */
import java.util.*;
public class main {
	public static void main(String[] args)
	{
		for (int i = 1; i < 50; i++)
		{
			System.out.println(fibonacci(i));
		}

	}
	public static int fibonacci(int n)//"Gatekeeper"
	{
		if(n < 1)
		{
			throw new IllegalArgumentException("Value less than 1");
		}
		if(n > 1)
		{
			return fibonacci(n, 0, 0, 1);//Call Real Recursion
		}
		else
		{
			return 1;
		}
	}
	public static int fibonacci(int n, int currentN, int prev1, int prev2)//Handles Recursion
	{
		//System.out.print(", " + (prev1 + prev2));//Prints next fibonacci number
		if(currentN < n - 2)//Acts similarly to condition in for loop
		{
			return fibonacci(n, ++currentN, prev2, prev1 + prev2);//Recursion
		}
		return prev2 + prev1;//Return final number
	}
}
