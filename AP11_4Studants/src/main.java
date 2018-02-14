/*
 * Author: Connor Aksama
 * Project Name: AP11_4Studants
 * File Name: main.java
 * Purpose: Comparators
 * Pseudocode:
 * Maintenance Log: 2/8 Switch case, comparators
 */
import java.util.*;
import java.io.*;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console = new Scanner(System.in);
		List<Studant> studentList = new ArrayList<Studant>();
		Scanner file = null;
		try
		{
			file = new Scanner(new File("studantList.txt"));
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File Not Found");
		}
		while (file.hasNextLine())
		{
			String inLine = file.nextLine();
			Scanner lineScanner = new Scanner(inLine);
			studentList.add(new Studant(lineScanner.next(), lineScanner.next(), lineScanner.nextInt(), lineScanner.nextDouble(), lineScanner.next()));
		}
		while (true)
		{
			System.out.println("View List By:\n\tFirst Name:\n\t\t1: Ascending\n\t\t2: Descending\n\tLast Name:\n\t\t3: Ascending\n\t\t4: Descending\n\tID Number:\n\t\t5: Ascending\n\t\t6: Descending\n\tPercentage:\n\t\t7: Ascending\n\t\t8: Descending\n\tLetter Grade:\n\t\t9: Ascending\n\t\t10: Descending");
			int choice = console.nextInt();
			switch(choice)
			{
			case 1:
				Collections.sort(studentList, new COMPARE_FIRST_NAME());
				break;
			case 2:
				Collections.sort(studentList, Collections.reverseOrder(new COMPARE_FIRST_NAME()));
				break;
			case 3:
				Collections.sort(studentList, new COMPARE_LAST_NAME());
				break;
			case 4:
				Collections.sort(studentList, Collections.reverseOrder(new COMPARE_LAST_NAME()));
				break;
			case 5:
				Collections.sort(studentList, new COMPARE_ID_NUMBER());
				break;
			case 6:
				Collections.sort(studentList, Collections.reverseOrder(new COMPARE_ID_NUMBER()));
				break;
			case 7:
				Collections.sort(studentList, new COMPARE_PERCENTAGE());
				break;
			case 8:
				Collections.sort(studentList, Collections.reverseOrder(new COMPARE_PERCENTAGE()));
				break;
			case 9:
				Collections.sort(studentList, new COMPARE_LETTER_GRADE());
				break;
			case 10:
				Collections.sort(studentList, Collections.reverseOrder(new COMPARE_LETTER_GRADE()));
				break;
			default:
				System.out.println("Invalid choice");
				break;
			}
			System.out.println(studentList.toString());
		}
	}

}
