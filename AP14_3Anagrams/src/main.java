
import java.util.*;
import java.io.*;
public class main {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		List<String> dictionary = new ArrayList<String>();
		List<String> canonicalDictionary = new ArrayList<String>();
		
		loadDictionary(dictionary, canonicalDictionary);
		
		System.out.println(canonicalDictionary.toString());
		HashMap<String, Set<String>> canonicalToSet = new HashMap<String, Set<String>>();
		
		String previous = "";
		for(int i = 0; i < dictionary.size(); i++)
		{
			if (canonicalDictionary.get(i) != previous)
			{
				previous = canonicalDictionary.get(i);
				canonicalToSet.put(previous, new HashSet<String>());
				canonicalToSet.get(previous).add(dictionary.get(i));
			}
			else
			{
				System.out.println("yay");
				canonicalToSet.get(previous).add(dictionary.get(i));
			}
		}
		
		
		
		Scanner console = new Scanner(System.in);
		
		System.out.println("Enter String: ");
		String target = console.nextLine();
		target = findCanonical(target);
		Set<String> words = canonicalToSet.get(target);
		System.out.println(canonicalToSet.get(target).toString());
		if(words.size() != 0)
		{
			for(String s : words)
			{
				System.out.println(s);
			}
		}
		else
		{
			System.out.println("");
		}

	}
	public static void loadDictionary(List<String> dictionary, List<String> canonicalDictionary) 
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
			dictionary.add(line);
			canonicalDictionary.add(findCanonical(line));
		}
		Collections.sort(dictionary, new COMPARE_CANONICAL());
		Collections.sort(canonicalDictionary);
	}
	public static String findCanonical(String str)
	{
		char[] charray = str.toCharArray();
		Arrays.sort(charray);
		return new String(charray);
	}
}
