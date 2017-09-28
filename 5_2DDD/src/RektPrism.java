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
