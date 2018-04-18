/*
 * Author: Connor Aksama
 * Project Name: AP14_3Anagrams
 * File Name: main.java
 * Purpose: Lots O Map
 * Pseudocode: Load words into list, sort by canonical form, load canonical forms into list. Load into map Key: canonical form Value: words with same canonical form. Given target by user -> access value in map
 * Maintenance Log: 4/18 done haha.
 */
import java.util.*;
import java.io.*;
public class main {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		List<String> dictionary = new ArrayList<String>();
		List<String> canonicalDictionary = new ArrayList<String>();
		
		loadDictionary(dictionary, canonicalDictionary);//Fill lists
		
		HashMap<String, Set<String>> canonicalToSet = new HashMap<String, Set<String>>();//Key: Canonical form of word Value: Set of words with Key as its canonical form
		
		String previous = "";
		for(int i = 0; i < dictionary.size(); i++)
		{
			if (!canonicalDictionary.get(i).equals(previous))//If new canonical form reached
			{
				previous = canonicalDictionary.get(i);
				canonicalToSet.put(previous, new HashSet<String>());//Add new Key
				canonicalToSet.get(previous).add(dictionary.get(i));//Add word to set
			}
			else//Canonical form exists
			{
				canonicalToSet.get(previous).add(dictionary.get(i));
			}
		}
		
		
		
		Scanner console = new Scanner(System.in);
		
		System.out.println("Enter String: ");
		String target = console.nextLine();
		Set<String> words = canonicalToSet.get(findCanonical(target));//Access Set Value
		if(words.size() != 1)
		{
			for(String s : words)
			{
				if(!s.equals(target))
				{
					System.out.println(s);//Print words
				}
			}
		}
		else
		{
			System.out.println("No anagrams found. RIP");
		}

	}
	public static void loadDictionary(List<String> dictionary, List<String> canonicalDictionary) 
	{
		Scanner file = null;//Load file
		try
		{
			file = new Scanner(new File("dictionary.txt"));
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File Not Found");
		}
		while(file.hasNextLine())
		{
			String line = file.nextLine();//Add words to list
			dictionary.add(line);
			canonicalDictionary.add(findCanonical(line));
		}
		Collections.sort(dictionary, new COMPARE_CANONICAL());//Sort by canonical form
		Collections.sort(canonicalDictionary);
	}
	public static String findCanonical(String str)
	{
		char[] charray = str.toCharArray();//Sorts characters
		Arrays.sort(charray);
		return new String(charray);
	}
}
