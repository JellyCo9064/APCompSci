/*
 * Author: Connor Aksama
 * Project Name: AP12_4SubStrings
 * File Name: main.java
 * Purpose: Substrings
 * Pseudocode: Pass string and value, loop through string, iterating by max value, print out sub string from current index to ind+max
 * Maintenance Log: 2/22 Done
 */
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		subStringer("VivekPatel.exe", 3);
	}
	public static void subStringer(String str, int max)
	{
		for(int i = 0; i < str.length(); i += max)
		{
			if(i + max > str.length())
			{
				System.out.println(str.substring(i));
				break;
			}
			System.out.println(str.substring(i, i + max));
		}
	}

}
