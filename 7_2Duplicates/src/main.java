/*
 * Author: Connor Aksama
 * Project Name: 7_2Duplicates
 * File Name: main.java
 * Purpose: Sets
 * Pseudocode: Init list, pass to fn, add to sorted set. Cast back to list and return
 * Maintenance Log: 10/18 Done
 */
import java.util.*;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<Integer>();
		int[] unsortedA = {7, 4, -9, 4, 15, 8, 27, 7, 11, -5, 32, -9, -9};
		for(int i : unsortedA)//Add values to list from array
		{
			list.add(i);
		}
		
		list = sortAndRemoveDuplicates(list);
		
		System.out.println("Main List: ");//print out values
		for(Integer i : list)
		{
			System.out.print(i + ", ");
		}
	}
	public static List<Integer> sortAndRemoveDuplicates(List<Integer> list)//take in list
	{
		SortedSet<Integer> sorted = new TreeSet<Integer>();//Auto sorts values
		
		Iterator<Integer> itr = list.iterator();
		while (itr.hasNext()){//Iterate through list, add to sorted set
			sorted.add(itr.next());
		}

		return Arrays.asList(sorted.toArray(new Integer[0]));//send back (set -> array -> list)
		
	}
}
