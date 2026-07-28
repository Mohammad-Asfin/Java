import java.util.*;
class Test3
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the 1st Number :");
		int num1 = sc.nextInt();
		
		System.out.print("Enter the 2st Number :");
		int num2 = sc.nextInt();
		
		if(num2 == 0)
		{
			System.out.println("Error: Division by zero is not allowed.");
		}
		else
		{
			int result = num1 / num2;
			System.out.println("Result: " + result);
		}
	}
}	