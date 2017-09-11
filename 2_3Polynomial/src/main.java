import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner console = new Scanner(System.in);
		
		System.out.println("Enter parameters of polynomial");
		System.out.println("a: ");
		double a = console.nextDouble();
		System.out.println("b: ");
		double b = console.nextDouble();
		System.out.println("c: ");
		double c = console.nextDouble();
		
		double[] roots = quadratic(a, b, c);
		
		System.out.println(roots[0] + " and " + roots[1]);
		
	}
	
	public static double[] quadratic(double a, double b, double c)
	{
		double[] roots = new double[2];
		
		roots[0] = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
		roots[1] = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
		
		return roots;
	}

}
