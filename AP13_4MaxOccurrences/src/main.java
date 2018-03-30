/*
 * Author: Connor Aksama
 * Project Name: AP13_4MaxOccurences
 * File Name: main.java
 * Purpose: I'm the map, I'm the map, I'm the maaaaaap!
 * Pseudocode: Loop through list, add to map with value of one if not yet added, if already added, update with count + 1
 * Maintenance Log: 3/15 Done
 */
import java.util.*;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myArray = {1, 2, 3, 4, 5, 3, 2, 4, 24, 2, 1, 23, 2, 2, 2, 2, 2, 2, 4, 4, 4, 3, 2, 2, 1, 2, 3, 4, 5, 23, 3, 6, 7, 7, 7, 76,5 ,4 , 24, 6, 4};
		List<Integer> myList = new ArrayList<Integer>();
		for(int i : myArray)//Add values to list
		{
			myList.add(i);
		}
		System.out.println(maxOccurrences(myList));//Print value
		
	}
	
	public static int maxOccurrences(List<Integer> myInts)
	{
		if (myInts.size() <= 0)//empty list
		{
			return 0;
		}
		Map<Integer, Integer> countOccurrences = new TreeMap<Integer, Integer>();//create map
		for(Integer i : myInts)//Loop through list
		{
			if (countOccurrences.containsKey(i))//If value has already been added to map
			{
				countOccurrences.put(i, countOccurrences.get(i) + 1);//Re-Add with same key, and previous value + 1
			}
			else
			{
				countOccurrences.put(i, 1);//Value has not been added to map, add to map with value of 1
			}
		}
		int max = -1;
		for(Integer i : countOccurrences.values())//Find max value
		{
			if (i.intValue() > max)
			{
				max = i.intValue();
			}
		}
		return max;
	}

}
