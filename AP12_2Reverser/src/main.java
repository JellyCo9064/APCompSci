/*
 * Author: Connor Aksama
 * Project Name: AP12_2Reverser
 * File Name: main.java
 * Purpose: Strrrings
 * Pseudocode: Loop backwards
 * Maintenance Log: 2/15 Done
 */
import java.util.*;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printReverse("Vivek Patel");
		printReverse("Patel Vivek");
		printReverse("");
	}
	public static void printReverse(String s)
	{
		if (s.length() != 0)
		{
			for(int i = s.length() - 1; i >= 0; i--)
			{
				System.out.print(s.charAt(i));
			}
			System.out.println();
		}
	}

}
