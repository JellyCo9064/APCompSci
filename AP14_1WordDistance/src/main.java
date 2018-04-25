/*
 * Author: Connor Aksama
 * Project Name: AP14_1WordDistance
 * File Name: main.java
 * Purpose: Maps?
 * Pseudocode: wubabababubuabuaubaubauba
 * Maintenance Log: 4/19 Done
 */
import java.util.*;
import java.io.*;
public class main {

	public static void main(String[] args) throws FileNotFoundException{
		// TODO Auto-generated method stub
		Scanner console = new Scanner(System.in);
		System.out.println("Enter first word: ");
		String one = console.nextLine();
		System.out.println("Enter second word: ");
		String two = console.nextLine();
		
		Map<String, Set<String>> wordMap = new HashMap<String, Set<String>>();
		Set<String> words = new HashSet<String>();

		int editDistance = 0;

		if(one.length() != two.length())
		{
			System.out.println("Word Lengths Do Not Match");
		}
		loadDictionary(words, one.length());//Load Dictionary
		boolean isWord = true;
		if(!words.contains(one))//Check if valid word
		{
			System.out.println(one + " is not a word.");
			isWord = false;
		}
		if(!words.contains(two))
		{
			System.out.println(two + " is not a word.");
			isWord = false;
		}
		boolean path = true;
		if(isWord && !one.equals(two))
		{
			editDistance = 1;
			constructMap(wordMap, words);//Load Map
			Set<String> searchList = new HashSet<String>();//Current set of words to be searched
			Set<String> superSet = new HashSet<String>();//Set of all words searched
			searchList.addAll(wordMap.get(one));//Add words with distance of one from target word
			superSet.addAll(wordMap.get(one));
			for(int i = 0; i < 10000; i++)
			{
				if(searchList.contains(two))//Edit distance of 1
				{
					break;
				}
				Set<String> toAdd = new HashSet<String>();//Words to add to searchList
				for(String s : searchList)
				{
					toAdd.addAll(wordMap.get(s));
				}
				searchList.clear();
				searchList.addAll(toAdd);
				if(superSet.containsAll(searchList))//All words to be searched have already been searched -> no path
				{
					path = false;
					break;
				}
				superSet.addAll(toAdd);
				editDistance++;
			}
		}
		if (path)
		{
			System.out.println("Edit Distance Of: " + editDistance);
		}
		else
		{
			System.out.println("Path not found....");
		}
		
	}
	public static void loadDictionary(Set<String> words, int wordLength)
	{
		Scanner file = null;
		try
		{
			file = new Scanner(new File("dictionary.txt"));
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File Not Found");
		}
		while(file.hasNextLine())//Load lines into dictionary
		{
			String line = file.nextLine();
			if(line.length() == wordLength)//Add lines of same length
			{
				words.add(line);
			}
		}
	}
	public static void constructMap(Map<String, Set<String>> wordMap, Set<String> words)
	{

		for(String word : words)//For every word of given length
		{
			Set<String> editOne = new HashSet<String>();
			
			for(int i = 0; i < word.length(); i++)//Iterate through each position
			{
				for(char c = 'a'; c <= 'z'; c++)//Iterate through each character
				{
					if(c != word.charAt(i))
					{
						char[] wordArray = word.toCharArray();
						wordArray[i] = c;//Replace character
						String newWord = new String(wordArray);
						if(words.contains(newWord))//Edited word exists
						{
							editOne.add(newWord);//Add to set
						}
					}
					
				}
			}
			wordMap.put(word, editOne);//Add set to map as value with current word as Key
		}
		
	}

}
