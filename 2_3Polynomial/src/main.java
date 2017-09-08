
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter parameters of polynomial");
		System.out.println("");
	}
	
	public static double[] quadratic(double a, double b, double c)
	{
		double[] roots = new double[2];
		
		roots[0] = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
		roots[1] = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
		
		return roots;
	}

}
