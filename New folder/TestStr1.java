import java.util.*;
class TestStr1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		String [ ]s = new String[5];
		int i;
		for (i = 0 ; i < 5 ; i++ )
		{
			System.out.print("Enter the string:");
			s[i] = sc.next();
		}
		System.out.println("The given string are:");
		for ( i = 0 ; i < 5 ; i++ )
		{
			System.out.println(s[i]);
		}
	}
}
