import java.awt.List;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class main 
{

	public static void main(String[] args) 
			throws FileNotFoundException 
	{
		// TODO Auto-generated method stub
		
		
			Scanner console = new Scanner(System.in);
			System.out.println("Enter file name: ");
			String fileName = console.nextLine();
			
			Scanner file = new Scanner(new File(fileName));
			
			List<String> fileLines = new ArrayList<String>();
			
			while(file.hasNextLine())
			{
				fileLines.Add(file.nextLine());
			}
			
				
	}

}
