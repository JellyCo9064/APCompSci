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
