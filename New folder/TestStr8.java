import java.util.*;
class TestStr8
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		String s1 , s2 ;
		System.out.print("Enter the String - 1:");
		s1 = sc.nextLine();
		System.out.print("Enter the String - 2:");
		s2 = sc.nextLine();

		boolean x;
		x = s1.equals(s2);  //x = s1.equalsIgnoreCase(s2);

		if ( x == true )
		{
			System.out.println("The given two Strings are Equal");
		}
		else
		{
			System.out.println("The given twoStrings are not equal");
		}
	}
}