/*
 * 
 */
import java.util.*;
import java.io.*;
public class main {
	public static void main (String[] args) throws FileNotFoundException
	{
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
			System.out.println("not found.");
		}
		
	}
}
