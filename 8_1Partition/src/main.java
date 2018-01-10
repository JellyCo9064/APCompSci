/*
 * Author: Connor Aksama
 * Project Name: 8_1Partition
 * File Name: main.java
 * Purpose: Array List
 * Pseudocode: Init List with ints, pass list with partition to function. Check elements against partition, append to temp list, or add to front
 * Maintenance Log: 10/30 Done
 */
import java.util.*;
public class main {
	public static void main(String[] args)
	{
		List<Integer> list = new ArrayList<Integer>();
		Random r = new Random();
		for(int i = 0; i < 30; i++)//Initialize List
		{
			list.add(r.nextInt(10));
		}
		for(Integer i : list)//Print out original values
		{
			System.out.print(i + ", ");
		}
		
		list = partition(list, 2);//pass and receive list
		
		System.out.println();
		for(Integer i : list)//Print out sorted values
		{
			System.out.print(i + ", ");
		}
	}
	
	public static List<Integer> partition(List<Integer> list, int e)
	{
		List<Integer> rearrangedL = new ArrayList<Integer>();
		List<Integer> rearrangedR = new ArrayList<Integer>();

		Iterator<Integer> itr = list.iterator();
		while (itr.hasNext())//Iterate through values
		{
			Integer i = itr.next();
			if (i.intValue() < e)//Check value against partition
			{
				rearrangedL.add(0, i);//If less than partition, add to beginning of list
			}
			else if(i.intValue() == e)
			{
				rearrangedL.add(i);
			}
			else
			{
				rearrangedR.add(i);//If greater than partition, add to end of list
			}
		}
		
		
		rearrangedL.addAll(rearrangedR);
		return rearrangedL;
	}
}


