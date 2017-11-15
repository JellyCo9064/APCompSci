/*
 * Author: Connor Aksama
 * Project Name: A11_2REPLACER
 * File Name: main.java
 * Purpose: ArrayIntList
 * Pseudocode: Loop through elements, if element is equal to oldVal, replace with newVal
 * Maintenance Log: 11/15 Done
 */
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayIntList list1 = new ArrayIntList();
		list1.add(11);
		list1.add(-7);
		list1.add(3);
		list1.add(42);
		list1.add(3);
		list1.add(0);
		list1.add(14);
		list1.add(3);
		
		list1.replaceAll(3,  999);
		System.out.println(list1.toString());
	}

}
