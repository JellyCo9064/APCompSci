/*
 * Author: Connor Aksama
 * Project Name: 5_1Shapparent
 * File Name: main.java
 * Pseudocode: Get in values, pass through constructor, print out.
 * Purpose: Inherit classes.
 * Maintenance Log: 9/27 Done.
 */
import java.util.*;
public class main {
	public static void main(String[] args)
	{
		Scanner console = new Scanner(System.in);
		
		System.out.println("Enter Circle Radius: ");//Get Values
		Circle roundness = new Circle(console.nextDouble());
		
		System.out.println("Enter Rectangle Length: ");
		double l = console.nextDouble();
		System.out.println("Enter Rectnagle Width: ");
		Rectangle rEKayTee = new Rectangle(l, console.nextDouble());
		
		System.out.println("Enter Square Side Length: ");
		Square meh = new Square(console.nextDouble());
		
		System.out.println("Circle:\n\tArea: " + roundness.area() + "\n\tCircumfrence: " + roundness.circumfrence());//Print Values
		System.out.println("Rectangle:\n\tArea: " + rEKayTee.area() + "\n\tPerimeter: " + rEKayTee.perimeter());
		System.out.println("Square:\n\tArea: " + meh.area() + "\n\tPerimeter: " + meh.perimeter());
		
		console.close();
	}
}
/*
 //Project Name: 5_1Shapparent
//File Name: Circle.java
public class Circle {
	private double radius;
	
	public Circle() {radius = 1;};
	public Circle(double r) {radius = r;};//constructors
	
	public void setRadius(double r) {radius = r;};
	
	public double area() {return Math.PI * radius * radius;};//methods
	public double circumfrence() {return Math.PI * 2 * radius;};
}
//Project Name: 5_1Shapparent
//File Name: Rectangle.java
public class Rectangle {
	private double length;
	private double width;
	
	public Rectangle(){length = 1; width = 1;};
	public Rectangle(double l, double w){length = l; width = w;};//constructors
	
	public double area() {return length * width;};//methods
	public double perimeter() {return 2 * length + 2 * length;};
	
}
//Project Name: 5_1Shapparent
//File Name: Square.java
public class Square extends Rectangle{//inherit from rectangle class
	
	public Square() {super();};//default constructor "inherited" from rectangle
	public Square(double s) {super(s, s);};//utilize constructor from rectangle class to initialize variables to same value
	
}

 */
