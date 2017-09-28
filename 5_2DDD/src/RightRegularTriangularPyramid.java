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
