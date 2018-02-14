
public class Studant {
	private String firstName;
	private String lastName;
	private int idNumber;
	private double percentage;
	private String letterGrade;
	
	public Studant(){firstName = ""; lastName = ""; idNumber = 0; percentage = 0; letterGrade = "F";};
	public Studant(String fn, String ln, int id, double percent, String letter){firstName = fn; lastName = ln; idNumber = id; percentage = percent; letterGrade = letter;};
	
	public String getFirstName(){return firstName;};
	public String getLastName(){return lastName;};
	public int getIDNumber(){return idNumber;};
	public double getPercentage(){return percentage;};
	public String getLetterGrade(){return letterGrade;};
	public String toString(){return firstName + " " + lastName + " " + idNumber + " " + percentage + " " + letterGrade;};
}
