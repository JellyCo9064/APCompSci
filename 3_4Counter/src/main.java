/*
 * Author: Connor Aksama
 * Project Name: 3_4Counter
 * File Name: main.java
 * Purpose: Read files, check characters.
 * Pseudocode: Read file line by line, scan each line
 * Maintenance Log: 9/13 Began reading. 9/14 done
 */
import java.io.*;
import java.util.Scanner;

public class main 
{

	public static void main(String[] args) 
			throws FileNotFoundException 
	{
		// TODO Auto-generated method stub
		
		
			Scanner console = new Scanner(System.in);
			System.out.println("Enter file name: ");
			String fileName = console.nextLine();
			Scanner file = null;
			try
			{
				file = new Scanner(new File(fileName));
			}
			catch(FileNotFoundException e)
			{
				System.out.println("no");
			}
			int characters = 0;
			int lines = 0;
			int words = 0;
			
			while (file.hasNextLine())
			{
				String test = file.nextLine();
				lines++;
				characters += test.length();
				Scanner retest = new Scanner(test);
				while (retest.hasNext())
				{
					words++;
					retest.next();
				}
				retest.close();
			}
			file.close();
			System.out.println("Characters: " + characters);
			System.out.println("Lines: " + lines);
			System.out.println("Words: " + words);
	}

}
