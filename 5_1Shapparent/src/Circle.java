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
