/*
 * Author: Connor Aksama
 * Project Name: AP11_4Studants
 * File Name: main.java
 * Purpose: Comparators
 * Pseudocode: Read in file line by line, construct student. Use comparators and reverse comparators to sort list.
 * Maintenance Log: 2/8 Switch case, comparators 2/15 Done
 */
import java.util.*;
import java.io.*;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console = new Scanner(System.in);
		List<Studant> studentList = new ArrayList<Studant>();
		Scanner file = null;
		try//Get in file
		{
			file = new Scanner(new File("studantList.txt"));
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File Not Found");
		}
		while (file.hasNextLine())
		{
			String inLine = file.nextLine();//Get in one student
			Scanner lineScanner = new Scanner(inLine);//Input string into scanner
			//Break up string, use as constructor variables, add to list
			studentList.add(new Studant(lineScanner.next(), lineScanner.next(), lineScanner.next(), lineScanner.nextDouble(), lineScanner.next()));
		}
		while (true)
		{
			System.out.println("View List By:\n\tFirst Name:\n\t\t1: Ascending\n\t\t2: Descending\n\tLast Name:\n\t\t3: Ascending\n\t\t4: Descending\n\tID Number:\n\t\t5: Ascending\n\t\t6: Descending\n\tPercentage:\n\t\t7: Ascending\n\t\t8: Descending\n\tLetter Grade:\n\t\t9: Ascending\n\t\t10: Descending");
			int choice = console.nextInt();
			switch(choice)
			{
			case 1:
				Collections.sort(studentList, new COMPARE_FIRST_NAME());//First Ascending
				break;
			case 2:
				Collections.sort(studentList, Collections.reverseOrder(new COMPARE_FIRST_NAME()));//First Descending
				break;
			case 3:
				Collections.sort(studentList, new COMPARE_LAST_NAME());//Last Ascending
				break;
			case 4:
				Collections.sort(studentList, Collections.reverseOrder(new COMPARE_LAST_NAME()));//Last Descending
				break;
			case 5:
				Collections.sort(studentList, new COMPARE_ID_NUMBER());//ID Ascending
				break;
			case 6:
				Collections.sort(studentList, Collections.reverseOrder(new COMPARE_ID_NUMBER()));//ID Descending
				break;
			case 7:
				Collections.sort(studentList, new COMPARE_PERCENTAGE());//Percentage Ascending
				break;
			case 8:
				Collections.sort(studentList, Collections.reverseOrder(new COMPARE_PERCENTAGE()));//Percentage Descending
				break;
			case 9:
				Collections.sort(studentList, new COMPARE_LETTER_GRADE());//Letter Ascending
				break;
			case 10:
				Collections.sort(studentList, Collections.reverseOrder(new COMPARE_LETTER_GRADE()));//Letter Descending
				break;
			default:
				System.out.println("Invalid choice");
				break;
			}
			for(Studant s : studentList)//Print out list
			{
				System.out.println(s.getFirstName() + "\t" + s.getLastName() + "\t" + s.getIDNumber() + "\t" + s.getPercentage() + "\t" + s.getLetterGrade());
			}
		}
	}

}
/*
 * File Name: COMPARE_FIRST_NAME.java
  import java.util.Comparator;

public class COMPARE_FIRST_NAME implements Comparator<Studant>{
	public int compare(Studant a, Studant b)
	{
		return a.getFirstName().compareToIgnoreCase(b.getFirstName());
	}
}

 */
/*
 * File Name: COMPARE_ID_NUMBER.java
 * import java.util.Comparator;

public class COMPARE_ID_NUMBER implements Comparator<Studant>{
	public int compare(Studant a, Studant b)
	{
		return a.getIDNumber().compareToIgnoreCase(b.getIDNumber());
	}
}

 */
/*
 * File Name: COMPARE_LAST_NAME.java
 * import java.util.Comparator;

public class COMPARE_LAST_NAME implements Comparator<Studant>{
	public int compare(Studant a, Studant b)
	{
		return a.getLastName().compareToIgnoreCase(b.getLastName());
	}
}

 */
/*
 * File Name: COMPARE_LETTER_GRADE.java
 * import java.util.Comparator;

public class COMPARE_LETTER_GRADE implements Comparator<Studant>{
	public int compare(Studant a, Studant b)
	{
		return a.getLetterGrade().compareTo(b.getLetterGrade());
	}
}

 */
/*
 * File Name: COMPARE_PERCENT.java
 * import java.util.Comparator;

public class COMPARE_PERCENTAGE implements Comparator<Studant>{
	public int compare(Studant a, Studant b)
	{
		return (int)(a.getPercentage() - b.getPercentage());
	}
}

 */
/*
 * File Name: Studant.java
public class Studant {
	private String firstName;
	private String lastName;
	private String idNumber;
	private double percentage;
	private String letterGrade;
	
	public Studant(){firstName = ""; lastName = ""; idNumber = ""; percentage = 0; letterGrade = "F";};
	public Studant(String fn, String ln, String id, double percent, String letter){firstName = fn; lastName = ln; idNumber = id; percentage = percent; letterGrade = letter;};
	
	public String getFirstName(){return firstName;};
	public String getLastName(){return lastName;};
	public String getIDNumber(){return idNumber;};
	public double getPercentage(){return percentage;};
	public String getLetterGrade(){return letterGrade;};
	public String toString(){return firstName + " " + lastName + " " + idNumber + " " + percentage + " " + letterGrade;};
}
 
 */

