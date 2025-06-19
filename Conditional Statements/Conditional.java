import java.util.*;
class Conditional
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		int n;
		System.out.print("Enter the Day Number:");
		n = sc.nextInt();

		String result;
		result = (n % 2 == 0) ? "Even Number" : "Odd Number";
		System.out.println("The given Number is " + result);
	}
}