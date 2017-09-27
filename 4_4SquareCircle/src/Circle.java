
public class Circle {
	private double radius;
	
	public Circle(){radius = 1;};
	public Circle(float r){radius = r;};
	public double perimeter(){return 2 * radius * Math.PI;};
	public double area(){return Math.pow(radius, 2) * Math.PI;};

}
