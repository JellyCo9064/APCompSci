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
