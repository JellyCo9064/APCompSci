/*
 * Author: Connor Aksama
 * Project Name: AP12_5StairString
 * File Name: main.java
 * Purpose: Substring
 * Pseudocode: Calculate length by division, add one to length if remainder is num - 1. Loop through string iterate by length, print out spaces == i, then substring
 * Maintenance Log: 2/22 Done
 */
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stairString("Vivek Patel", 12);
	}
	public static void stairString(String str, int num)
	{
		if (num == 0)
		{
			return;
		}
		int lines = 0;
		int length = str.length() / num;
		
		int rem = str.length() % num;
		if(rem == num - 1)
		{
			length++;
		}
		
		for(int i = 0; i < str.length(); i += length)
		{
			for(int j = 0; j < i; j++)
			{
				System.out.print(" ");
			}
			lines++;
			if(lines == num)
			{
				System.out.print(str.substring(i));
				break;
			}
			else
			{
				System.out.println(str.substring(i, i + length));
			}
		}
	}

}
