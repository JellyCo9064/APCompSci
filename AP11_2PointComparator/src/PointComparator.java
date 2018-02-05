/*
 * Author: Connor Aksama
 * Project Name: AP11_2PointComparator
 * File Name: PointComparator.java
 */
import java.util.*;
public class PointComparator implements Comparator<Point>{
	public int compare(Point p1, Point p2)
	{
		return (int)(p1.getDist() -  p2.getDist());
	}
}
