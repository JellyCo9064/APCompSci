//Project Name: 4_4SquareCircle
//File Name: Rectangle.java
public class Rectangle {
	private double length;
	private double width;
	
	public Rectangle(){length = 1; width = 1;};//constructors
	public Rectangle(double l, double w){length = l; width = w;};
	
	public double getArea(){return length * width;};//methods
	public double getPerimeter(){return 2 * length * width;};
}
