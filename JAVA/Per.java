import java.util.*;
public class Per
{
	public static void main(String [ ] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the 1st Number :");
		int a = sc.nextInt();

		System.out.print("Enter the 2nd Number :");
		int b = sc.nextInt();

		System.out.println("Result :" + ( a % b ) );
	}
}