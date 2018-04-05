import java.util.Arrays;
import java.util.Comparator;

public class COMPARE_CANONICAL implements Comparator<String>{
	public int compare(String one, String two)
	{
		one = findCanonical(one);
		two = findCanonical(two);
		return one.compareToIgnoreCase(two);
	}
	public String findCanonical(String str)
	{
		char[] charray = str.toCharArray();
		Arrays.sort(charray);
		return new String(charray);
	}
}
