/*
 * Author: Connor Aksama
 * Project Name: 5_2DDD
 * File Name: main.java
 * Purpose: INHERITANCE
 * Pseudocode: Interface for volume, SA -> implemented by abstract baseic class, extended by specific figures.
 * Maintenance Log: 9/27 Done
 */
import java.util.*;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console = new Scanner(System.in);
		
		System.out.println("Enter Rectangular Prism Length: ");
		double rktLength = console.nextDouble();
		System.out.println("Enter Rectangular Prism Width: ");
		double rktWidth = console.nextDouble();
		System.out.println("Enter Rectangular Prism Height");
		RektPrism rekt = new RektPrism(rktLength, rktWidth, console.nextDouble());
		
		System.out.println("\tVolume: " + rekt.getVolume());
		System.out.println("\tSurface Area: " + rekt.getSurfaceArea() + "\n");
		
		System.out.println("Enter Cylinder Radius: ");
		double cylRadius = console.nextDouble();
		System.out.println("Enter Cylinder Height: ");
		RightCylinder cyl = new RightCylinder(cylRadius, console.nextDouble());
		
		System.out.println("\tVolume: " + cyl.getVolume());
		System.out.println("\tSurface Area: " + cyl.getSurfaceArea());
		
		System.out.println("Enter Triangular Pyramid Base Side Length: ");
		double tetraSide = console.nextDouble();
		System.out.println("Enter Triangular Pyramid Height: ");
		RightRegularTriangularPyramid tetra = new RightRegularTriangularPyramid(tetraSide, console.nextDouble());		
		
		//HELLO :)
		
		System.out.println("\tVolume: " + tetra.getVolume());
		System.out.println("\tSurface Area: " + tetra.getSurfaceArea());
		
		System.out.println("Enter Square Pyramid Base Side Length: ");
		double sqpSide = console.nextDouble();
		System.out.println("Enter Square Pyramid Height: ");
		RightSquarePyramid sqp = new RightSquarePyramid(sqpSide, console.nextDouble());
		
		System.out.println("\tVolume: " + sqp.getVolume());
		System.out.println("\tSurface Area: " + sqp.getSurfaceArea());

		System.out.println("Enter Cone Radius: ");
		double cnRadius = console.nextDouble();
		System.out.println("Enter Cone Height: ");
		RightCone cn = new RightCone(cnRadius, console.nextDouble());
		
		System.out.println("\tVolume: " + cn.getVolume());
		System.out.println("\tSurface Area: " + cn.getSurfaceArea());
		
		System.out.println("Enter Sphere Radius: ");
		Sphere sph = new Sphere(console.nextDouble());
		
		System.out.println("\tVolume: " + sph.getVolume());
		System.out.println("\tSurface Area: " + sph.getSurfaceArea());
		
		console.close();
		
	}

}
/*
 * //Project Name: 5_2DDD
//File Name: Shape.java
public interface Shape {
	public double getVolume();
	public double getSurfaceArea();
}

//Project Name: 5_2DDD
//File Name: BaseIc.java
public abstract class BaseIc implements Shape{
	private double height;
	
	public BaseIc(double h){height = h;};
	
	public abstract double getBaseArea();
	public double getVolume(){return getBaseArea() * height;};
	public double getHeight() {return height;};
}

//Project Name: 5_2DDD
//File Name: RektPrism.java
public class RektPrism extends BaseIc{
	private double width;
	private double length;
	
	public RektPrism() {super(1); width = 1; length = 1;};
	public RektPrism(double w, double l, double h) {super(h); width = w; length = l;};
	
	public double getBaseArea() {return width * length;};
	public double getVolume() {return super.getVolume();}
	public double getSurfaceArea() {return 2 * width * length + 2 * width * super.getHeight() + 2 * length * super.getHeight(); };
}

//Project Name: 5_2DDD
//File Name: RightCylinder.java
public class RightCylinder extends BaseIc{
	private double radius;
	
	public RightCylinder() {super(1); radius = 1;};
	public RightCylinder(double r, double h) {super(h); radius = r;};
	
	public double getBaseArea() {return Math.PI * radius * radius;};
	public double getVolume() {return super.getVolume();};
	public double getSurfaceArea() {return this.getBaseArea() * 2 + Math.PI * 2 * radius * super.getHeight();};
	
}

//Project Name: 5_2DDD
//File Name: RegularTetrahedron.java
public class RightRegularTriangularPyramid extends BaseIc{
	private double a;
	private double b;
	private double c;
	
	public RightRegularTriangularPyramid() {super(1); a = 1; b = 1; c = 1;};
	public RightRegularTriangularPyramid(double d, double h) {super(h); a = d; b = d; c = d;};
	
	public double getBaseArea()
	{
		double s = (a + b + c) / 2;
		return Math.sqrt(s * (s - a) * s * (s - b) * s * (s - c));
	}
	public double getVolume() {return super.getVolume() * ((double)1 / (double)3);};
	public double getSurfaceArea() {return this.getBaseArea() * 4;};
	
}

//Project Name: 5_2DDD
//File Name: RigthSquarePyramid.java
public class RightSquarePyramid extends BaseIc{
	private double baseLength;
	
	public RightSquarePyramid() {super(1); baseLength = 1;};
	public RightSquarePyramid(double l, double h) {super(h); baseLength = l;};
	
	public double getBaseArea() {return baseLength * baseLength;};
	public double getVolume() {return super.getVolume() * ((double)1 / (double)3);};
	public double getSurfaceArea()
	{
		double s = Math.sqrt(baseLength * baseLength + super.getHeight() * super.getHeight());
		return this.getBaseArea() + 2 * s * baseLength;
	}
}

//Project Name: 5_2DDD
//File Name: RightCone.java
public class RightCone extends BaseIc{
	private double radius;
	
	public RightCone() {super(1); radius = 1;};
	public RightCone(double r, double h) {super(h); radius = r;};
	
	public double getBaseArea() {return Math.PI * radius * radius;};
	public double getVolume() {return super.getVolume() * ((double)1 / (double)3);};
	public double getSurfaceArea() {return this.getBaseArea() + Math.PI * radius * (Math.sqrt(radius * radius + super.getHeight() * super.getHeight()));};
	
}

//Project Name: 5_2DDD
//File Name: Sphere.java
public class Sphere implements Shape{
	private double radius;
	
	public Sphere() {radius = 1;};
	public Sphere(double r) {radius = r;};
	
	public double getVolume() {return ((double)4 / (double)3) * Math.PI * radius * radius * radius;};
	public double getSurfaceArea() {return 4 * Math.PI * radius * radius;};
}

 */