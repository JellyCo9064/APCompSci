import java.util.Comparator;

public class COMPARE_PERCENTAGE implements Comparator<Studant>{
	public int compare(Studant a, Studant b)
	{
		return (int)(a.getPercentage() - b.getPercentage());
	}
}
