/*
 * Author: Connor Aksama
 * Project Name: AP11_1Dictionary
 * File Name: main.java
 * Purpose: Sort and Search
 * Pseudocode: Read in file, implement collection.sort and collection.binarysearch, subtract indexes
 * Maintenance Log: 1/31 Done
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
		
		int firstIndex = Collections.binarySearch(dictionary, first, String.CASE_INSENSITIVE_ORDER);//Search for words
		
		int secondIndex = Collections.binarySearch(dictionary, second, String.CASE_INSENSITIVE_ORDER);
		
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
			System.out.println("There are " + (Math.abs(secondIndex - firstIndex) - 1) + " between " + first + " and " + second);
		}
		console.close();
	}

}
