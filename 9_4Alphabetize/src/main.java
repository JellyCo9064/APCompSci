/*
 * Author: Connor Aksama
 * Project Name: 9_4Alphabetize
 * File Name: main.java
 * Purpose: Merge Sort
 * Pseudocode: Pass list of lists to function, in pairs, compare items of sublists and merge pairs into larger lists. Continue until master list contains only one list
 * Maintenance Log: 11/8 Base structure 11/9 Debugging, all done
 */
import java.util.*;
import java.io.*;
public class main {

	public static void main(String[] args) throws FileNotFoundException{
		// TODO Auto-generated method stub
		List<List<String>> moo = new ArrayList<List<String>>();
		
		Scanner console = new Scanner(System.in);//Get in file
		String fileName = console.nextLine();
		Scanner file = null;
		try
		{
			file = new Scanner(new File(fileName));
		}
		catch (FileNotFoundException e)
		{
			System.out.println("Not Found");
		}
		
		while(file.hasNextLine())
		{
			List<String> list = new ArrayList<String>();
			list.add(file.nextLine());//Add each line as one list to moo list
			moo.add(list);			
		}
		
		moo = sort(moo);
		
		PrintStream newFile = new PrintStream(new File("sorted"));//Print lines to file
		for(List<String> l : moo)
		{
			for(String s : l)
			{
				newFile.println(s);
			}
		}
		console.close();
		System.out.println("Done");
	}
	public static List<List<String>> sort(List<List<String>> lists)
	{
		if (lists.size() == 1)//base case
		{
			return lists;
		}
		
		List<List<String>> passable = new ArrayList<List<String>>();
		
		for(int i = 0; i < lists.size() - 1; i += 2)//Iterate through list in pairs
		{
			List<String> merged = new ArrayList<String>();
			List<String> leftList = lists.get(i);
			List<String> rightList = lists.get(i + 1);
label:			
			while(leftList.size() > 0 || rightList.size() > 0)//Iterate through lists one by one
			{
				if (leftList.size() == 0 && rightList.size() > 0)//uneven list sizes
				{
					merged.add(rightList.get(0));
					rightList.remove(0);
					continue label;
				}
				if(rightList.size() == 0 && leftList.size() > 0)
				{
					merged.add(leftList.get(0));
					leftList.remove(0);
					continue label;
				}
				
				if(leftList.get(0).compareToIgnoreCase(rightList.get(0)) < 0)
				{
					merged.add(leftList.get(0));//Adds items to combined sub list
					leftList.remove(0);//"Iterates" through sub lists
				}
				else
				{
					merged.add(rightList.get(0));
					rightList.remove(0);
				}
			}
			passable.add(merged);//Adds merged lists to master list
		}
		if (lists.size() % 2 == 1)//No merge partner exists
		{
			passable.add(lists.get(lists.size() - 1));
		}
		
		return sort(passable);//Recursion						
	}
}
