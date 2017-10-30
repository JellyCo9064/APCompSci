/*
 * Author: Connor Aksama
 * Project Name: 8_2CountUnique
 * File Name: main.java
 * Purpose: Sets
 * Pseudocode: Add random ints to list, pass list to fn, add elements to set, return set length
 * Maintenance Log: 10/30 Done
 */
import java.util.*;
public class main {
	public static void main(String[] args)
	{
		List<Integer> listy = new ArrayList<Integer>();
		Random r = new Random();
		for(int i = 0; i < 15; i++)
		{
			listy.add(r.nextInt(5));//Initialize List
		}
		for(Integer i : listy)
		{
			System.out.print(i + ", ");//Print out values
		}
		
		int count = countUnique(listy);//Pass list to function
		
		System.out.println("\nUnique Count: " + count);//Print unique count
	}
	
	public static int countUnique(List<Integer> ints)
	{
		Set<Integer> unique = new HashSet<Integer>();
		for(Integer s : ints)
		{
			unique.add(s);//Add list elements to set
		}
		return unique.size();//Send back number of unique elements
	}
}
