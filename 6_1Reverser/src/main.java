/*
 * Author: Connor Aksama
 * Project Name: 6_1Reverser
 * File Name: main.java
 * Purpose: ArrayList
 * Pseudocode: Get in line by line, for each line, get in words, add backwards, output results
 * Maintenance Log: 9/29 Done
 */
import java.util.*;
import java.io.*;
public class main {
	public static void main (String[] args) throws FileNotFoundException
	{
		Scanner console = new Scanner(System.in);
		System.out.println("Enter file name: ");
		String fileName = console.nextLine();
		
		console.close();
		
		Scanner file = null;
		try
		{
			file = new Scanner(new File(fileName));//get file
		}
		catch (FileNotFoundException e)
		{
			System.out.println("not found.");
		}
		
		PrintStream outputReversed = new PrintStream(new File("reversed.txt"));//create output file
		
		
		ArrayList<String> list = new ArrayList<String>();
		
		while(file.hasNextLine())
		{
			list.add(file.nextLine());//get in lines
		}
		
		ArrayList<String> reversedLines = new ArrayList<String>();
		
		for(int i = 0; i < list.size(); i++)//iterate backwards, add forwards to new arraylist
		{
			reversedLines.add(list.get(list.size() - 1 - i));
		}
		
		for(String s : reversedLines)//foreach element, use scanner, add words to arraylist
		{
			Scanner line = new Scanner(s);
			ArrayList<String> words = new ArrayList<String>();
			while (line.hasNext())
			{
				words.add(line.next());
			}
			String reversedOrder = "";
			for(int i = words.size() - 1; i >= 0; i--)//iterate backwards, add to string
			{
				reversedOrder += words.get(i);
				if (i != 0)
				{
					reversedOrder += " ";
				}
			}
			outputReversed.println(reversedOrder);//output string to file
		}
		System.out.println("Done.");
			
	}
}
