/*
 * Author: Connor Aksama
 * Project Name: 9_1Ribonacci
 * File Name: main.java
 * Purpose: Recursion!
 * Pseudocode: Return sum of function return value with n = n-1 and n = n-2. Add applicable numbers to list
 * Maintenance Log: 11/1 Done
 */
import java.util.*;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console = new Scanner(System.in);
		List<Integer> output = new ArrayList<Integer>();//Use to catch final values
		
		System.out.println("Enter Desired Number of Fibonacci Sequence: ");
		fibonacci(console.nextInt(), output);
		for(Integer i : output)
		{
			System.out.println(i);
		}
		console.close();
	}
	public static int fibonacci(int n, List<Integer> output)
	{
		int sum = 0;
		if(n > 0)
		{
			sum += fibonacci(n - 1, output) + fibonacci(n - 2, output);//adds the previous two terms
			if (sum > output.get(output.size() - 1))//Adds to list, only if the next item is found
			{
				output.add(sum);
			}
		}
		else
		{
			if (output.size() < 2)
			{
				output.add(1);
			}
			return 1;
		}
		
		return sum;
	}
}
