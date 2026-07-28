import java.util.*;
class Test5
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
		
			c = a / b;
		
			System.out.println("Result: " + c);
		}
	
		catch (ArithmeticException obj) 
		{
			obj.printStackTrace();
			System.out.println("-------------------------------------------");
			System.out.println("Exception Information: " + obj.getMessage());
		}
	}
}	