/*
 * Author: Connor Aksama
 * Project Name: 7_3EvenAnnihilation
 * File Name: main.java
 * Purpose: Sets...
 * Pseudocode: Get in strings into set from file, iterate through passed set, remove even lengths, return set.
 * Maintenance Log: 10/18 Done
 */
import java.util.*;
import java.io.*;
public class main {

	public static void main(String[] args) throws FileNotFoundException{
		// TODO Auto-generated method stub
		Scanner console = new Scanner(System.in);
		System.out.println("Enter file name: ");
		String fileName = console.nextLine();//Get in file name
		
		Scanner file = null;
		try
		{
			file = new Scanner(new File(fileName));//Init file using scanner and file constructs.
		}
		catch (FileNotFoundException e)
		{
			System.out.println("File not found");
		}
		
		Set<String> strings = new HashSet<String>();
		while(file.hasNext())//Add to set from file
		{
			strings.add(file.next());
		}
		
		System.out.println();
		for(String s : strings)//print out original strings
		{
			System.out.print(s + ", ");
		}
				
		strings = removeEvenLength(strings);
		
		System.out.println();
		for (String s : strings)//print out edited set
		{
			System.out.print(s + ", ");
		}
		
		console.close();
	}
	
	public static Set<String> removeEvenLength(Set<String> set)
	{
		Iterator<String> itr = set.iterator();
		
		while(itr.hasNext())
		{
			String check = itr.next();//get in string
			if (check.length() % 2 == 0)//check for length
			{
				itr.remove();//remove most previous next
			}
		}
		
		return set;
	}
}
