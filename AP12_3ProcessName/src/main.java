/*
 * Author: Connor Akasma
 * Project Name: AP12_3ProecessName
 * File Name: main.java
 * Purpose: Scanners and Strrrings
 * Pseudocode: Create Scanner, pass scanner, get input, print
 * Maintenance Log: 2/15 Done
 */
import java.util.*;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console = new Scanner(System.in);
		processName(console);
	}
	public static void processName(Scanner console)
	{
		System.out.println("Enter name as one string: ");
		List<String> names = new ArrayList<String>();
		String name = console.nextLine();
		Scanner reader = new Scanner(name);
		while(reader.hasNext())
		{
			names.add(reader.next());
		}
		for(int i = names.size() - 1; i >= 0; i--)
		{
			System.out.print(names.get(i));
			if(i != 0)
			{
				System.out.print(", ");
			}
		}
	}

}
