import java.util.*;
class if_else 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		int a;
		System.out.print("Enter the Number:");
		a = sc.nextInt();

		if(a % 2 == 0)
		{
			System.out.println("The given number is Even Number");
		}
		else
			{
			System.out.println("The given number is Odd Number");
			}
	}
}
