//Project Name: 4_4SquareCircle
//File Name: Circle.java
public class Circle {
	private double radius;
	
	public Circle(){radius = 1;};//constructors
	public Circle(double r){radius = r;};
	
	public double getPerimeter(){return 2 * radius * Math.PI;};//methods
	public double getArea(){return Math.pow(radius, 2) * Math.PI;};

}
