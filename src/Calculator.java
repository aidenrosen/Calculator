import java.util.Scanner;

public class Calculator
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter 2 integers to add together.");
		int x = in.nextInt();
		int y = in.nextInt();
		System.out.println(x+y);
	}
}
