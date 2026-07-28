import java.util.*;
class TestStr6
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		String str;
		System.out.print("Enter the String:");
		str = sc.nextLine();

		int i , c = 0;
		char ch;
		for ( i = 0 ; i < str.length() ; i++ )
		{
			ch = str.charAt(i);
			
			if ( ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'||
				ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
			{
				c++;
			}
		}
			System.out.println("Number of Vowels present String :" + c );
	}
}