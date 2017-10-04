//Project Name: 6_2Windows
//File Name: Rectangle.java
public class Rectangle {
	private double width;
	private double length;
	private Point position = new Point();
	
	public Rectangle(){width = 0; length = 0;};
	public Rectangle(double w, double l, double x, double y){width = w; length = l; position.x = x; position.y = y;};
	
	public double getWidth(){return width;};
	public double getLength(){return length;};
	public Point getPosition(){return position;};
	
	public void clicked(Point cursor){position.x = cursor.x; position.y = cursor.y;};
	
}
