/*
 * 
 */
import java.util.*;
import java.io.*;
public class main {

	public static void main(String[] args) throws FileNotFoundException{
		// TODO Auto-generated method stub
		Scanner console = new Scanner(System.in);
		System.out.println("Enter file name: ");
		String fileName = console.nextLine();
		
		Scanner file = null;
		try
		{
			file = new Scanner(new File(fileName));
		}
		catch (FileNotFoundException e)
		{
			System.out.println("File not found");
		}
		
		Set<String> strings = new HashSet<String>();
		while(file.hasNext())
		{
			strings.add(file.next());
		}
		
		System.out.println();
		for(String s : strings)
		{
			System.out.print(s + ", ");
		}
				
		strings = removeEvenLength(strings);
		
		System.out.println();
		for (String s : strings)
		{
			System.out.print(s + ", ");
		}
		
		console.close();
	}
	
	public static Set<String> removeEvenLength(Set<String> set)
	{
		Iterator<String> itr = set.iterator();
		
		int index = 0;
		while(itr.hasNext())
		{
			String check = itr.next();
			if (check.length() % 2 == 0)
			{
				itr.remove();
			}
			index++;
		}
		
		return set;
	}
}
