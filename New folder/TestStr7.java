import java.util.*;
class TestStr7
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		String s1 , s2 ;
		System.out.print("Enter the String - 1:");
		s1 = sc.nextLine();
		System.out.print("Enter the String - 2:");
		s2 = sc.nextLine();

		int c = 0;
		c = s1.compareToIgnoreCase(s2);
		System.out.println("Ascci Difference :" + c );
		if ( c == 0 )
		{
			System.out.println("The given two Strings are equal");
		}
		else if ( c > 0)
		{
			System.out.println("2nd String is > 1st String");
		}
	}
}