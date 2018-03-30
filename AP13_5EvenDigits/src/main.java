/*
 * Author: Connor Aksama
 * Project Name: AP13_5EvenDigits
 * File Name: main.java
 * Purpose: Recursion
 * Pseudocode:
 * Maintenance Log: All Done
 * Problem: "Write a recursive method called evenDigits that accepts an integer parameter and that returns the integer formed by removing the odd digits from it. For example, evenDigits(8342116) returns 8426 and evenDigits(-34512) returns -42. If the number is 0 or has no even digits, such as 35159 or 7, return 0. Leading zeros in the result should be ignored.
 */
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(evenDigits(2));
		System.out.println(evenDigits(3));
		System.out.println(evenDigits(12));
		System.out.println(evenDigits(22));
		System.out.println(evenDigits(33));
		System.out.println(evenDigits(23));
		System.out.println(evenDigits(8342116));
		System.out.println(evenDigits(42445));
		System.out.println(evenDigits(-2));
		System.out.println(evenDigits(-3));
		System.out.println(evenDigits(-12));
		System.out.println(evenDigits(-22));
		System.out.println(evenDigits(-33));
		System.out.println(evenDigits(-23));
		System.out.println(evenDigits(-8342116));
		System.out.println(evenDigits(-42445));

	}
	public static int evenDigits(int myInt)
	{
		if(myInt < 100 && myInt > -100)//Input is two digits long
		{
			//System.out.println("yayay");
			if ((int)(myInt / 10) % 2 != 0)//Tens Place is Odd
			{
				myInt -= (int)(myInt / 10) * 10;//Remove Tens Place
				if(myInt % 2 != 0)//Ones place is odd
				{
					myInt -= myInt;//Remove Ones place
				}
			}
			else//Tens Place is Even
			{
				if(myInt % 10 % 2 != 0)//Ones Place is Odd
				{
					myInt -= myInt % 10;//Remove Ones Place
					myInt /= 10;//Shift Tens Place
				}
			}

			return myInt;
		}
		else//myInt is Longer than Three Digits
		{
			int negation = 1;
			if (myInt < 0)//If negative, store negative multiplier until final layer
			{
				negation = -1;
				myInt *= -1;
			}
			int frontPlace = (int)Math.log10(Math.abs(myInt));//Find Largest Place of Number
			int frontInt = (int)(myInt / Math.pow(10, frontPlace));//Find the First Digit
			int rest = myInt - (frontInt * (int)Math.pow(10, frontPlace));//Store all Other Digits
			int restPlace = (int)Math.log10(Math.abs(rest));//Find Place of Remaining Digits
			
			//System.out.println("My Int: " + myInt + " Front Place: " + frontPlace + " Front Int: " + frontInt + " Rest: " + rest + " Rest Place: " + restPlace);
			int restReturn = evenDigits(rest);//Recursion with Rest of myInt
			//System.out.println("Rest Return: " + restReturn);
			int temp = evenDigits(frontInt);//Process First Digit
			//System.out.println("evenDigits(frontInt): " + temp);
			//Re-Multiply First Digit by Original Place, divided by the difference between the original place of rest, and the place of the processed rest
			int moo = temp * (int)Math.pow(10, frontPlace) / (int)Math.pow(10, (restPlace - (int)Math.log10(restReturn))) + restReturn;
			//System.out.println("MOO: " + moo);
			return moo * negation;
		}
	}

}
