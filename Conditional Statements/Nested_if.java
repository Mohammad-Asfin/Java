import java.util.*;
class Nested_if
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		int marks;
		System.out.print("Enter your Marks:");
		marks = sc.nextInt();

		if(marks >= 50)
		{
			if (marks >= 90)
			{
				System.out.println("Grade : A");
			}
			else
			{
				System.out.println("Grade : B");
			}
		}
		else
		{
			System.out.println("Grade : F");
		}
	}
}
