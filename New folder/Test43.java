import java.util.*;
class Test43
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		int age,income;
		System.out.print("Enter your Age:");
		age = sc.nextInt();

		System.out.print("Enter your Monthly Income:");
		income = sc.nextInt();

		if(age >= 21)
		{
			if (income >= 30000)
			{
				System.out.println("Your are Eligible for the Loan");
			}
			else
			{
				System.out.println("Income insufficient for Loan Eligibility");
			}
		}
		else
		{
			System.out.println("Your are Not-Eligible for the Loan");
		}
	}
}