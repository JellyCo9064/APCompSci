/*
 * Author: Connor Aksama
 * Project Name: 9_3SelectionSort
 * File Name: main.java
 * Purpose: ALGORITHMS
 * Pseudocode: Iterate through array to decreasing end mark, looking for largest value, send largest value to end mark
 * Maintenance Log: 11/6 Function completed 11/8 Commented, Questions answered
 * Questions:
 * 1: This algorithm runs at the same speed as its "sister" algorithm
 * 2: Complexity class -> n^2
 */
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] moo = {20, 12, 10, 15, 2};
		for(int i : moo)
		{
			System.out.print(i + ", ");
		}
		moo = sort(moo);
		System.out.println();
		for(int i : moo)
		{
			System.out.print(i + ", ");
		}
	}
	public static int[] sort(int[] array)
	{
		for(int i = array.length - 1; i > 0; i--)
		{
			int greatest = Integer.MIN_VALUE;
			int gIndex = 0;
			for(int j = 0; j <= i; j++)
			{
				if (array[j] > greatest)
				{
					greatest = array[j];
					gIndex = j;
				}
			}
			int temp = array[i];
			array[i] = greatest;
			array[gIndex] = temp;
		}
		return array;
	}
}
