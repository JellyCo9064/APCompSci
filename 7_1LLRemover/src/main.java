/*
 * Author: Connor Aksama
 * Project Name: 7_1LLRemover
 * File Name: main.java
 * Purpose: Use LinkedList and Iterator
 * Pseudocode: Create Linked List, pass with values to fn, iterate through iterator, check and remove values
 * Maintenance Log: 10/16 Done
 */

import java.util.*;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		LinkedList<Integer> list = new LinkedList<Integer>();
		for(int i = 0; i < 30; i++)
		{
			list.add(r.nextInt(20));
		}
		Iterator<Integer> print = list.iterator();
		while(print.hasNext())
		{
			System.out.print(print.next() + ", ");
		}
		System.out.println();
		removeInRange(list, 3, 5, 14);
		Iterator<Integer> print2 = list.iterator();
		while(print2.hasNext())
		{
			System.out.print(print2.next() + ", ");
		}

	}
	/* remove specified value given range within linkedlist
	 * @param start inclusive starting search index
	 * @param end exclusive ending search index
	 */
	public static void removeInRange(LinkedList<Integer> list, int target, int start, int end)
	{
		if (start < list.size() && end < list.size())
		{
			Iterator<Integer> itr = list.iterator();//get iterator
			int i = 0;
			for (i = 0; i < start; i++)//set iterator to start index
			{
				itr.next();
			}
			while (i < end)
			{
				int test = itr.next().intValue();
				if (test == target)
				{
					itr.remove();
				}
				i++;
			}
		}
	}

}
