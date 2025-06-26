import java.util.*;
class ReverseString
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		String sname;
		System.out.print("Enter the Student Name:");
		sname = sc.nextLine();

		System.out.println("The given name is :" + sname);

		System.out.print("The Reverse String : ");

		for ( int i = sname.length() - 1 ; i >= 0 ; i-- )
		{
			System.out.print(sname.charAt(i));
		}
	}
}