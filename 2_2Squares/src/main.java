import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int firstDif = 3;
		int outputNum = 1;
		
		Scanner console = new Scanner(System.in);
		
		int desiredNum = console.nextInt();
		
		console.close();
		
		for(int i = 1; i <= desiredNum; i++)
		{
			System.out.println(outputNum);
			outputNum += firstDif;
			firstDif += 2;
		}
		
	}

}
