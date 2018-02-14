import java.util.Comparator;

public class COMPARE_FIRST_NAME implements Comparator<Studant>{
	public int compare(Studant a, Studant b)
	{
		return a.getFirstName().compareToIgnoreCase(b.getFirstName());
	}
}
