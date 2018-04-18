/*
 * Author: Connor Aksama
 * Project Name: AP14_1WordDistance
 * File Name: main.java
 * Purpose: Maps?
 * Pseudocode: wubabababubuabuaubaubauba
 * Maintenance Log: 
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
		loadDictionary(words, one.length());
		boolean isWord = true;
		if(!words.contains(one))
		{
			System.out.println(one + " is not a word.");
			isWord = false;
		}
		if(!words.contains(two))
		{
			System.out.println(two + " is not a word.");
			isWord = false;
		}
		if(isWord)
		{
			editDistance = 1;
			constructMap(wordMap, words);
			Set<String> searchList = new HashSet<String>();
			searchList.addAll(wordMap.get(one));
			for(int i = 0; i < 1000; i++)
			{
				if(searchList.contains(two))
				{
					break;
				}
				Set<String> toAdd = new HashSet<String>();
				for(String s : searchList)
				{
					toAdd.addAll(wordMap.get(s));
				}
				searchList.clear();
				searchList.addAll(toAdd);
				editDistance++;
			}
			System.out.println("Edit Distance Of: " + editDistance);
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
		while(file.hasNextLine())
		{
			String line = file.nextLine();
			if(line.length() == wordLength)
			{
				words.add(line);
			}
		}
	}
	public static void constructMap(Map<String, Set<String>> wordMap, Set<String> words)
	{

		for(String word : words)
		{
			Set<String> editOne = new HashSet<String>();
			
			for(int i = 0; i < word.length(); i++)
			{
				for(char c = 'a'; c <= 'z'; c++)
				{
					if(c != word.charAt(i))
					{
						char[] wordArray = word.toCharArray();
						wordArray[i] = c;
						String newWord = new String(wordArray);
						if(words.contains(newWord))
						{
							editOne.add(newWord);
						}
					}
					
				}
			}
			wordMap.put(word, editOne);
		}
		
	}

}
