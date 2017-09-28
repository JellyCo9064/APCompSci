/*
 * Author: Connor Aksama
 * Project Name: 4_4SquareCircle
 * File Name: main.java
 * Purpose: Classes
 * Pseudocode: Create classes with methods. Get input, pass through constructor
 * Maintenance Log: 9/28 Done
 */
import java.util.*;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console = new Scanner(System.in);
		
		System.out.println("Enter Rectangle Width: ");
		double width = console.nextDouble();
		System.out.println("Enter Rectangle Length: ");
		Rectangle rekt = new Rectangle(width, console.nextDouble());//pass variables to object constructor
		
		System.out.println("\tArea: " + rekt.getArea());//call methods
		System.out.println("\tPerimeter: " + rekt.getPerimeter());
		
		System.out.println("Enter Circle Radius: ");//pass inputs
		Circle circ = new Circle(console.nextDouble());
		
		System.out.println("\tArea: " + circ.getArea());//call methods
		System.out.println("\tCircumfrence: " + circ.getPerimeter());
		
		console.close();
	}

}

/*
 //Project Name: 4_4SquareCircle
//File Name: Rectangle.java
public class Rectangle {
	private double length;
	private double width;
	
	public Rectangle(){length = 1; width = 1;};
	public Rectangle(double l, double w){length = l; width = w;};
	
	public double getArea(){return length * width;};
	public double getPerimeter(){return 2 * length * width;};
}

//Project Name: 4_4SquareCircle
//File Name: Circle.java
public class Circle {
	private double radius;
	
	public Circle(){radius = 1;};
	public Circle(double r){radius = r;};
	
	public double getPerimeter(){return 2 * radius * Math.PI;};
	public double getArea(){return Math.pow(radius, 2) * Math.PI;};

}

*/
