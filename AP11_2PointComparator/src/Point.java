/*
 * Author: Connor Aksama
 * Project Name: AP11_2PointComparator
 * File Name: Point.java
 */
public class Point {
	public Point(){x = 0; y = 0;};
	public Point(float a, float b){x = a; y = b;};
	private float x;
	private float y;
	public String toString(){return "(" + x + ", " + y + ") " + getDist();};
	public float getDist(){return (float)Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));};
}
