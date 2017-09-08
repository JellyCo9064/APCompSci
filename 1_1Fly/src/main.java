
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		dayPrinter(1, 1);
	}
	
	public static void dayPrinter(int dayNum, int orgNum)
	{
		String dayAdj = "";
		
		switch(dayNum)
		{
		case 1:
			dayAdj = "first";
			break;
		case 2:
			dayAdj = "second";
			break;
		case 3:
			dayAdj = "thirth";
			break;
		case 4:
			dayAdj = "fourth";
			break;
		case 5:
			dayAdj = "fifth";
			break;
		case 6:
			dayAdj = "sixth";
			break;
		case 7:
			dayAdj = "seventh";
			break;
		case 8:
			dayAdj = "eigth";
			break;
		case 9:
			dayAdj = "ninth";
			break;
		case 10:
			dayAdj = "tenth";
			break;
		case 11:
			dayAdj = "eleventh";
			break;
		case 12:
			dayAdj = "twelfth";
			break;
		default:
			dayAdj = "NULL";
			break;
		}
		if (dayNum == orgNum)
		{		
			System.out.println("On the " + dayAdj + " of Christmas,\nmy true love sent to me");
		}
		System.out.println(giveString(dayNum));
		dayNum--;
		if (dayNum != 0)
		{
			dayPrinter(dayNum, orgNum);
		}
		else if (orgNum != 12)
		{
			orgNum++;
			dayNum = orgNum;
			dayPrinter(dayNum, orgNum);
		}
	}
	
	public static String giveString(int dayNum)
	{
		switch(dayNum)
		{
		case 1:
			return "a partridge in a pear tree.\n";
			
		case 2:
			return "two turtle doves, and";
			
		case 3:
			return "three french hens,";
			
		case 4:
			return "four calling birds,";
			
		case 5:
			return "five golden rings,";
			
		case 6:
			return "six geese a-laying,";
			
		case 7:
			return "seven swans a-swimming,";
			
		case 8:
			return "eight maids a-milking,";
			
		case 9:
			return "nine ladies dancing,";
			
		case 10:
			return "ten lords a-leaping,";
			
		case 11:
			return "eleven pipers piping,";
			
		case 12:
			return "Twelve drummers drumming,";
			
		}
		return "MOO";
	}

}
