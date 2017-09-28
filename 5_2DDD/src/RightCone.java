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
