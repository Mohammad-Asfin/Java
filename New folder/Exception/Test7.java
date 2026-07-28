import java.util.*;
class Test7
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		try
		{
			int a,b,c;
		
			System.out.print("Enter the 1st Number :");
			a = sc.nextInt();
		
			System.out.print("Enter the 2st Number :");
			b = sc.nextInt();
		
			c = a / b;  // ⚠️ risky line (possible division by zero)
		
			System.out.println("Result: " + c);
		}
	
		catch (ArithmeticException obj) 
		{
			System.out.println("You must enter 2nd > zero.");
		}
		
		finally
		{
			System.out.println("✨-----Thank You-----✨");
		}
	}
}	