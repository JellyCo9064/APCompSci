/*
 * Author: Connor Aksama
 * Project Name: 7_4Unique
 * File Name: main.java
 * Purpose: Maps
 * Pseudocode: Initialize map, pass to fn, add values to set, compare length of values to length of set
 * Maintenance Log: 10/19 Done
 */
import java.util.*;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("1", "Moo");//Add Key/Value Pairs
		map.put("2", "Mee");
		map.put("3", "Foof");
		map.put("4", "Moo");
		
		
		System.out.println(isUnique(map));//Outputs false

	}
	public static boolean isUnique(HashMap<String, String> map)
	{	
		Set<String> duplicates = new HashSet<String>();
		for(String s : map.values())
		{
			duplicates.add(s);//Add values to set
		}
		return duplicates.size() == map.size();//If set length is different from map length, then duplicates exist
	}
}
