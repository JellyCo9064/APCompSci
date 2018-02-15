/*
 * Author: Connor Aksama
 * Project Name: AP12_1Padding
 * File Name: main.java
 * Purpose: Strrrings
 * Pseudocode: Find difference, loop and concat spaces
 * Maintenance Log: 2/15 Done
 */
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(padString("Hello", 10) + ";");
		System.out.println(padString("Vivek Patel", 10) + ";");
	}
	public static String padString(String s, int n)
	{
		if (s.length() >= n)
		{
			return s;
		}
		else
		{
			int q = s.length();
			for(int i = 0; i < (n - q); i++)
			{
				s = s.concat(" ");
			}
			return s;
		}
	}

}
