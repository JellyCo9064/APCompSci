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
		//writeSequence(0);
		
	}
	public static void writeSequence(int n)
	{
		if(n < 1)
		{
			throw new IllegalArgumentException("Value Less Than 1");
		}
		if(n == 1)
		{
			System.out.print(1 + " ");//Base Case
		}
		else if (n != 0)
		{
			if (n % 2 == 1)//Odd
			{

				System.out.print(n / 2 + 1 + " ");//Prints descending
				if(n - 2 != 0)
					writeSequence(n - 2);//Only "half" of sequence calculated
				System.out.print(n / 2 + 1 + " ");//Prints ascending
			}
			else//Even
			{
				System.out.print(n / 2 + " ");
				if(n - 2 != 0)
					writeSequence(n - 2);
				System.out.print(n / 2 + " ");
			}
			
		}
	}
}
