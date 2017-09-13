/*
 * Author: Connor Aksama
 * Project Name: 2_4Triangles
 * File Name: main.java
 * Purpose: do Math
 * Pseudocode: Use law of cosines
 * Maintenance Log: 9/11 Done
 */
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console = new Scanner(System.in);
		boolean again = true;
		while(again)
		{
			System.out.println("Enter side lengths of triangle:");
			System.out.println("Side 1: ");
			double s1 = console.nextDouble();
			System.out.println("Side 2: ");
			double s2 = console.nextDouble();
			System.out.println("Side 3: ");
			double s3 = console.nextDouble();
		
			double angles[] = new double[3];
			if (s1 + s2 > s3 && s1 + s3 > s2 && s3 + s2 > s1)
			{
				angles = findAngles(s1, s2, s3);
				System.out.println(angles[0] + ", " + angles[1] + ", " + angles[2]);
			}
			else
			{
				System.out.println("Not a valid Triangle");
			}
			System.out.println("Again?\n0: No\n1: Yes");
			
			int wut = console.nextInt();
			if (wut != 1)
			{
				break;
			}
			
		}
	}
	
	public static double[] findAngles(double s1, double s2, double s3)
	{
		double angles[] = new double[3];
		angles[0] = Math.toDegrees(Math.acos((s3 * s3 - s1 * s1 - s2 * s2) / (-2 * s2 * s3)));
		angles[1] = Math.toDegrees(Math.acos((s1 * s1 - s2 * s2 - s3 * s3) / (-2 * s1 * s3)));
		angles[2] = Math.toDegrees(Math.acos((s2 * s2 - s3 * s3 - s1 * s1) / (-2 * s1 * s2)));
		
		return angles;
	}

}
