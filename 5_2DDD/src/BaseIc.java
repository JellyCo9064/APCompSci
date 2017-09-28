//Project Name: 5_2DDD
//File Name: BaseIc.java
public abstract class BaseIc implements Shape{
	private double height;
	
	public BaseIc(double h){height = h;};
	
	public abstract double getBaseArea();
	public double getVolume(){return getBaseArea() * height;};
	public double getHeight() {return height;};
}
