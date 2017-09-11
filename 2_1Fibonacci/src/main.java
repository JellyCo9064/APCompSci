/*
 * Author: Connor Aksama
 * Project Name: 2_1Fibonacci
 * File Name: main.java
 * Pseudocode: Use recursive function, pass new sum, and prev. num
 * Maintenance Log: 9/11 Done
 */

import java.util.Scanner;

public class main {
	
	public static void main(String[] args)
	{
		Scanner inNum = new Scanner(System.in);
		
		int desiredCount = inNum.nextInt();
		
		fibonacci(0, 1, 0, desiredCount);
		
		inNum.close();
	}
	
	public static int fibonacci(int a, int b, int counter, int desiredCount)
	{
		System.out.println(b);
		counter++;
		if (counter == desiredCount)
		{
			return 0;
		}
		
		fibonacci(b, a + b, counter, desiredCount);

		
		return 0;
	}
	
}
