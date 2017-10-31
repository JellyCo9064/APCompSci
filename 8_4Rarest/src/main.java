/*
 * Author: Connor Aksama
 * Project Name: 8_4Rarest
 * File Name: main.java
 * Purpose: Maps
 * Pseudocode: Init map with String, Ints, send to function. 
 */
import java.util.*;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> keyValues = new HashMap<String, Integer>();
		keyValues.put("MOO", 5);
		keyValues.put("Mee", 5);
		keyValues.put("Foof", 3);
		keyValues.put("Vivek", 3);
		keyValues.put("WATSA", 3);
		
		System.out.println("Rarest Key: " + rarest(keyValues));
	}
	public static int rarest(Map<String, Integer> map)
	{
		//recordKeeper keeps track of the number of times a certain value (the key in record keeper, and the value in map) occurs in the map map
		Map<Integer, Integer> recordKeeper = new HashMap<Integer, Integer>();
		for(String s : map.keySet())//iterate through map key set
		{
			if(recordKeeper.containsKey(map.get(s)))
			{
				//if recordKeeper has already counted the value, re-put the value to recordKeeper as a key, and re-put the same value plus one 
				recordKeeper.put(map.get(s), recordKeeper.get(map.get(s)) + 1);
			}
			else
			{
				recordKeeper.put(map.get(s), 1);//if recordKeeper 
			}
		}
		int minOccurences = Integer.MAX_VALUE;
		int minOccurencesValue = Integer.MAX_VALUE;
		for(Integer i : recordKeeper.keySet())//Iterate through values of map, keys of recordKeeper
		{
			if (recordKeeper.get(i) < minOccurences)//If a value occurs less than previously stored, reassign returnable value, and occurrence
			{
				minOccurences = recordKeeper.get(i).intValue();
				minOccurencesValue = i.intValue();
			}
			if (recordKeeper.get(i) == minOccurences)//If value occurs an equal amount as the previously stored minOccur, assign smaller value
			{
				minOccurencesValue = (i.intValue() < minOccurencesValue) ? i.intValue() : minOccurencesValue;
			}
		}
		
		return minOccurencesValue;
	}
}
