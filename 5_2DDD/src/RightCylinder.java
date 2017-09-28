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
