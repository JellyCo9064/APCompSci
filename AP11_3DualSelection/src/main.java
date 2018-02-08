/*
 * Author: Connor Aksama
 * Project Name: AP11_3DualSelection
 * File Name: main.java
 * Purpose: Do fancy sort
 * Pseudocode: Search for min and max within decreasing bounds, swap to front and back
 * Maintenance Log:2/8 Done
 * This algorithm would be faster than the regular selection sort.
 * At high enough n values, merge sort would be faster.
 * Complexity class n^2
 */
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] moo = {5, 8, 2, 5, 8, 46, 79, 2, 4, 67, 4, 23, 5, 7, 2, 535, 12, 4, 85, 245, 75, 0, 90, 3, 2};
		
		for(int i = 0; i < moo.length; i++)
		{
			int min = Integer.MAX_VALUE;
			int minIndex = 0;
			int max = Integer.MIN_VALUE;
			int maxIndex = 0;
			if (i >= moo.length - 1 - i)//Left Boundary Meets Right Boundary
			{
				break;
			}
			for(int j = i; j < moo.length - i; j++)//Search over unsorted middle values
			{
				if (moo[j] > max)//Found possible max
				{
					max = moo[j];
					maxIndex = j;
				}
				if(moo[j] < min)//Found possible min
				{
					min = moo[j];
					minIndex = j;
				}				
			}
			int temp = moo[i];//Swap min to "front"
			moo[i] = min;
			moo[minIndex] = temp;
			if(maxIndex == i)//If max is located where min is going, the intended value of maxIndex needs to change
			{
				maxIndex = minIndex;
			}
			
			temp = moo[moo.length - i - 1];//Swap max to "back"
			moo[moo.length - i - 1] = max;
			moo[maxIndex] = temp;
		}
		for(int i : moo)//Print values
		{
			System.out.print(i + ", ");
		}
	}

}
