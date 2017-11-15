/*
 * Author: Connor Aksama
 * Project Name: A11_1INDEXER
 * File Name: main.java
 * Purpose: ArrayIntList
 * Pseudocode: Iterate through self's elements, check against passed list, if equal, increase index of passed List
 * Maintenance Log: 11/15 All Done
 */
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			ArrayIntList list1 = new ArrayIntList();
			list1.add(3);
			list1.add(4);
			list1.add(5);
			list1.add(1);
			list1.add(2);
			list1.add(6);
			list1.add(7);
			
			ArrayIntList list2 = new ArrayIntList();
			list2.add(1);
			list2.add(2);
			list2.add(6);
			list2.add(7);
			
			System.out.println(list1.indexOfSubList(list2));
	}

}
