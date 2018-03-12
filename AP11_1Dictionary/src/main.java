/*
 * Author: Connor Aksama
 * Project Name: AP11_1Dictionary
 * File Name: main.java
 * Purpose: Sort and Search
 * Pseudocode: Read in file, implement collection.sort and collection.binarysearch, subtract indexes
 * Maintenance Log: 1/31 Done (lol jk) 2/7 Implemented binary search
 */
import java.util.*;
import java.io.*;
public class main {

	public static void main(String[] args) throws FileNotFoundException{
		// TODO Auto-generated method stub
		Scanner console = new Scanner(System.in);
		Scanner file = null;//Read in File
		try
		{
			file = new Scanner(new File("dictionary.txt"));
		}
		catch (FileNotFoundException e)
		{
			System.out.println("Not Found");
		}
		List<String> dictionary = new ArrayList<String>();
		while(file.hasNextLine())//Add lines to list
		{
			dictionary.add(file.nextLine());
		}
		Collections.sort(dictionary, String.CASE_INSENSITIVE_ORDER);//Sort
		System.out.println("Enter first word: ");//Get in bounds
		String first = console.nextLine();
		System.out.println("Enter second word: ");
		String second = console.nextLine();
		
		int firstIndex = binarySearch(dictionary, first);//Search for words
		
		int secondIndex = binarySearch(dictionary, second);
		
		if (firstIndex < 0)//Not found
		{
			System.out.println("First word not found");
		}
		if (secondIndex < 0)
		{
			System.out.println("Second word not found");
		}
		if(secondIndex >= 0 && firstIndex >= 0)//Print number of words (exclusive)
		{			
			if (firstIndex == secondIndex)
			{
				System.out.println("There are 0 between " + first + " and " + second);
			}
			else if(Math.abs(firstIndex - secondIndex) == 1)
			{
				System.out.println("There is 1 between " + first + " and " + second);
			}
			else
			{
				System.out.println("There are " + (Math.abs(secondIndex - firstIndex) - 1) + " between " + first + " and " + second);
			}
		}
		console.close();
	}
	public static int binarySearch(List<String> dictionary, String target)
	{
		if(dictionary.size() <= 1)
		{
			if(dictionary.get(0).compareToIgnoreCase(target) == 0)
				return 0;//Word Found
			else
				throw new IllegalArgumentException("Word Not Found");
		}
		int compare = dictionary.get(dictionary.size() / 2).compareToIgnoreCase(target);
		if(compare < 0)//Target comes after partition
		{
			return (int)Math.ceil((double)dictionary.size() / 2) + binarySearch(dictionary.subList(dictionary.size() / 2 + 1, dictionary.size()), target);
			//Return number of indexes before partition, recursion with sub list
		}
		else if(compare > 0)
		{
			return binarySearch(dictionary.subList(0, dictionary.size() / 2), target);
			//recursion with sub list
		}
		else
		{
			return (int)(dictionary.size() / 2);
			//Index of target found
		}
		

	}

}
