//Project Name: 5_2DDD
//File Name: Sphere.java
public class Sphere implements Shape{
	private double radius;
	
	public Sphere() {radius = 1;};
	public Sphere(double r) {radius = r;};
	
	public double getVolume() {return (4 / 3) * Math.PI * radius * radius * radius;};
	public double getSurfaceArea() {return 4 * Math.PI * radius * radius;};
}
