/*
 * Author: Connor Aksama
 * Project Name: AP14_2Palindrome
 * File Name: main.java
 * Purpose: Recursion
 * Pseudocode: Check one char at a time, pass remainder of string
 * Maintenance Log: 4/5 All Done
 */
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isReverse("Hello", "olleH"));
		System.out.println(isReverse("Vivek", "Patel"));
		System.out.println(isReverse("V", "v"));
		System.out.println(isReverse("Moo", "ooM"));
		System.out.println(isReverse("oooooM", "Moooo"));
		System.out.println(isReverse("vivEk", "KeVIQ"));
		System.out.println(isReverse("", "Vivek"));
		System.out.println(isReverse("", ""));
		System.out.println(isReverse("racecar", "rAcECaR"));
	}
	
	public static boolean isReverse(String one, String two)
	{
		one = one.toLowerCase();
		two = two.toLowerCase();
		if(one.length() != two.length())//Different Lengths
		{
			return false;
		}
		else
		{
			if(one.length() > 1)
			{
						//Check outside characters										Call Function with inner string
				return one.substring(0, 1).equals(two.substring(two.length() - 1)) && isReverse(one.substring(1), two.substring(0, two.length() - 1));
			}
			else
			{
				return one.equals(two);//Check character
			}
		}
	}
}
