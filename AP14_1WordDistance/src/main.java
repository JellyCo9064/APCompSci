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

	public static void main(String[] args){
		// TODO Auto-generated method stub
		
	}
	public static void constructMap(Map<String, Set<String>> wordMap) throws FileNotFoundException
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
		
		
	}

}
