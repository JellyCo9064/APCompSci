/*
 * Author: Connor Aksama
 * Project Name: 6_2Windows
 * File Name: main.java
 * Purpose: ArrayList with Class
 * Pseudocode: Rectangle class with Point class, with methods for position and size.
 * Get click input, iterate through list, check for point within bounds. Remove and move to front.
 * Maintenance Log: 10/2 Begin menu, and base structure 10/4 Create iteration and removal and replace
 */
import java.util.*;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Rectangle> windows = new ArrayList<Rectangle>();
		Scanner console = new Scanner(System.in);
		int choice = 0;
		do
		{
			System.out.println("Choose an option:\n\t1: Open a New Window\n\t2: Click on an Existing Window\n\t0: Quit");
		
			choice = console.nextInt();
			if (choice == 1)
			{
				System.out.println("Enter X Position of New Window: ");
				double newX = console.nextDouble();
				System.out.println("Enter Y Position of New Window: ");
				double newY = console.nextDouble();
				System.out.println("Enter Width of New Window: ");
				double newWidth = console.nextDouble();
				System.out.println("Enter Length of New Window: ");
				double newLength = console.nextDouble();
				
				windows.add(new Rectangle(newWidth, newLength, newX, newY));//construct window object, push to list
				
				System.out.println("Done.");
			}
			else if (choice == 2)
			{
				System.out.println("Enter X Position of Click: ");
				double clickX = console.nextDouble();
				System.out.println("Enter Y Position of Click: ");
				double clickY = console.nextDouble();
				boolean exists = false;
				for (int i = windows.size() - 1; i >= 0; i--)//loop backwards through list
				{
					Rectangle check = windows.get(i);
					double checkX = check.getPosition().x;
					double checkY = check.getPosition().y;
					double checkWidth = check.getWidth();
					double checkLength = check.getLength();
					if (clickX >=  checkX && clickX <= checkX + checkWidth && clickY >= checkY && clickY <= checkY + checkLength)
					{//Check if click is within bounds
						check.clicked(new Point(clickX, clickY));//Pass new corner point
						windows.remove(i);
						windows.add(check);//remove and append
						System.out.println("Success");
						exists = true;
						break;
					}
				}
				if (!exists)
				{
					System.out.println("No Window Found");
				}
			}
			else
			{
				System.out.println("Invalid");
			}
		}while(choice == 0);
		System.out.println("Done");
	}
}
/*
//Project Name: 6_2Windows
//File Name: Rectangle.java
public class Rectangle {
	private double width;
	private double length;
	private Point position = new Point();
	
	public Rectangle(){width = 0; length = 0;};
	public Rectangle(double w, double l, double x, double y){width = w; length = l; position.x = x; position.y = y;};
	
	public double getWidth(){return width;};
	public double getLength(){return length;};
	public Point getPosition(){return position;};
	
	public void clicked(Point cursor){position.x = cursor.x; position.y = cursor.y;};
	
}
//Project Name: 6_2Windows
//File Name: Point.java
public class Point {
	public double x;
	public double y;
	
	public Point(){x = 0; y = 0;};
	public Point(double a, double b){x = a; y = b;};
}
*/