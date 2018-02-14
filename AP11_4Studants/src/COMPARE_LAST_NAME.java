import java.util.Comparator;

public class COMPARE_LAST_NAME implements Comparator<Studant>{
	public int compare(Studant a, Studant b)
	{
		return a.getLastName().compareToIgnoreCase(b.getLastName());
	}
}
