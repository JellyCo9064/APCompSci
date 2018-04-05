
import java.util.*;
import java.io.*;
public class main {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		List<String> dictionary = new ArrayList<String>();
		List<String> canonicalDictionary = new ArrayList<String>();
		
		loadDictionary(dictionary, canonicalDictionary);
		
		Scanner console = new Scanner(System.in);
		
		System.out.println("Enter String: ");
		String target = console.nextLine();
		
		int index = Collections.binarySearch(canonicalDictionary, target);
		//TODO: Find bounds of canonical
		ListIterator<String> itr = canonicalDictionary.listIterator();

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
	}
	public static String findCanonical(String str)
	{
		char[] charray = str.toCharArray();
		Arrays.sort(charray);
		return new String(charray);
	}
}
