/*
 * Author: Connor Aksama
 * Project Name: 8_3MaxLength
 * File Name: main.java
 * Purpose: Sets?
 * Pseudocode: Get in file, add strings to Set, pass set to function, iterate through set, check against stored max length, return max length
 * Maintenance Log: 10/30 Done
 */
import java.util.*;
import java.io.*;
public class main {

	public static void main(String[] args) throws FileNotFoundException{
		// TODO Auto-generated method stub
		Scanner console = new Scanner(System.in);
		System.out.println("Enter File Name: ");
		String fileName = console.nextLine();//Get in file name
		
		Scanner file = null;
		try
		{
			file = new Scanner(new File(fileName));//Initialize File
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File Not Found");
		}
		
		Set<String> fileStrings = new HashSet<String>();
		while(file.hasNext())//Iterate through file
		{
			fileStrings.add(file.next());//Add strings to set
		}
		System.out.println("Max String Length: " + maxLength(fileStrings));//Pass set to function, print out max length
		
		console.close();
		
	}
	public static int maxLength(Set<String> strings)
	{
		if(strings.size() == 0)
		{
			return 0;
		}
		int max = 0;
		for(String s : strings)//Iterate through set
		{
			if (s.length() > max)//Check if greater than current max
			{
				max = s.length();//Reassign
			}
		}
		return max;
	}
}
