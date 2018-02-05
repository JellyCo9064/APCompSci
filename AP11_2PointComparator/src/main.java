/*
 * Author: Connor Aksama
 * Project Name: AP11_2PointComparator
 * File Name: main.java
 * Purpose: Comparator
 * Pseudocode: Implement comparator, compare using distance
 * Maintenance Log: 2/5 Done
 */
import java.util.Arrays;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point[] pointArray = {//Create Point Array
			new Point(4, -2),
			new Point(3, 9),
			new Point(-1, 15),
			new Point(3, 7)
		};
		for(Point p : pointArray)//Print unsorted Array
		{
			System.out.println(p);
		}
		System.out.println();
		
		Arrays.sort(pointArray, new PointComparator());//Sort using comparator
		
		for(Point p : pointArray)//Print sorted
		{
			System.out.println(p);
		}
	}
}

/*
 * 
 * Author: Connor Aksama
 * Project Name: AP11_2PointComparator
 * File Name: PointComparator.java
 *
import java.util.*;
public class PointComparator implements Comparator<Point>{
	public int compare(Point p1, Point p2)
	{
		return (int)(p1.getDist() -  p2.getDist());//Return positive if p1 comes after p2, return negative if p2 comes after p1
	}
}
*/
/*
 * 
 * Author: Connor Aksama
 * Project Name: AP11_2PointComparator
 * File Name: Point.java
 *
public class Point {
	public Point(){x = 0; y = 0;};
	public Point(float a, float b){x = a; y = b;};
	private float x;
	private float y;
	public String toString(){return "(" + x + ", " + y + ") " + getDist();};
	public float getDist(){return (float)Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));};//Calculate Distance
}
*/
