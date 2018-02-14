import java.util.Comparator;

public class COMPARE_ID_NUMBER implements Comparator<Studant>{
	public int compare(Studant a, Studant b)
	{
		return a.getIDNumber() - b.getIDNumber();
	}
}
