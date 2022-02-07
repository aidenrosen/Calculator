import java.util.Scanner;

public class Calculator
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter 2 numbers to add together.");
		Double x = in.nextDouble();
		Double y = in.nextDouble();
		System.out.println("What operation would you like to perform?  Enter the number next to the corresponding information");
		System.out.println("1. Add");
		System.out.println("2. Subtract");
		System.out.println("3. Multiply");
		System.out.println("4. Divide");
		switch (in.nextInt())
		{
			case 1:
				System.out.println(x+y);
				break;
			case 2:
				System.out.println(x - y);
				break;
			case 3:
				System.out.println(x*y);
				break;
			case 4:
				System.out.println(x/y);
				break;
			default:
				System.out.println("Invalid response");
				break;
		}
	}
}
