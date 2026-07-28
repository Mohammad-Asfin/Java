import java.util.*;
class Test4
{
	public static void main(String[]args)
	{
		// Create Scanner object for taking input
		Scanner sc = new Scanner(System.in);
		
		try
		{
			int a,b,c;
		
			System.out.print("Enter the 1st Number :");
			a = sc.nextInt();
		
			System.out.print("Enter the 2st Number :");
			b = sc.nextInt();
		
			c = a / b;
		
			System.out.println("Result: " + c);
		}
	
		catch (ArithmeticException obj) 
		{
			// This block will run if user enters b = 0
			System.out.println("You must enter 2nd > zero.");
		}
	}
}	