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
