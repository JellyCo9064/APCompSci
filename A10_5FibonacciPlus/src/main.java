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
		fibonacci(50);
	}
	public static void fibonacci(int n)//"Gatekeeper"
	{
		if(n < 1)
		{
			throw new IllegalArgumentException("Value less than 1");
		}
		System.out.print("1");
		if(n > 1)
		{
			fibonacci(n, 0, 0, 1);//Call Real Recursion
		}
	}
	public static void fibonacci(int n, int currentN, int prev1, int prev2)//Handles Recursion
	{
		System.out.print(", " + (prev1 + prev2));//Prints next fibonacci number
		if(currentN < n - 2)//Acts similarly to condition in for loop
		{
			fibonacci(n, ++currentN, prev2, prev1 + prev2);//Recursion
		}
	}
}
