import java.util.Comparator;

public class COMPARE_LETTER_GRADE implements Comparator<Studant>{
	public int compare(Studant a, Studant b)
	{
		return a.getLetterGrade().compareTo(b.getLetterGrade());
	}
}
